package com.olympus.aptx4869.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.olympus.aptx4869.service.LoggerService;

/**
 * 詳細画面のコントローラークラス
 * @author ito_mo
 *
 */
@Controller
public class DetailController {

	/** ログを扱う */
	@Autowired
	LoggerService loggerService;

	@RequestMapping(value = "/money/detail",method = {RequestMethod.GET, RequestMethod.POST})
	public String detail(Locale locale, Model model){



		return "/challenge/detail";
	}

}
