package com.olympus.aptx4869.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * OAuthTokenDto。
 *
 * @author
 */
public class OAuthTokenDto {

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    /** lineEmail */
    private String lineEmail;

    /** lineId */
    private String lineId;

    /** lineName */
    private String lineName;

    /**
     * lineEmailの取得。
     *
     * @return lineEmail
     */
    public String getLineEmail() {
        return this.lineEmail;
    }

    /**
     * lineEmailを設定。
     *
     * @param lineEmail lineEmail
     */
    public void setLineEmail(String lineEmail) {
        this.lineEmail = lineEmail;
    }

    /**
     * lineIdの取得。
     *
     * @return lineId
     */
    public String getLineId() {
        return this.lineId;
    }

    /**
     * lineIdを設定。
     *
     * @param lineId lineId
     */
    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    /**
     * lineNameの取得。
     *
     * @return lineName
     */
    public String getLineName() {
        return this.lineName;
    }

    /**
     * lineNameを設定。
     *
     * @param lineName lineName
     */
    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

}
