package com.olympus.aptx4869.springmvc.interceptor;

import java.util.Locale;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.olympus.aptx4869.exception.NotLoginException;


@Component
public class SimpleExceptionResolver implements HandlerExceptionResolver {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Resource(name = "messageSource")
	MessageSource messageSource;

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
		logger.error("例外をキャッチしました。", ex);
		ModelAndView mav = new ModelAndView();
		if (ex instanceof NotLoginException) {
			String errorMessage = messageSource.getMessage("error.login", null, Locale.getDefault());
			// JSPに表示するメッセージをセットします。
			mav.addObject("message", errorMessage);
		} else{
			logger.error("不明なシステムエラーが発生しました。", ex);
			// JSPに表示するメッセージをセットします。
			mav.addObject("message", "システムエラーが発生しました。管理者にお問い合わせください。");
			// 遷移先のJSPを指定します。(error.jspに遷移します。)
		}
		mav.setViewName("error");
		return mav;
	}
}