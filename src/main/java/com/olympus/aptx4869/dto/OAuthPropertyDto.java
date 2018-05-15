package com.olympus.aptx4869.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * OAuthPropertyDto。
 *
 * @author
 */
public class OAuthPropertyDto implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** appKey */
    private String appKey;

    /** clientId */
    private String clientId;

    /** clientSecret */
    private String clientSecret;

    /** deleteFlag */
    private Boolean deleteFlag;

    /** oauthPropertyId */
    private Integer oauthPropertyId;

    /** redirectUrl */
    private String redirectUrl;

    /** registerDatetime */
    private LocalDateTime registerDatetime;

    /** updateDatetime */
    private LocalDateTime updateDatetime;

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
     * deleteFlagの取得。
     *
     * @return deleteFlag
     */
    public Boolean getDeleteFlag() {
        return this.deleteFlag;
    }

    /**
     * deleteFlagを設定。
     *
     * @param deleteFlag deleteFlag
     */
    public void setDeleteFlag(Boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    /**
     * oauthPropertyIdの取得。
     *
     * @return oauthPropertyId
     */
    public Integer getOauthPropertyId() {
        return this.oauthPropertyId;
    }

    /**
     * oauthPropertyIdを設定。
     *
     * @param oauthPropertyId oauthPropertyId
     */
    public void setOauthPropertyId(Integer oauthPropertyId) {
        this.oauthPropertyId = oauthPropertyId;
    }

    /**
     * redirectUrlの取得。
     *
     * @return redirectUrl
     */
    public String getRedirectUrl() {
        return this.redirectUrl;
    }

    /**
     * redirectUrlを設定。
     *
     * @param redirectUrl redirectUrl
     */
    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    /**
     * registerDatetimeの取得。
     *
     * @return registerDatetime
     */
    public LocalDateTime getRegisterDatetime() {
        return this.registerDatetime;
    }

    /**
     * registerDatetimeを設定。
     *
     * @param registerDatetime registerDatetime
     */
    public void setRegisterDatetime(LocalDateTime registerDatetime) {
        this.registerDatetime = registerDatetime;
    }

    /**
     * updateDatetimeの取得。
     *
     * @return updateDatetime
     */
    public LocalDateTime getUpdateDatetime() {
        return this.updateDatetime;
    }

    /**
     * updateDatetimeを設定。
     *
     * @param updateDatetime updateDatetime
     */
    public void setUpdateDatetime(LocalDateTime updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

}
