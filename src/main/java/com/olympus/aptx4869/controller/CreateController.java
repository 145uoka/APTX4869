package com.olympus.aptx4869.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.olympus.aptx4869.common.util.DateUtil;
import com.olympus.aptx4869.common.util.MessageKeyUtil;
import com.olympus.aptx4869.constants.MessageKeyConstants;
import com.olympus.aptx4869.constants.SystemCodeConstants;
import com.olympus.aptx4869.constants.SystemCodeConstants.MessageType;
import com.olympus.aptx4869.dto.LabelValueDto;
import com.olympus.aptx4869.dto.MoneyReceptionCreateDto;
import com.olympus.aptx4869.form.MoneyReceptionCreateForm;
import com.olympus.aptx4869.service.GenreService;
import com.olympus.aptx4869.service.LoggerService;

/**
 * 支出・収入登録画面のコントローラー．
 *
 * @author hasegawa_m
 *
 */
@Controller
public class CreateController extends BaseController{

	/** ログを扱う */
	@Autowired
	LoggerService loggerService;

	@Autowired
	GenreService genreService;



	/**
	 * 金銭支出登録画面の初期表示．
	 * @param locale locale
	 * @param model model
	 * @return 登録画面
	 */
	@RequestMapping(value = "/moneyReception/create", method = {RequestMethod.GET, RequestMethod.POST})
	public String detail(Locale locale, Model model){

	    MoneyReceptionCreateForm form = new MoneyReceptionCreateForm();

        // プルダウンを表示する。
        List<LabelValueDto> selectGenreList = genreService.createSelectGenreList(true, SystemCodeConstants.PLEASE_SELECT_MSG);
        model.addAttribute("selectGenreList", selectGenreList);

        // form情報をModelへ格納。
        model.addAttribute("form", form);

		return "/challenge/create";
	}

	/**
     * 金銭支出登録処理用コントローラ。
     *
     * @param form 登録情報フォーム
     * @param bindingResult 入力エラー情報
     * @param locale Locale情報
     * @param model Model
     * @param redirectAttributes リダイレクト先に送るオブジェクト情報
     * @return 正常終了:検索画面, エラー有:登録画面
     */
    @RequestMapping(value = "/event/store", method = RequestMethod.POST)
    public String storeEvent(@Validated @ModelAttribute("form") MoneyReceptionCreateForm form, BindingResult bindingResult,
            Locale locale, Model model, RedirectAttributes redirectAttributes) {

        // form情報をModelへ格納
        model.addAttribute("form", form);

        if(!DateUtil.isValidDateFormat(form.getMoneyReceptionDate())){
           //日付に変換できなければ、エラー
            String message = messageSource.getMessage(
                    MessageKeyUtil.encloseStringDelete(MessageKeyConstants.CustomValidators.DATEFORMAT_MESSAGE),
                    new Object[]{DateUtil.DATE_TIME_FORMAT_YYYYMM}, Locale.getDefault());
            bindingResult.rejectValue("moneyReceptionDate",null, null, message);
        }

        // validation確認
        if (bindingResult.hasErrors()) {

            // エラーメッセージをform:errorsに格納。
            model.addAttribute("errors", bindingResult);

            // プルダウンをエラー後も表示する。
            List<LabelValueDto> selectGenreList = genreService.createSelectGenreList(true, SystemCodeConstants.PLEASE_SELECT_MSG);
            model.addAttribute("selectGenreList", selectGenreList);

            // 入力エラーが存在すれば、登録画面を再描画
            return "/moneyReception/create";
        }

        // 登録処理
        MoneyReceptionCreateDto dto = new MoneyReceptionCreateDto();
        BeanUtils.copyProperties(form, dto);

        if(form.getMoneyReceptionFlag().equals("spending")){
            dto.setMoneyReceptionFlag(true);
        }else if(form.getMoneyReceptionFlag().equals("income")){
            dto.setMoneyReceptionFlag(false);
        }

        dto.setMoneyReceptionDate(DateUtil.convertToLocalDate(form.getMoneyReceptionDate()));

        //Event eventEntity = eventService.insert(dto);

        // 登録処理ログ出力
        //loggerService.outLog("I_99_0001", new Object[]{"イベント", eventEntity.getEventId(), eventEntity.getEventName()});

        // 登録完了メッセージを表示。
        String message = messageSource.getMessage(
                MessageKeyUtil.encloseStringDelete(MessageKeyConstants.Success.CREATE), null, Locale.getDefault());

        List<String> successMessageList = new ArrayList<String>(Arrays.asList(message));
        redirectAttributes.addFlashAttribute(MessageType.SUCCESS, successMessageList);

        // 登録完了後、イベント詳細画面へ遷移。
        return "redirect:/money/detail";
    }

}
