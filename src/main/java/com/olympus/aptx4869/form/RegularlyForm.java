package com.olympus.aptx4869.form;

/**
 * @author tokuno_a
 *定期支出フォーム
 */
public class RegularlyForm {
	public String userId;
	public String regularlyFlag;
	public String[] amount;
	public String[] accountingDate;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getRegularlyFlag() {
		return regularlyFlag;
	}
	public void setRegularlyFlag(String regularlyFlag) {
		this.regularlyFlag = regularlyFlag;
	}
	public String[] getAmount() {
		return amount;
	}
	public void setAmount(String[] amount) {
		this.amount = amount;
	}
	public String[] getAccountingDate() {
		return accountingDate;
	}
	public void setAccountingDate(String[] accountingDate) {
		this.accountingDate = accountingDate;
	}


}
