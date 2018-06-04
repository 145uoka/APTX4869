package com.olympus.aptx4869.controller;

import java.io.IOException;
import java.io.Serializable;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.apache.commons.codec.binary.StringUtils;
import org.apache.http.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import com.olympus.aptx4869.constants.OAuthConstants;
import com.olympus.aptx4869.dto.LoginUserDto;
import com.olympus.aptx4869.dto.OAuthTokenDto;
import com.olympus.aptx4869.exception.NotFoundRecordException;
import com.olympus.aptx4869.form.OAuthExResultForm;
import com.olympus.aptx4869.service.LoginService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class LoginController extends BaseController implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    LoginService loginService;

    /**
     * Simply selects the home view to render by returning its name.
     * @throws NotFoundRecordException
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Locale locale, Model model) throws NotFoundRecordException {

        String url = loginService.getOauthUrl();

        return super.redirect(url);
    }

    @RequestMapping(value = "/login/callback", method = RequestMethod.GET)
    public String callback(@Validated @ModelAttribute OAuthExResultForm form, BindingResult bindingResult,
            Locale locale, Model model) throws ParseException, NotFoundRecordException, IOException {

        if (logger.isDebugEnabled()) {
            logger.debug(form.toString());
        }

        if (bindingResult.hasErrors()) {
            logger.warn("◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆");
        }

        if (!StringUtils.equals(form.getResult(), OAuthConstants.ResultCode.SUCCESS)) {
            // TODO
            logger.warn("◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆");
        }


        // TODO エラー判定

        OAuthTokenDto oAuthTokenDto = loginService.getToken(form.getCode());

        if (logger.isDebugEnabled()) {
            logger.debug(oAuthTokenDto.toString());
        }

        LoginUserDto loginUserDto = loginService.login(oAuthTokenDto);
        BeanUtils.copyProperties(loginUserDto, this.loginUserDto);
        this.loginUserDto.setLoginFlg(true);

        logger.info("Login is : {}", loginUserDto.isLoginFlg());

        return super.redirect("/graph/" + loginUserDto.getUserId());
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpSession session, SessionStatus sessionStatus) {

        if (session != null) {
            if (loginUserDto != null) {

                // ログ出力
                logger.info("ログアウトしました。名前 - [" + loginUserDto.getLineName() + "]");
            }
            session.invalidate();
        }
        sessionStatus.setComplete();

        return super.redirect("/");
    }

}
