package com.olympus.aptx4869.form;

import java.io.Serializable;

/**
 * GetTokenRequestForm。
 *
 * @author
 */
public class GetTokenRequestForm implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** clientId */
    private String clientId;

    /** clientSecret */
    private String clientSecret;

    /** code */
    private String code;

    /** appKey */
    private String appKey;

    /**
     * clientIdの取得。
     *
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * clientIdを設定。
     *
     * @param clientId clientId
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * clientSecretの取得。
     *
     * @return clientSecret
     */
    public String getClientSecret() {
        return this.clientSecret;
    }

    /**
     * clientSecretを設定。
     *
     * @param clientSecret clientSecret
     */
    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    /**
     * codeの取得。
     *
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * codeを設定。
     *
     * @param code code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * appKeyの取得。
     *
     * @return appKey
     */
    public String getAppKey() {
        return this.appKey;
    }

    /**
     * appKeyを設定。
     *
     * @param appKey appKey
     */
    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

}
