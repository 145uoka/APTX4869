package com.olympus.aptx4869.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class MoneyReceptionCreateDto {

    private Integer moneyReceptionId;

    private Integer userId;

    private Integer genreId;

    private Boolean moneyReceptionFlag;

    private Integer amount;

    private LocalDate moneyReceptionDate;

    private String supplement;

    private Boolean deleteFlag;

    private LocalDateTime registerDatetime;

    private LocalDateTime updateDatetime;

    public Integer getMoneyReceptionId() {
        return moneyReceptionId;
    }

    public void setMoneyReceptionId(Integer moneyReceptionId) {
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

    public Boolean getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public LocalDateTime getRegisterDatetime() {
        return registerDatetime;
    }

    public void setRegisterDatetime(LocalDateTime registerDatetime) {
        this.registerDatetime = registerDatetime;
    }

    public LocalDateTime getUpdateDatetime() {
        return updateDatetime;
    }

    public void setUpdateDatetime(LocalDateTime updateDatetime) {
        this.updateDatetime = updateDatetime;
    }


}
