package com.olympus.aptx4869.controller;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.olympus.aptx4869.common.util.MessageKeyUtil;
import com.olympus.aptx4869.constants.LogMessageKeyConstants;
import com.olympus.aptx4869.constants.MessageKeyConstants;
import com.olympus.aptx4869.constants.SystemCodeConstants.MessageType;
import com.olympus.aptx4869.constants.SystemCodeConstants.PATTERN;
import com.olympus.aptx4869.constants.SystemCodeConstants.RegularlyMoney;
import com.olympus.aptx4869.dbflute.exentity.RegularlyData;
import com.olympus.aptx4869.dto.LoginUserDto;
import com.olympus.aptx4869.dto.RegularlyDto;
import com.olympus.aptx4869.exception.NotLoginException;
import com.olympus.aptx4869.form.RegularlyForm;
import com.olympus.aptx4869.service.AccountingDate;
import com.olympus.aptx4869.service.LoggerService;
import com.olympus.aptx4869.service.RegularlyService;


/**
 * 定期支出コントローラー
 * @author tokuno_a
 *
 */
@Controller
public class RegularlyController {
	/** ログを扱う */
    @Autowired
    LoggerService loggerService;
	@Autowired
	MessageSource messageSource;
	@Autowired
	RegularlyService regularlyService;
	@Autowired
	LoginUserDto loginUserDto;


	@ModelAttribute("lastDayOfMonth")
	int lastDay(){
		LocalDate lastDayOfMonth = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth()); // 末日
		return lastDayOfMonth.getDayOfMonth();
	}

	@ModelAttribute("regularlyList")
	List<RegularlyDto> regularlyList() throws NotLoginException{
		if(loginUserDto.getUserId() == null){
			throw new NotLoginException();
		}
		int userId = loginUserDto.getUserId();
		return regularlyService.findRegularly(userId);
	}

	/**
	 *アカウント初期画面
	 * @param model モデル
	 * @return アカウント画面
	 */
	@RequestMapping(value = "/regularly", method = {RequestMethod.GET})
	public String regularly(Model model){
		List<AccountingDate> accountingDateList = regularlyService.accountingDate();
		model.addAttribute("list",accountingDateList);

		int userId = loginUserDto.getUserId();
		RegularlyForm form = new RegularlyForm();
		form.setUserId(Integer.toString(userId));
		model.addAttribute("form",form);



		return "money/regularly";
	}

	/**
     * 定期支出登録処理用コントローラー．
     *
     * @param form 登録情報フォーム
     * @param bindingResult 入力エラー情報
     * @param locale Locale情報
     * @param model Model
     * @param redirectAttributes リダイレクト先に送るオブジェクト情報
     * @return 正常終了:詳細画面, エラー有:登録画面
     */
    @RequestMapping(value = "/regularly/store", method = RequestMethod.POST)
    public String store(@Validated @ModelAttribute("form") RegularlyForm form, BindingResult bindingResult,
            Locale locale, Model model, RedirectAttributes redirectAttributes) {

    	List<AccountingDate> accountingDateList = regularlyService.accountingDate();
		model.addAttribute("list",accountingDateList);

        // form情報をModelへ格納
        model.addAttribute("form", form);

        ArrayList<String> errorMsgList = new ArrayList<String>();

        for(int i = 0; i < RegularlyMoney.REGULARLY_MONEY_RECORD; i++){

            if(StringUtils.isEmpty(form.getAccountingDate()[i]) && StringUtils.isEmpty(form.getAmount()[i])){
                //日付と金額が未入力であれば、スキップ。
                continue;
            }

            if((StringUtils.isNotEmpty(form.getAccountingDate()[i]) && Integer.parseInt(form.getAccountingDate()[i]) == 0) && StringUtils.isNotEmpty(form.getAmount()[i])
                    || ((StringUtils.isNotEmpty(form.getAccountingDate()[i]) && Integer.parseInt(form.getAccountingDate()[i]) != 0) && StringUtils.isEmpty(form.getAmount()[i]))){

              //日付と金額のどちらか一方が未入力であれば、エラー。
                bindingResult.rejectValue("accountingDate["+i+"]", null, null, null);
                bindingResult.rejectValue("amount["+i+"]", null, null, null);
                String message = messageSource.getMessage(
                        MessageKeyUtil.encloseStringDelete(MessageKeyConstants.GlueNetValidator.NOTEMPTY_WITH_ITEM),
                        new Object[]{(i+1),"日付と金額の両方"}, Locale.getDefault());
                errorMsgList.add(message);

            }else if(StringUtils.isNotEmpty(form.getAccountingDate()[i]) && StringUtils.isNotEmpty(form.getAmount()[i])){

                //日付と金額のどちらも入力されている場合
                if(!form.getAmount()[i].matches(PATTERN.AMOUNT_PATTERN)){
                    //金額の入力形式が間違ってれば、エラー。
                    bindingResult.rejectValue("amount["+i+"]", null, null, null);
                    String message = messageSource.getMessage(
                            MessageKeyUtil.encloseStringDelete(MessageKeyConstants.GlueNetValidator.NOTAMOUNTPATTERN),
                            new Object[]{(i+1),"金額", "1234(カンマなし)"}, Locale.getDefault());
                    errorMsgList.add(message);
                }
            }
        }

        // validation確認
        if (bindingResult.hasErrors()) {

            // エラーメッセージをform:errorsに格納。
            model.addAttribute("errors", bindingResult);
            model.addAttribute(MessageType.ERROR, errorMsgList);
            int userId = loginUserDto.getUserId();
            form.setUserId(Integer.toString(userId));
            // 入力エラーが存在すれば、登録画面を再描画
            return "money/regularly";
        }

        // 登録処理
        List<RegularlyDto> dtoList = regularlyService.convertRegularly(form);
        List<RegularlyData> regularlyEntityList = regularlyService.register(dtoList);

        // 登録処理ログ出力
        loggerService.outLog(LogMessageKeyConstants.Info.I_99_0005,
                new Object[]{"定期支出", regularlyEntityList.size()});

        // 登録完了メッセージを表示。
//        String message = messageSource.getMessage(
//                MessageKeyUtil.encloseStringDelete(MessageKeyConstants.Success.CREATE), null, Locale.getDefault());
//
//        redirectAttributes.addFlashAttribute(MessageType.SUCCESS, message);

        // 詳細画面へ遷移。
        return "redirect:/";
    }

    @RequestMapping(value ="/regularly/delete/{paramPropertyId}", method = RequestMethod.POST)
    public String deleteRegularly(@PathVariable String paramPropertyId, Model model,
			 RedirectAttributes redirectAttributes){
    	int propertyId = Integer.parseInt(paramPropertyId);
    	regularlyService.logicalDeleteRegularly(propertyId);
    	return "redirect:/regularly";
    }





}
