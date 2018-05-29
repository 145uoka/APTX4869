package com.olympus.aptx4869.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.dbflute.optional.OptionalEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.olympus.aptx4869.common.util.DateUtil;
import com.olympus.aptx4869.common.util.MessageKeyUtil;
import com.olympus.aptx4869.constants.LogMessageKeyConstants;
import com.olympus.aptx4869.constants.MessageKeyConstants;
import com.olympus.aptx4869.constants.SystemCodeConstants;
import com.olympus.aptx4869.constants.SystemCodeConstants.MessageType;
import com.olympus.aptx4869.dbflute.exentity.MoneyReception;
import com.olympus.aptx4869.dbflute.exentity.UserM;
import com.olympus.aptx4869.dto.LabelValueDto;
import com.olympus.aptx4869.dto.MoneyReceptionCreateDto;
import com.olympus.aptx4869.exception.NotFoundRecordException;
import com.olympus.aptx4869.form.MoneyReceptionCreateForm;
import com.olympus.aptx4869.service.GenreService;
import com.olympus.aptx4869.service.LoggerService;
import com.olympus.aptx4869.service.MoneyReceptionService;

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

    @Autowired
    MoneyReceptionService moneyReceptionService;



	/**
	 * 金銭支出登録画面の初期表示．
	 * @param locale locale
	 * @param model model
	 * @return 登録画面
	 * @throws NotFoundRecordException
	 */
	@RequestMapping(value = "/moneyReception/create/{paramUserId}", method = {RequestMethod.GET, RequestMethod.POST})
	public String detail(@PathVariable String paramUserId, Locale locale, Model model) throws NotFoundRecordException{

        Integer userId = Integer.parseInt(paramUserId);
        OptionalEntity<UserM> userMEntity = moneyReceptionService.findUserMEntity(userId);

        if(!userMEntity.isPresent()){
            // 該当するテーブル情報がなければ、レコード取得エラー。
            loggerService.outLog(LogMessageKeyConstants.Warn.W_99_0001, new Object[]{"ユーザーマスタ", userId});
            throw new NotFoundRecordException();
        }

	    MoneyReceptionCreateForm form = new MoneyReceptionCreateForm();
	    form.setUserId(paramUserId);

        // プルダウンを表示する。
        List<LabelValueDto> selectGenreList = genreService.createSelectGenreList(true, SystemCodeConstants.PLEASE_SELECT_MSG);
        model.addAttribute("selectGenreList", selectGenreList);

        // form情報をModelへ格納。
        model.addAttribute("form", form);

		return "/create";
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
    @RequestMapping(value = "/moneyReception/store", method = RequestMethod.POST)
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
            dto.setMoneyReceptionFlag(false);

        }else if(form.getMoneyReceptionFlag().equals("income")){
            dto.setMoneyReceptionFlag(true);
        }

        dto.setUserId(Integer.parseInt(form.getUserId()));
        dto.setGenreId(Integer.parseInt(form.getGenreId()));
        dto.setAmount(Integer.parseInt(form.getAmount()));
        dto.setMoneyReceptionDate(DateUtil.convertToLocalDate(form.getMoneyReceptionDate()));

        MoneyReception moneyReceptionEntity = moneyReceptionService.store(dto);

        // 登録処理ログ出力
        loggerService.outLog(LogMessageKeyConstants.Info.I_99_0004,
                new Object[]{"金銭授受", moneyReceptionEntity.getMoneyReceptionId()});

        // 登録完了メッセージを表示。
        String message = messageSource.getMessage(
                MessageKeyUtil.encloseStringDelete(MessageKeyConstants.Success.CREATE), null, Locale.getDefault());

        List<String> successMessageList = new ArrayList<String>(Arrays.asList(message));
        redirectAttributes.addFlashAttribute(MessageType.SUCCESS, successMessageList);

        // 登録完了後、イベント詳細画面へ遷移。
        return "redirect:/money/detail";
    }

}
