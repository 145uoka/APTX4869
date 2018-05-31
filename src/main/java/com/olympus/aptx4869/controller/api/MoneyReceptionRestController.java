package com.olympus.aptx4869.controller.api;

import java.util.ArrayList;
import java.util.List;

import org.dbflute.optional.OptionalEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.olympus.aptx4869.common.util.DateUtil;
import com.olympus.aptx4869.constants.LogMessageKeyConstants;
import com.olympus.aptx4869.constants.SystemCodeConstants.Flag;
import com.olympus.aptx4869.controller.BaseController;
import com.olympus.aptx4869.dbflute.exbhv.UserMBhv;
import com.olympus.aptx4869.dbflute.exentity.MoneyReception;
import com.olympus.aptx4869.dbflute.exentity.UserM;
import com.olympus.aptx4869.dto.MoneyReceptionDto;
import com.olympus.aptx4869.dto.api.ErrorInfo;
import com.olympus.aptx4869.dto.api.RestResultDto;
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

    Logger logger = LoggerFactory.getLogger(this.getClass());

    /** ログを扱う */
    @Autowired
    LoggerService loggerService;

    @Autowired
    GenreService genreService;

    @Autowired
    MoneyReceptionService moneyReceptionService;

    @Autowired
    UserMBhv userMBhv;

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
    public RestResultDto store(@RequestBody @Validated MoneyReceptionRestForm form, BindingResult bindingResult) {

        logger.debug("[START]" + form.toString());

        RestResultDto resultDto = new RestResultDto();

        try {

        Integer userId = null;
        if (!bindingResult.hasErrors()) {
            // LINE IDに紐づくユーザの検索
            OptionalEntity<UserM> userM = userMBhv.selectEntity(cb->{
                cb.query().setLineId_Equal(form.getLineId());;
            });

            if (userM.isPresent()) {
                userId = userM.get().getUserId();
            } else {
                bindingResult.rejectValue("lineId", null, "This lineId is not exsits user");
            }
        }

        // validation確認
        if (bindingResult.hasErrors()) {
            List<ErrorInfo> errorInfoList = new ArrayList<ErrorInfo>();
            for (ObjectError error : bindingResult.getAllErrors()) {
                ErrorInfo errorInfo = new ErrorInfo();
                errorInfo.setProperty(error.getObjectName());
                errorInfo.setDescription(error.getDefaultMessage());
                errorInfoList.add(errorInfo);
            }

            resultDto.setSuccessFlag(false);
            if (!CollectionUtils.isEmpty(errorInfoList)) {
                resultDto.setErrorInfo(errorInfoList);
            }
            return resultDto;
        }

        // 登録処理
        MoneyReceptionDto dto = new MoneyReceptionDto();
        convertMoneyReseptionFromToDto(form, dto, userId);

        MoneyReception moneyReceptionEntity = moneyReceptionService.store(dto);

        // 登録処理ログ出力
        loggerService.outLog(LogMessageKeyConstants.Info.I_99_0004,
                new Object[]{"金銭授受", moneyReceptionEntity.getMoneyReceptionId()});

        resultDto.setSuccessFlag(true);

        } catch (Exception e) {
            // システムエラー
            List<ErrorInfo> errorInfoList = new ArrayList<ErrorInfo>();
                ErrorInfo errorInfo = new ErrorInfo();
                errorInfo.setProperty("unknown");
                errorInfo.setDescription(e.getMessage());
                errorInfoList.add(errorInfo);
            resultDto.setSuccessFlag(false);
            resultDto.setErrorInfo(errorInfoList);
        }

        logger.debug("[END]" + resultDto.toString());

        return resultDto;
    }


    /**
     * moneyReseptionFromからdtoを作成する．
     *
     * @param form
     * @param dto
     */
    private void convertMoneyReseptionFromToDto(MoneyReceptionRestForm form, MoneyReceptionDto dto, Integer userId) {
        dto.setUserId(userId);
        Flag moneyReceptionFlag = Flag.getFlagByStringValue(form.getMoneyReceptionFlag());
        dto.setMoneyReceptionFlag(moneyReceptionFlag.isBoolValue());
        dto.setGenreId(Integer.parseInt(form.getGenreId()));
        dto.setAmount(Integer.parseInt(form.getAmount()));
        dto.setSupplement(form.getSupplement());
        dto.setMoneyReceptionDate(DateUtil.convertToLocalDateOrNull(form.getMoneyReceptionDate()));
    }

}
