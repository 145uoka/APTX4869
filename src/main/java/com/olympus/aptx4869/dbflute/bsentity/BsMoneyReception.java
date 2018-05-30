package com.olympus.aptx4869.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import com.olympus.aptx4869.dbflute.allcommon.EntityDefinedCommonColumn;
import com.olympus.aptx4869.dbflute.allcommon.DBMetaInstanceHandler;
import com.olympus.aptx4869.dbflute.exentity.*;

/**
 * The entity of money_reception as TABLE. <br>
 * <pre>
 * [primary-key]
 *     money_reception_id
 *
 * [column]
 *     money_reception_id, user_id, genre_id, money_reception_flag, amount, money_reception_date, supplement, delete_flag, register_datetime, update_datetime
 *
 * [sequence]
 *     money_reception_money_reception_id_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     genre, user_m
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     genre, userM
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long moneyReceptionId = entity.getMoneyReceptionId();
 * Integer userId = entity.getUserId();
 * Integer genreId = entity.getGenreId();
 * Boolean moneyReceptionFlag = entity.getMoneyReceptionFlag();
 * Integer amount = entity.getAmount();
 * java.time.LocalDate moneyReceptionDate = entity.getMoneyReceptionDate();
 * String supplement = entity.getSupplement();
 * Boolean deleteFlag = entity.getDeleteFlag();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * entity.setMoneyReceptionId(moneyReceptionId);
 * entity.setUserId(userId);
 * entity.setGenreId(genreId);
 * entity.setMoneyReceptionFlag(moneyReceptionFlag);
 * entity.setAmount(amount);
 * entity.setMoneyReceptionDate(moneyReceptionDate);
 * entity.setSupplement(supplement);
 * entity.setDeleteFlag(deleteFlag);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setUpdateDatetime(updateDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMoneyReception extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** money_reception_id: {PK, ID, NotNull, bigserial(19)} */
    protected Long _moneyReceptionId;

    /** (ユーザーID)user_id: {NotNull, int4(10), FK to user_m} */
    protected Integer _userId;

    /** genre_id: {NotNull, int4(10), FK to genre} */
    protected Integer _genreId;

    /** money_reception_flag: {NotNull, bool(1)} */
    protected Boolean _moneyReceptionFlag;

    /** amount: {NotNull, int4(10)} */
    protected Integer _amount;

    /** money_reception_date: {NotNull, date(13)} */
    protected java.time.LocalDate _moneyReceptionDate;

    /** supplement: {text(2147483647)} */
    protected String _supplement;

    /** (削除フラグ)delete_flag: {NotNull, bool(1), default=[false]} */
    protected Boolean _deleteFlag;

    /** (登録日時)register_datetime: {NotNull, timestamp(26, 3), default=[now()]} */
    protected java.time.LocalDateTime _registerDatetime;

    /** (更新日時)update_datetime: {timestamp(26, 3)} */
    protected java.time.LocalDateTime _updateDatetime;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "money_reception";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_moneyReceptionId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** genre by my genre_id, named 'genre'. */
    protected OptionalEntity<Genre> _genre;

    /**
     * [get] genre by my genre_id, named 'genre'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'genre'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<Genre> getGenre() {
        if (_genre == null) { _genre = OptionalEntity.relationEmpty(this, "genre"); }
        return _genre;
    }

    /**
     * [set] genre by my genre_id, named 'genre'.
     * @param genre The entity of foreign property 'genre'. (NullAllowed)
     */
    public void setGenre(OptionalEntity<Genre> genre) {
        _genre = genre;
    }

    /** (ユーザー_M)user_m by my user_id, named 'userM'. */
    protected OptionalEntity<UserM> _userM;

    /**
     * [get] (ユーザー_M)user_m by my user_id, named 'userM'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'userM'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<UserM> getUserM() {
        if (_userM == null) { _userM = OptionalEntity.relationEmpty(this, "userM"); }
        return _userM;
    }

    /**
     * [set] (ユーザー_M)user_m by my user_id, named 'userM'.
     * @param userM The entity of foreign property 'userM'. (NullAllowed)
     */
    public void setUserM(OptionalEntity<UserM> userM) {
        _userM = userM;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMoneyReception) {
            BsMoneyReception other = (BsMoneyReception)obj;
            if (!xSV(_moneyReceptionId, other._moneyReceptionId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _moneyReceptionId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_genre != null && _genre.isPresent())
        { sb.append(li).append(xbRDS(_genre, "genre")); }
        if (_userM != null && _userM.isPresent())
        { sb.append(li).append(xbRDS(_userM, "userM")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_moneyReceptionId));
        sb.append(dm).append(xfND(_userId));
        sb.append(dm).append(xfND(_genreId));
        sb.append(dm).append(xfND(_moneyReceptionFlag));
        sb.append(dm).append(xfND(_amount));
        sb.append(dm).append(xfND(_moneyReceptionDate));
        sb.append(dm).append(xfND(_supplement));
        sb.append(dm).append(xfND(_deleteFlag));
        sb.append(dm).append(xfND(_registerDatetime));
        sb.append(dm).append(xfND(_updateDatetime));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_genre != null && _genre.isPresent())
        { sb.append(dm).append("genre"); }
        if (_userM != null && _userM.isPresent())
        { sb.append(dm).append("userM"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public MoneyReception clone() {
        return (MoneyReception)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] money_reception_id: {PK, ID, NotNull, bigserial(19)} <br>
     * @return The value of the column 'money_reception_id'. (basically NotNull if selected: for the constraint)
     */
    public Long getMoneyReceptionId() {
        checkSpecifiedProperty("moneyReceptionId");
        return _moneyReceptionId;
    }

    /**
     * [set] money_reception_id: {PK, ID, NotNull, bigserial(19)} <br>
     * @param moneyReceptionId The value of the column 'money_reception_id'. (basically NotNull if update: for the constraint)
     */
    public void setMoneyReceptionId(Long moneyReceptionId) {
        registerModifiedProperty("moneyReceptionId");
        _moneyReceptionId = moneyReceptionId;
    }

    /**
     * [get] (ユーザーID)user_id: {NotNull, int4(10), FK to user_m} <br>
     * @return The value of the column 'user_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getUserId() {
        checkSpecifiedProperty("userId");
        return _userId;
    }

    /**
     * [set] (ユーザーID)user_id: {NotNull, int4(10), FK to user_m} <br>
     * @param userId The value of the column 'user_id'. (basically NotNull if update: for the constraint)
     */
    public void setUserId(Integer userId) {
        registerModifiedProperty("userId");
        _userId = userId;
    }

    /**
     * [get] genre_id: {NotNull, int4(10), FK to genre} <br>
     * @return The value of the column 'genre_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getGenreId() {
        checkSpecifiedProperty("genreId");
        return _genreId;
    }

    /**
     * [set] genre_id: {NotNull, int4(10), FK to genre} <br>
     * @param genreId The value of the column 'genre_id'. (basically NotNull if update: for the constraint)
     */
    public void setGenreId(Integer genreId) {
        registerModifiedProperty("genreId");
        _genreId = genreId;
    }

    /**
     * [get] money_reception_flag: {NotNull, bool(1)} <br>
     * @return The value of the column 'money_reception_flag'. (basically NotNull if selected: for the constraint)
     */
    public Boolean getMoneyReceptionFlag() {
        checkSpecifiedProperty("moneyReceptionFlag");
        return _moneyReceptionFlag;
    }

    /**
     * [set] money_reception_flag: {NotNull, bool(1)} <br>
     * @param moneyReceptionFlag The value of the column 'money_reception_flag'. (basically NotNull if update: for the constraint)
     */
    public void setMoneyReceptionFlag(Boolean moneyReceptionFlag) {
        registerModifiedProperty("moneyReceptionFlag");
        _moneyReceptionFlag = moneyReceptionFlag;
    }

    /**
     * [get] amount: {NotNull, int4(10)} <br>
     * @return The value of the column 'amount'. (basically NotNull if selected: for the constraint)
     */
    public Integer getAmount() {
        checkSpecifiedProperty("amount");
        return _amount;
    }

    /**
     * [set] amount: {NotNull, int4(10)} <br>
     * @param amount The value of the column 'amount'. (basically NotNull if update: for the constraint)
     */
    public void setAmount(Integer amount) {
        registerModifiedProperty("amount");
        _amount = amount;
    }

    /**
     * [get] money_reception_date: {NotNull, date(13)} <br>
     * @return The value of the column 'money_reception_date'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDate getMoneyReceptionDate() {
        checkSpecifiedProperty("moneyReceptionDate");
        return _moneyReceptionDate;
    }

    /**
     * [set] money_reception_date: {NotNull, date(13)} <br>
     * @param moneyReceptionDate The value of the column 'money_reception_date'. (basically NotNull if update: for the constraint)
     */
    public void setMoneyReceptionDate(java.time.LocalDate moneyReceptionDate) {
        registerModifiedProperty("moneyReceptionDate");
        _moneyReceptionDate = moneyReceptionDate;
    }

    /**
     * [get] supplement: {text(2147483647)} <br>
     * @return The value of the column 'supplement'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplement() {
        checkSpecifiedProperty("supplement");
        return _supplement;
    }

    /**
     * [set] supplement: {text(2147483647)} <br>
     * @param supplement The value of the column 'supplement'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplement(String supplement) {
        registerModifiedProperty("supplement");
        _supplement = supplement;
    }

    /**
     * [get] (削除フラグ)delete_flag: {NotNull, bool(1), default=[false]} <br>
     * @return The value of the column 'delete_flag'. (basically NotNull if selected: for the constraint)
     */
    public Boolean getDeleteFlag() {
        checkSpecifiedProperty("deleteFlag");
        return _deleteFlag;
    }

    /**
     * [set] (削除フラグ)delete_flag: {NotNull, bool(1), default=[false]} <br>
     * @param deleteFlag The value of the column 'delete_flag'. (basically NotNull if update: for the constraint)
     */
    public void setDeleteFlag(Boolean deleteFlag) {
        registerModifiedProperty("deleteFlag");
        _deleteFlag = deleteFlag;
    }

    /**
     * [get] (登録日時)register_datetime: {NotNull, timestamp(26, 3), default=[now()]} <br>
     * @return The value of the column 'register_datetime'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] (登録日時)register_datetime: {NotNull, timestamp(26, 3), default=[now()]} <br>
     * @param registerDatetime The value of the column 'register_datetime'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterDatetime(java.time.LocalDateTime registerDatetime) {
        registerModifiedProperty("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] (更新日時)update_datetime: {timestamp(26, 3)} <br>
     * @return The value of the column 'update_datetime'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getUpdateDatetime() {
        checkSpecifiedProperty("updateDatetime");
        return _updateDatetime;
    }

    /**
     * [set] (更新日時)update_datetime: {timestamp(26, 3)} <br>
     * @param updateDatetime The value of the column 'update_datetime'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdateDatetime(java.time.LocalDateTime updateDatetime) {
        registerModifiedProperty("updateDatetime");
        _updateDatetime = updateDatetime;
    }
}
