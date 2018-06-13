package com.olympus.aptx4869.dto;

import org.apache.commons.lang3.StringUtils;

import com.olympus.aptx4869.form.AccountForm;

/**
 * @author tokuno_a
 *ユーザープロパティのDTO
 */
public class UserPropertyDto {
	 private Integer userId;
	 private Integer settlementDate;
	 private Integer budget;
	 public UserPropertyDto(){

	 }
	public UserPropertyDto(AccountForm form){
		if(StringUtils.isNotEmpty(form.getSettlementDate())){
			this.settlementDate = Integer.valueOf(form.getSettlementDate());
		}
		if(StringUtils.isNotEmpty(form.getBudget())){
			this.budget = Integer.valueOf(form.getBudget());
		}

	}
	 public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getSettlementDate() {
		return settlementDate;
	}
	public void setSettlementDate(Integer settlementDate) {
		this.settlementDate = settlementDate;
	}
	public Integer getBudget() {
		return budget;
	}
	public void setBudget(Integer budget) {
		this.budget = budget;
	}

}
