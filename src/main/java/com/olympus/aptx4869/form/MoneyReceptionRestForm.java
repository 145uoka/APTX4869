package com.olympus.aptx4869.form;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class MoneyReceptionRestForm {

    private String moneyReceptionId;

    @NotEmpty
    private String lineId;

    @NotEmpty
    private String genreId;

    @NotEmpty
    private String moneyReceptionFlag;

    @NotEmpty
    @Pattern(regexp = "^[0-9]{1,9}$")
    private String amount;

    private String moneyReceptionDate;

    @Size(max=20)
    private String supplement;


    public String getMoneyReceptionId() {
        return moneyReceptionId;
    }

    public void setMoneyReceptionId(String moneyReceptionId) {
        this.moneyReceptionId = moneyReceptionId;
    }

    public String getLineId() {
        return lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    public String getGenreId() {
        return genreId;
    }

    public void setGenreId(String genreId) {
        this.genreId = genreId;
    }

    public String getMoneyReceptionFlag() {
        return moneyReceptionFlag;
    }

    public void setMoneyReceptionFlag(String moneyReceptionFlag) {
        this.moneyReceptionFlag = moneyReceptionFlag;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getMoneyReceptionDate() {
        return moneyReceptionDate;
    }

    public void setMoneyReceptionDate(String moneyReceptionDate) {
        this.moneyReceptionDate = moneyReceptionDate;
    }

    public String getSupplement() {
        return supplement;
    }

    public void setSupplement(String supplement) {
        this.supplement = supplement;
    }


}
