package com.olympus.aptx4869.form;

import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * OAuthExResultForm。
 *
 * @author
 */
public class OAuthExResultForm {

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    /** result */
    @NotNull
    private String result;

    /** errorCode */
    private String errorCode;

    /** errorDescription */
    private String errorDescription;

    /** state */
    private String state;

    /** code */
    private String code;

    /** itToken */
    private String itToken;

    /**
     * resultの取得。
     *
     * @return result
     */
    public String getResult() {
        return this.result;
    }

    /**
     * resultを設定。
     *
     * @param result result
     */
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * errorCodeの取得。
     *
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * errorCodeを設定。
     *
     * @param errorCode errorCode
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * errorDescriptionの取得。
     *
     * @return errorDescription
     */
    public String getErrorDescription() {
        return this.errorDescription;
    }

    /**
     * errorDescriptionを設定。
     *
     * @param errorDescription errorDescription
     */
    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    /**
     * stateの取得。
     *
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * stateを設定。
     *
     * @param state state
     */
    public void setState(String state) {
        this.state = state;
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
     * itTokenの取得。
     *
     * @return itToken
     */
    public String getItToken() {
        return this.itToken;
    }

    /**
     * itTokenを設定。
     *
     * @param itToken itToken
     */
    public void setItToken(String itToken) {
        this.itToken = itToken;
    }

}
