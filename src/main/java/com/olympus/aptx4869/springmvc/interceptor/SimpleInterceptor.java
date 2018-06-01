package com.olympus.aptx4869.springmvc.interceptor;

import java.time.LocalDateTime;
import java.time.ZoneId;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dbflute.hook.AccessContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.olympus.aptx4869.dto.LoginUserDto;

public class SimpleInterceptor implements HandlerInterceptor {

    private  Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    LoginUserDto loginUserDto;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        logger.info("RequestURI : {}", request.getRequestURI());

        AccessContext context = new AccessContext();
        context.setAccessLocalDateTime(LocalDateTime.now(ZoneId.of("Asia/Tokyo")));
        AccessContext.setAccessContextOnThread(context);

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {
        if (modelAndView != null) {
            response.setHeader("X-Frame-Options", "DENY");
            response.setHeader("X-XSS-Protection", "1");
            response.setHeader("X-Content-Type-Options", "nosniff");
            response.setHeader("Cache-Control", "no-cache");
            response.setHeader("Pragma", "no-cache");
            response.setHeader("Expires", "-1");
            if (!modelAndView.getViewName().startsWith("redirect:")) {
                modelAndView.getModel().put("loginUserDto", loginUserDto);
            }
        }
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        AccessContext.clearAccessContextOnThread();
    }

}