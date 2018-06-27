package com.olympus.aptx4869.controller;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.olympus.aptx4869.dto.LoginUserDto;
import com.olympus.aptx4869.dto.SettlementDate;
import com.olympus.aptx4869.dto.UserPropertyDto;
import com.olympus.aptx4869.exception.NotLoginException;
import com.olympus.aptx4869.form.AccountForm;
import com.olympus.aptx4869.service.AccountService;
import com.olympus.aptx4869.service.UserPropertyService;

/**
 * @author tokuno_a
 *アカウントコントローラー画面
 */
@Controller
public class AccountController {

	@Autowired
	AccountService accountService;
	@Autowired
	UserPropertyService userPropertyService;
	@Autowired
	LoginUserDto loginUserDto;
	/** メッセージ出力サービス */
	@Autowired
	MessageSource messageSource;




	/**
	 *アカウント初期画面
	 * @param model モデル
	 * @return アカウント画面
	 * @throws NotLoginException
	 */
	@RequestMapping(value = "/account", method = {RequestMethod.GET})
	public String account(Model model) throws NotLoginException{
		if(loginUserDto.getUserId() == null){
			throw new NotLoginException();
		}

		AccountForm form = new AccountForm();
		List<SettlementDate> settlementDateList = accountService.settlementDate();
		model.addAttribute("list",settlementDateList);
		model.addAttribute("form",form);
		return "account";
	}

	/**
	 *アカウント登録処理
	 * @param form 入力後フォーム
	 * @param bindingResult 入力チェック
	 * @param model モデル
	 * @param redirectAttributes リダイレクト
	 * @return カレンダー画面にリダイレクト
	 * @throws NotLoginException
	 */
	@RequestMapping(value = "/registerAccount", method = {RequestMethod.POST})
	public String register(@Validated @ModelAttribute("form") AccountForm form, BindingResult bindingResult, Model model,
			RedirectAttributes redirectAttributes) throws NotLoginException {

		if(!StringUtils.isNumericSpace(form.getBudget())){
			// エラー文字をmessage.jspfファイルからとってくる
			bindingResult.rejectValue("budget", "error.budget");
		}

		if(Integer.parseInt(form.getSettlementDate()) == 0){
			// エラー文字をmessage.jspfファイルからとってくる
			bindingResult.rejectValue("settlementDate", "error.settlementDate");
		}

		// validation確認
		if (bindingResult.hasErrors()) {
			List<SettlementDate> settlementDateList = accountService.settlementDate();
			model.addAttribute("list",settlementDateList);
			// 入力後のエラーそのまま表示
			model.addAttribute("form", form);
			// エラー表示
			model.addAttribute("errors", bindingResult);

			return"account";
		}
		if(loginUserDto.getUserId() == null){
			throw new NotLoginException();
		}
		Integer userId = loginUserDto.getUserId();
		UserPropertyDto userPropertyDto = new UserPropertyDto(form);
		userPropertyDto.setUserId(userId);

		userPropertyService.registerUserProperty(userPropertyDto);

		// 登録完了メッセージ設定
		String infoMessage = messageSource.getMessage("info.event.insert", null, Locale.getDefault());

		// リダイレクト先に情報を保持
		redirectAttributes.addFlashAttribute("infoMessages", infoMessage);

		return "redirect:/calendar";
	}


}
