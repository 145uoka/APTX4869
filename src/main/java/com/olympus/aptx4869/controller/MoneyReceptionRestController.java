package com.olympus.aptx4869.controller;

import java.util.List;
import java.util.Locale;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
import com.olympus.aptx4869.constants.SystemCodeConstants;
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
     * 金銭授受登録処理用コントローラー．
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
    public ResultDto store(@RequestBody MoneyReceptionRestForm form, BindingResult bindingResult,
            Locale locale, Model model, RedirectAttributes redirectAttributes) {

        // form情報をModelへ格納
        model.addAttribute("form", form);

        if(StringUtils.isNotEmpty(form.getMoneyReceptionDate())){
            if(!DateUtil.isValidDateFormat(form.getMoneyReceptionDate())){
                //日付に変換できなければ、エラー
                String message = messageSource.getMessage(
                        MessageKeyUtil.encloseStringDelete(MessageKeyConstants.CustomValidators.DATEFORMAT_MESSAGE),
                        new Object[]{DateUtil.DATE_TIME_FORMAT_YYYYMM}, Locale.getDefault());
                bindingResult.rejectValue("moneyReceptionDate",null, null, message);
            }
        }

        // validation確認
        if (bindingResult.hasErrors()) {

            // エラーメッセージをform:errorsに格納。
            model.addAttribute("errors", bindingResult);

            // プルダウンをエラー後も表示する。
            List<LabelValueDto> selectGenreList = genreService.createSelectGenreList(true, SystemCodeConstants.PLEASE_SELECT_MSG);
            model.addAttribute("selectGenreList", selectGenreList);

            // 入力エラーが存在すれば、登録画面を再描画
            ResultDto resultDto = new ResultDto();
            resultDto.setProcessingFlag(false);
            return resultDto;
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
        ResultDto resultDto = new ResultDto();
        return resultDto;
    }


    /**
     * moneyReseptionFromからdtoを作成する．
     *
     * @param form
     * @param dto
     */
    private void convertMoneyReseptionFromToDto(MoneyReceptionRestForm form, MoneyReceptionDto dto) {

        BeanUtils.copyProperties(form, dto);

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
        dto.setMoneyReceptionDate(DateUtil.convertToLocalDateOrNull(form.getMoneyReceptionDate()));
    }

}
