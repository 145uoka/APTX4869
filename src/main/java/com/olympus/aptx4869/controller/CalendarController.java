package com.olympus.aptx4869.controller;

import java.util.Locale;

import org.dbflute.optional.OptionalEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.olympus.aptx4869.constants.LogMessageKeyConstants;
import com.olympus.aptx4869.dbflute.exentity.UserM;
import com.olympus.aptx4869.exception.NotFoundRecordException;
import com.olympus.aptx4869.form.CalendarForm;
import com.olympus.aptx4869.service.LoggerService;
import com.olympus.aptx4869.service.MoneyReceptionService;
import com.olympus.aptx4869.service.UserService;

/**
 * カレンダー画面のコントローラー．
 *
 * @author hasegawa_m
 *
 */
@Controller
public class CalendarController extends BaseController{

    /** ログを扱う */
    @Autowired
    LoggerService loggerService;

    @Autowired
    MoneyReceptionService moneyReceptionService;

    @Autowired
    UserService userService;


	/**
	 * カレンダー画面の初期表示コントローラー．
	 * @param locale locale
	 * @param model model
	 * @return カレンダー画面
	 * @throws NotFoundRecordException レコード取得エラー
	 */
	@RequestMapping(value = "/householdAccount/calendar/{paramLineId}", method = {RequestMethod.GET, RequestMethod.POST})
	public String create(@PathVariable String paramLineId, Locale locale, Model model) throws NotFoundRecordException{

        OptionalEntity<UserM> userMOptionalEntity = userService.findUserMEntity(paramLineId);

        if(!userMOptionalEntity.isPresent()){
            // 該当するテーブル情報がなければ、レコード取得エラー。
            loggerService.outLog(LogMessageKeyConstants.Warn.W_99_0001, new Object[]{"ユーザーマスタ", paramLineId});
            throw new NotFoundRecordException();
        }

        UserM userMEntity = userMOptionalEntity.get();

        CalendarForm form = new CalendarForm();
	    //ラインIDより、ユーザーIDを取得。
	    form.setUserId(String.valueOf(userMEntity.getUserId()));
	    form.setLineId(paramLineId);


	    form.setIncome("50000");
	    form.setSpending("1000");
	    form.setRegularlyIncome("1000");
	    form.setRegularlySpending("2000");
	    form.setBalance("900");
	    form.setEstimate("1500");
	    form.setRemainingBudget("1500");


        // form情報をModelへ格納。
        model.addAttribute("form", form);

		return "money/calendar";
	}

}
