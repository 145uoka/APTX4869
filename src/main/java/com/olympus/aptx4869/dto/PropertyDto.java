package com.olympus.aptx4869.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * PropertyDto。
 *
 * @author
 */
public class PropertyDto implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** deleteFlag */
    private Boolean deleteFlag;

    /** propertyId */
    private Integer propertyId;

    /** propName */
    private String propName;

    /** propVal */
    private String propVal;

    /** registerDatetime */
    private LocalDateTime registerDatetime;

    /** updateDatetime */
    private LocalDateTime updateDatetime;

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
     * propertyIdの取得。
     *
     * @return propertyId
     */
    public Integer getPropertyId() {
        return this.propertyId;
    }

    /**
     * propertyIdを設定。
     *
     * @param propertyId propertyId
     */
    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }

    /**
     * propNameの取得。
     *
     * @return propName
     */
    public String getPropName() {
        return this.propName;
    }

    /**
     * propNameを設定。
     *
     * @param propName propName
     */
    public void setPropName(String propName) {
        this.propName = propName;
    }

    /**
     * propValの取得。
     *
     * @return propVal
     */
    public String getPropVal() {
        return this.propVal;
    }

    /**
     * propValを設定。
     *
     * @param propVal propVal
     */
    public void setPropVal(String propVal) {
        this.propVal = propVal;
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
