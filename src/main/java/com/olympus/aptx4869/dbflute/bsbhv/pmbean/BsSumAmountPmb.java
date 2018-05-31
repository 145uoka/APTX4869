package com.olympus.aptx4869.dbflute.bsbhv.pmbean;

import java.util.*;

import org.dbflute.outsidesql.typed.*;
import org.dbflute.jdbc.*;
import org.dbflute.outsidesql.PmbCustodial;
import org.dbflute.util.DfTypeUtil;
import com.olympus.aptx4869.dbflute.allcommon.*;
import com.olympus.aptx4869.dbflute.exbhv.*;
import com.olympus.aptx4869.dbflute.exentity.customize.*;

/**
 * The base class for typed parameter-bean of SumAmount. <br>
 * This is related to "<span style="color: #AD4747">selectSumAmount</span>" on MoneyReceptionBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsSumAmountPmb implements ListHandlingPmb<MoneyReceptionBhv, SumAmount>, EntityHandlingPmb<MoneyReceptionBhv, SumAmount>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of userId. */
    protected Integer _userId;

    /** The parameter of moneyReceptionFlag. */
    protected Boolean _moneyReceptionFlag;

    /** The parameter of moneyReceptionFromDate. */
    protected java.time.LocalDate _moneyReceptionFromDate;

    /** The parameter of moneyReceptionToDate. */
    protected java.time.LocalDate _moneyReceptionToDate;

    /** The max size of safety result. */
    protected int _safetyMaxResultSize;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the typed parameter-bean of SumAmount. <br>
     * This is related to "<span style="color: #AD4747">selectSumAmount</span>" on MoneyReceptionBhv.
     */
    public BsSumAmountPmb() {
    }

    // ===================================================================================
    //                                                                Typed Implementation
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    public String getOutsideSqlPath() { return "selectSumAmount"; }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, customize entity. (NotNull)
     */
    public Class<SumAmount> getEntityType() { return SumAmount.class; }

    // ===================================================================================
    //                                                                       Safety Result
    //                                                                       =============
    /**
     * {@inheritDoc}
     */
    public void checkSafetyResult(int safetyMaxResultSize) {
        _safetyMaxResultSize = safetyMaxResultSize;
    }

    /**
     * {@inheritDoc}
     */
    public int getSafetyMaxResultSize() {
        return _safetyMaxResultSize;
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    // -----------------------------------------------------
    //                                                String
    //                                                ------
    protected String filterStringParameter(String value) { return isEmptyStringParameterAllowed() ? value : convertEmptyToNull(value); }
    protected boolean isEmptyStringParameterAllowed() { return DBFluteConfig.getInstance().isEmptyStringParameterAllowed(); }
    protected String convertEmptyToNull(String value) { return PmbCustodial.convertEmptyToNull(value); }

    // -----------------------------------------------------
    //                                                  Date
    //                                                  ----
    protected Date toUtilDate(Object date) { return PmbCustodial.toUtilDate(date, _timeZone); }
    protected <DATE> DATE toLocalDate(Date date, Class<DATE> localType) { return PmbCustodial.toLocalDate(date, localType, chooseRealTimeZone()); }
    protected TimeZone chooseRealTimeZone() { return PmbCustodial.chooseRealTimeZone(_timeZone); }

    /**
     * Set time-zone, basically for LocalDate conversion. <br>
     * Normally you don't need to set this, you can adjust other ways. <br>
     * (DBFlute system's time-zone is used as default)
     * @param timeZone The time-zone for filtering. (NullAllowed: if null, default zone)
     */
    public void zone(TimeZone timeZone) { _timeZone = timeZone; }

    // -----------------------------------------------------
    //                                    by Option Handling
    //                                    ------------------
    // might be called by option handling
    protected <NUMBER extends Number> NUMBER toNumber(Object obj, Class<NUMBER> type) { return PmbCustodial.toNumber(obj, type); }
    protected Boolean toBoolean(Object obj) { return PmbCustodial.toBoolean(obj); }
    @SuppressWarnings("unchecked")
    protected <ELEMENT> ArrayList<ELEMENT> newArrayList(ELEMENT... elements) { return PmbCustodial.newArrayList(elements); }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * @return The display string of all parameters. (NotNull)
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(DfTypeUtil.toClassTitle(this)).append(":");
        sb.append(xbuildColumnString());
        return sb.toString();
    }
    protected String xbuildColumnString() {
        final String dm = ", ";
        final StringBuilder sb = new StringBuilder();
        sb.append(dm).append(_userId);
        sb.append(dm).append(_moneyReceptionFlag);
        sb.append(dm).append(_moneyReceptionFromDate);
        sb.append(dm).append(_moneyReceptionToDate);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] userId <br>
     * @return The value of userId. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Integer getUserId() {
        return _userId;
    }

    /**
     * [set] userId <br>
     * @param userId The value of userId. (NullAllowed)
     */
    public void setUserId(Integer userId) {
        _userId = userId;
    }

    /**
     * [get] moneyReceptionFlag <br>
     * @return The value of moneyReceptionFlag. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Boolean getMoneyReceptionFlag() {
        return _moneyReceptionFlag;
    }

    /**
     * [set] moneyReceptionFlag <br>
     * @param moneyReceptionFlag The value of moneyReceptionFlag. (NullAllowed)
     */
    public void setMoneyReceptionFlag(Boolean moneyReceptionFlag) {
        _moneyReceptionFlag = moneyReceptionFlag;
    }

    /**
     * [get] moneyReceptionFromDate <br>
     * @return The value of moneyReceptionFromDate. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.time.LocalDate getMoneyReceptionFromDate() {
        return _moneyReceptionFromDate;
    }

    /**
     * [set] moneyReceptionFromDate <br>
     * @param moneyReceptionFromDate The value of moneyReceptionFromDate. (NullAllowed)
     */
    public void setMoneyReceptionFromDate(java.time.LocalDate moneyReceptionFromDate) {
        _moneyReceptionFromDate = moneyReceptionFromDate;
    }

    /**
     * [get] moneyReceptionToDate <br>
     * @return The value of moneyReceptionToDate. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public java.time.LocalDate getMoneyReceptionToDate() {
        return _moneyReceptionToDate;
    }

    /**
     * [set] moneyReceptionToDate <br>
     * @param moneyReceptionToDate The value of moneyReceptionToDate. (NullAllowed)
     */
    public void setMoneyReceptionToDate(java.time.LocalDate moneyReceptionToDate) {
        _moneyReceptionToDate = moneyReceptionToDate;
    }
}
