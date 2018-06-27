package com.olympus.aptx4869.dto;

public class RegularlyDto {
	private Integer userId;
	private Boolean regularlyFlag;
	private Integer propertyId;
	public Integer getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(Integer propertyId) {
		this.propertyId = propertyId;
	}
	private Integer amount;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Boolean getRegularlyFlag() {
		return regularlyFlag;
	}
	public void setRegularlyFlag(Boolean regularlyFlag) {
		this.regularlyFlag = regularlyFlag;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public Integer getAccountingdate() {
		return accountingdate;
	}
	public void setAccountingdate(Integer accountingdate) {
		this.accountingdate = accountingdate;
	}
	private Integer accountingdate;


}
