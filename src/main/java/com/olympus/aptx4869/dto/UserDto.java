package com.olympus.aptx4869.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * AccountDto。
 *
 * @author
 */
public class UserDto implements Serializable {


    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    /** firstName */
    private String firstName;

    /** handleName */
    private String handleName;

    /** lastLoginDatetime */
    private LocalDateTime lastLoginDatetime;

    /** lastName */
    private String lastName;

    /** lineEmail */
    private String lineEmail;

    /** lineId */
    private String lineId;

    /** lineName */
    private String lineName;

    /** userId */
    private Integer userId;

    private Integer settlementDate;


	public Integer getSettlementDate() {
		return settlementDate;
	}

	public void setSettlementDate(Integer settlementDate) {
		this.settlementDate = settlementDate;
	}

	/**
     * firstNameの取得。
     *
     * @return firstName
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * firstNameを設定。
     *
     * @param firstName firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * handleNameの取得。
     *
     * @return handleName
     */
    public String getHandleName() {
        return this.handleName;
    }

    /**
     * handleNameを設定。
     *
     * @param handleName handleName
     */
    public void setHandleName(String handleName) {
        this.handleName = handleName;
    }

    /**
     * lastLoginDatetimeの取得。
     *
     * @return lastLoginDatetime
     */
    public LocalDateTime getLastLoginDatetime() {
        return this.lastLoginDatetime;
    }

    /**
     * lastLoginDatetimeを設定。
     *
     * @param lastLoginDatetime lastLoginDatetime
     */
    public void setLastLoginDatetime(LocalDateTime lastLoginDatetime) {
        this.lastLoginDatetime = lastLoginDatetime;
    }

    /**
     * lastNameの取得。
     *
     * @return lastName
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * lastNameを設定。
     *
     * @param lastName lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

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

    /**
     * userIdの取得。
     *
     * @return userId
     */
    public Integer getUserId() {
        return this.userId;
    }

    /**
     * userIdを設定。
     *
     * @param userId userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

}
