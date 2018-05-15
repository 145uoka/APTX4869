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
 * The entity of property_m as TABLE. <br>
 * <pre>
 * [primary-key]
 *     property_id
 *
 * [column]
 *     property_id, prop_name, prop_val, prop_group_name, delete_flag, register_datetime, update_datetime
 *
 * [sequence]
 *     property_m_property_id_seq
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
 * String propName = entity.getPropName();
 * String propVal = entity.getPropVal();
 * String propGroupName = entity.getPropGroupName();
 * Boolean deleteFlag = entity.getDeleteFlag();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * entity.setPropertyId(propertyId);
 * entity.setPropName(propName);
 * entity.setPropVal(propVal);
 * entity.setPropGroupName(propGroupName);
 * entity.setDeleteFlag(deleteFlag);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setUpdateDatetime(updateDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsPropertyM extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (プロパティID)property_id: {PK, ID, NotNull, serial(10)} */
    protected Integer _propertyId;

    /** (プロパティ名)prop_name: {UQ, NotNull, text(2147483647)} */
    protected String _propName;

    /** (プロパティ値)prop_val: {text(2147483647)} */
    protected String _propVal;

    /** (プロパティグループ名)prop_group_name: {text(2147483647)} */
    protected String _propGroupName;

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
        return "property_m";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_propertyId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param propName (プロパティ名): UQ, NotNull, text(2147483647). (NotNull)
     */
    public void uniqueBy(String propName) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("propName");
        setPropName(propName);
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
        if (obj instanceof BsPropertyM) {
            BsPropertyM other = (BsPropertyM)obj;
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
        sb.append(dm).append(xfND(_propName));
        sb.append(dm).append(xfND(_propVal));
        sb.append(dm).append(xfND(_propGroupName));
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
    public PropertyM clone() {
        return (PropertyM)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (プロパティID)property_id: {PK, ID, NotNull, serial(10)} <br>
     * @return The value of the column 'property_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getPropertyId() {
        checkSpecifiedProperty("propertyId");
        return _propertyId;
    }

    /**
     * [set] (プロパティID)property_id: {PK, ID, NotNull, serial(10)} <br>
     * @param propertyId The value of the column 'property_id'. (basically NotNull if update: for the constraint)
     */
    public void setPropertyId(Integer propertyId) {
        registerModifiedProperty("propertyId");
        _propertyId = propertyId;
    }

    /**
     * [get] (プロパティ名)prop_name: {UQ, NotNull, text(2147483647)} <br>
     * @return The value of the column 'prop_name'. (basically NotNull if selected: for the constraint)
     */
    public String getPropName() {
        checkSpecifiedProperty("propName");
        return _propName;
    }

    /**
     * [set] (プロパティ名)prop_name: {UQ, NotNull, text(2147483647)} <br>
     * @param propName The value of the column 'prop_name'. (basically NotNull if update: for the constraint)
     */
    public void setPropName(String propName) {
        registerModifiedProperty("propName");
        _propName = propName;
    }

    /**
     * [get] (プロパティ値)prop_val: {text(2147483647)} <br>
     * @return The value of the column 'prop_val'. (NullAllowed even if selected: for no constraint)
     */
    public String getPropVal() {
        checkSpecifiedProperty("propVal");
        return _propVal;
    }

    /**
     * [set] (プロパティ値)prop_val: {text(2147483647)} <br>
     * @param propVal The value of the column 'prop_val'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPropVal(String propVal) {
        registerModifiedProperty("propVal");
        _propVal = propVal;
    }

    /**
     * [get] (プロパティグループ名)prop_group_name: {text(2147483647)} <br>
     * @return The value of the column 'prop_group_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getPropGroupName() {
        checkSpecifiedProperty("propGroupName");
        return _propGroupName;
    }

    /**
     * [set] (プロパティグループ名)prop_group_name: {text(2147483647)} <br>
     * @param propGroupName The value of the column 'prop_group_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPropGroupName(String propGroupName) {
        registerModifiedProperty("propGroupName");
        _propGroupName = propGroupName;
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
