package com.olympus.aptx4869.dto;

import java.time.LocalDate;

public class MoneyReceptionDto {

    private Long moneyReceptionId;

    private Integer userId;

    private Integer genreId;

    private Boolean moneyReceptionFlag;

    private Integer amount;

    private LocalDate moneyReceptionDate;

    private String supplement;

    public Long getMoneyReceptionId() {
        return moneyReceptionId;
    }

    public void setMoneyReceptionId(Long moneyReceptionId) {
        this.moneyReceptionId = moneyReceptionId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGenreId() {
        return genreId;
    }

    public void setGenreId(Integer genreId) {
        this.genreId = genreId;
    }

    public Boolean getMoneyReceptionFlag() {
        return moneyReceptionFlag;
    }

    public void setMoneyReceptionFlag(Boolean moneyReceptionFlag) {
        this.moneyReceptionFlag = moneyReceptionFlag;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public LocalDate getMoneyReceptionDate() {
        return moneyReceptionDate;
    }

    public void setMoneyReceptionDate(LocalDate moneyReceptionDate) {
        this.moneyReceptionDate = moneyReceptionDate;
    }

    public String getSupplement() {
        return supplement;
    }

    public void setSupplement(String supplement) {
        this.supplement = supplement;
    }

}
