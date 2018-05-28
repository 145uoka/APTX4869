package com.olympus.aptx4869.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.olympus.aptx4869.dbflute.allcommon.EntityDefinedCommonColumn;
import com.olympus.aptx4869.dbflute.allcommon.DBMetaInstanceHandler;
import com.olympus.aptx4869.dbflute.exentity.*;

/**
 * The entity of regularly_data as TABLE. <br>
 * <pre>
 * [primary-key]
 *     property_id
 *
 * [column]
 *     property_id, user_id, regularly_flag, amount, accountingdate, delete_flag, register_datetime, update_datetime
 *
 * [sequence]
 *     regularly_data_property_id_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer propertyId = entity.getPropertyId();
 * Integer userId = entity.getUserId();
 * Boolean regularlyFlag = entity.getRegularlyFlag();
 * Integer amount = entity.getAmount();
 * Integer accountingdate = entity.getAccountingdate();
 * Boolean deleteFlag = entity.getDeleteFlag();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * entity.setPropertyId(propertyId);
 * entity.setUserId(userId);
 * entity.setRegularlyFlag(regularlyFlag);
 * entity.setAmount(amount);
 * entity.setAccountingdate(accountingdate);
 * entity.setDeleteFlag(deleteFlag);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setUpdateDatetime(updateDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsRegularlyData extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** property_id: {PK, ID, NotNull, serial(10)} */
    protected Integer _propertyId;

    /** (ユーザーID)user_id: {NotNull, int4(10)} */
    protected Integer _userId;

    /** regularly_flag: {NotNull, bool(1)} */
    protected Boolean _regularlyFlag;

    /** amount: {NotNull, int4(10)} */
    protected Integer _amount;

    /** accountingdate: {NotNull, int4(10)} */
    protected Integer _accountingdate;

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
        return "regularly_data";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_propertyId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
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
        if (obj instanceof BsRegularlyData) {
            BsRegularlyData other = (BsRegularlyData)obj;
            if (!xSV(_propertyId, other._propertyId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _propertyId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_propertyId));
        sb.append(dm).append(xfND(_userId));
        sb.append(dm).append(xfND(_regularlyFlag));
        sb.append(dm).append(xfND(_amount));
        sb.append(dm).append(xfND(_accountingdate));
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
        return "";
    }

    @Override
    public RegularlyData clone() {
        return (RegularlyData)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] property_id: {PK, ID, NotNull, serial(10)} <br>
     * @return The value of the column 'property_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPropertyId() {
        checkSpecifiedProperty("propertyId");
        return _propertyId;
    }

    /**
     * [set] property_id: {PK, ID, NotNull, serial(10)} <br>
     * @param propertyId The value of the column 'property_id'. (basically NotNull if update: for the constraint)
     */
    public void setPropertyId(Integer propertyId) {
        registerModifiedProperty("propertyId");
        _propertyId = propertyId;
    }

    /**
     * [get] (ユーザーID)user_id: {NotNull, int4(10)} <br>
     * @return The value of the column 'user_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getUserId() {
        checkSpecifiedProperty("userId");
        return _userId;
    }

    /**
     * [set] (ユーザーID)user_id: {NotNull, int4(10)} <br>
     * @param userId The value of the column 'user_id'. (basically NotNull if update: for the constraint)
     */
    public void setUserId(Integer userId) {
        registerModifiedProperty("userId");
        _userId = userId;
    }

    /**
     * [get] regularly_flag: {NotNull, bool(1)} <br>
     * @return The value of the column 'regularly_flag'. (basically NotNull if selected: for the constraint)
     */
    public Boolean getRegularlyFlag() {
        checkSpecifiedProperty("regularlyFlag");
        return _regularlyFlag;
    }

    /**
     * [set] regularly_flag: {NotNull, bool(1)} <br>
     * @param regularlyFlag The value of the column 'regularly_flag'. (basically NotNull if update: for the constraint)
     */
    public void setRegularlyFlag(Boolean regularlyFlag) {
        registerModifiedProperty("regularlyFlag");
        _regularlyFlag = regularlyFlag;
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
     * [get] accountingdate: {NotNull, int4(10)} <br>
     * @return The value of the column 'accountingdate'. (basically NotNull if selected: for the constraint)
     */
    public Integer getAccountingdate() {
        checkSpecifiedProperty("accountingdate");
        return _accountingdate;
    }

    /**
     * [set] accountingdate: {NotNull, int4(10)} <br>
     * @param accountingdate The value of the column 'accountingdate'. (basically NotNull if update: for the constraint)
     */
    public void setAccountingdate(Integer accountingdate) {
        registerModifiedProperty("accountingdate");
        _accountingdate = accountingdate;
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
