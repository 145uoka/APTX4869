package com.olympus.aptx4869.controller;

import java.io.Serializable;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.olympus.aptx4869.dto.OAuthTokenDto;
import com.olympus.aptx4869.exception.NotFoundRecordException;
import com.olympus.aptx4869.form.GetTokenRequestForm;
import com.olympus.aptx4869.service.LoginService;

/**
 * Handles requests for the application home page.
 */
@RestController
public class OAuthApiController implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    private static final Logger logger = LoggerFactory.getLogger(OAuthApiController.class);

    @Autowired
    LoginService loginService;

    /**
     * Simply selects the home view to render by returning its name.
     * @throws NotFoundRecordException
     */
    @RequestMapping(value = "/api/getToken", method = RequestMethod.POST)
    @ResponseBody
    public OAuthTokenDto getToken(@RequestBody @Valid GetTokenRequestForm form, Errors errors){
        OAuthTokenDto oAuthTokenDto = new OAuthTokenDto();
        oAuthTokenDto.setLineEmail("aaa");
        oAuthTokenDto.setLineId("bbb");
        oAuthTokenDto.setLineName("ccc");

        logger.debug("◆◆◆◆◆DTO = " + oAuthTokenDto.toString());
        return oAuthTokenDto;
    }

}
