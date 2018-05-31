package com.olympus.aptx4869.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.olympus.aptx4869.common.util.DateUtil;
import com.olympus.aptx4869.common.util.MessageKeyUtil;
import com.olympus.aptx4869.constants.LogMessageKeyConstants;
import com.olympus.aptx4869.constants.MessageKeyConstants;
import com.olympus.aptx4869.constants.SystemCodeConstants.MessageType;
import com.olympus.aptx4869.dbflute.exentity.MoneyReception;
import com.olympus.aptx4869.dto.LabelValueDto;
import com.olympus.aptx4869.dto.MoneyReceptionDto;
import com.olympus.aptx4869.dto.ResultDto;
import com.olympus.aptx4869.form.MoneyReceptionRestForm;
import com.olympus.aptx4869.service.GenreService;
import com.olympus.aptx4869.service.LoggerService;
import com.olympus.aptx4869.service.MoneyReceptionService;

/**
 * 支出・収入登録画面のコントローラー．
 *
 * @author hasegawa_m
 *
 */
@RestController
public class MoneyReceptionRestController extends BaseController{

    /** ログを扱う */
    @Autowired
    LoggerService loggerService;

    @Autowired
    GenreService genreService;

    @Autowired
    MoneyReceptionService moneyReceptionService;

	/**
     * API用：金銭授受登録処理用コントローラー．
     *
     * @param form 登録情報フォーム
     * @param bindingResult 入力エラー情報
     * @param locale Locale情報
     * @param model Model
     * @param redirectAttributes リダイレクト先に送るオブジェクト情報
     * @return 正常終了:詳細画面, エラー有:登録画面
     */
    @RequestMapping(value = "/api/moneyReception/store", method = RequestMethod.POST)
    @ResponseBody
    public boolean store(@RequestBody @Validated MoneyReceptionRestForm form, BindingResult bindingResult,
            Locale locale, Model model, RedirectAttributes redirectAttributes) {

        ResultDto resultDto = new ResultDto();

        // form情報をModelへ格納
        model.addAttribute("form", form);

        // validation確認
        if (bindingResult.hasErrors()) {

            // エラーメッセージをform:errorsに格納。
            model.addAttribute("errors", bindingResult);

         // 支出プルダウンを表示する。
            List<LabelValueDto> selectSpendingGenreList = genreService.createSelectGenreList(true, false);
            model.addAttribute("selectSpendingGenreList", selectSpendingGenreList);

            // 収入プルダウンを表示する。
            List<LabelValueDto> selectIncomeGenreList = genreService.createSelectGenreList(true, true);
            model.addAttribute("selectIncomeGenreList", selectIncomeGenreList);

            // 入力エラーが存在すれば、登録画面を再描画
            resultDto.setProcessingFlag(false);
            return resultDto.isProcessingFlag();
        }

        // 登録処理
        MoneyReceptionDto dto = new MoneyReceptionDto();
        convertMoneyReseptionFromToDto(form, dto);

        MoneyReception moneyReceptionEntity = moneyReceptionService.store(dto);

        // 登録処理ログ出力
        loggerService.outLog(LogMessageKeyConstants.Info.I_99_0004,
                new Object[]{"金銭授受", moneyReceptionEntity.getMoneyReceptionId()});

        // 登録完了メッセージを表示。
        String message = messageSource.getMessage(
                MessageKeyUtil.encloseStringDelete(MessageKeyConstants.Success.CREATE), null, Locale.getDefault());

        redirectAttributes.addFlashAttribute(MessageType.SUCCESS, message);

        // 登録完了後、詳細画面へ遷移。
        resultDto.setProcessingFlag(true);
        return resultDto.isProcessingFlag();
    }


    /**
     * moneyReseptionFromからdtoを作成する．
     *
     * @param form
     * @param dto
     */
    private void convertMoneyReseptionFromToDto(MoneyReceptionRestForm form, MoneyReceptionDto dto) {

        if(form.getMoneyReceptionFlag().equals("false")){
            //支出であれば、Flagはfalseをセット。
            dto.setMoneyReceptionFlag(false);

        }else if(form.getMoneyReceptionFlag().equals("true")){
          //収入であれば、Flagはtrueをセット。
            dto.setMoneyReceptionFlag(true);
        }

        dto.setUserId(Integer.parseInt(form.getUserId()));
        dto.setGenreId(Integer.parseInt(form.getGenreId()));
        dto.setAmount(Integer.parseInt(form.getAmount()));
        dto.setSupplement(form.getSupplement());
        dto.setMoneyReceptionDate(DateUtil.convertToLocalDateOrNull(form.getMoneyReceptionDate()));
    }

}
