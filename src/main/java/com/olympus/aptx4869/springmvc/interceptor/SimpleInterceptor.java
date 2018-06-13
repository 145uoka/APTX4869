package com.olympus.aptx4869.springmvc.interceptor;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.time.LocalDateTime;
import java.time.ZoneId;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.dbflute.hook.AccessContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.olympus.aptx4869.common.BeforeLogin;
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

        if (handler instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            // BeforeLoginアノテーションがついていないクラス、メソッドはログインチェックをする必要がある
            if (!hasAnnotation(handlerMethod, BeforeLogin.class)) {

                // BeforeLoginアノテーションがついていないコントローラへのリクエストで、ログインしていない場合はログアウト
//                if (!loginUserDto.isLoginFlg()) {
//                    doLogout(request, response);
//                    return false;
//                }

                // ログイン中でプロフィール未設定の場合、強制的にプロフィール設定させる
//                if ((!StringUtils.equals(request.getRequestURI(), ProcConstants.PROFILE + ProcConstants.Operation.EDIT))
//                        && (!StringUtils.equals(request.getRequestURI(), ProcConstants.PROFILE + ProcConstants.Operation.UPDATE))) {
//
//                    if(userInfo.isLogined() &&
//                            (StringUtils.isEmpty(userInfo.getFirstName()) && StringUtils.isEmpty(userInfo.getLastName()))){
//
//                        response.sendRedirect(request.getContextPath() + "/profile/edit");
//                        return false;
//                    }
//                }
            }
        }

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

    static boolean hasAnnotation(HandlerMethod handlerMethod, Class<? extends Annotation> annotationClass) {
        return handlerMethod.getBean().getClass().isAnnotationPresent(annotationClass)
                || handlerMethod.getMethod().isAnnotationPresent(annotationClass);
    }

    void doLogout(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // 不正なリクエストであるため、強制ログアウトしてログイン画面へ。
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.invalidate();
        }
        response.sendRedirect(request.getContextPath() + "/");
    }

}