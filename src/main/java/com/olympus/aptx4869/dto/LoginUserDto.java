package com.olympus.aptx4869.dto;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

/**
 * LoginUserDto。
 *
 * @author
 */
@Service
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class LoginUserDto extends UserDto implements Serializable {

    private static final long serialVersionUID = 1L;

    /** ログイン状態 */
    private boolean loginFlg;

    /**
     * ログイン状態の取得。
     *
     * @return ログイン状態
     */
    public boolean isLoginFlg() {
        return this.loginFlg;
    }

    /**
     * ログイン状態を設定。
     *
     * @param loginFlg ログイン状態
     */
    public void setLoginFlg(boolean loginFlg) {
        this.loginFlg = loginFlg;
    }

}
