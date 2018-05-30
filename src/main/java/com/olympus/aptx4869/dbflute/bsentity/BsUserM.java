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
 * The entity of (ユーザー_M)user_m as TABLE. <br>
 * <pre>
 * [primary-key]
 *     user_id
 *
 * [column]
 *     user_id, line_id, line_email, line_name, first_name, last_name, handle_name, last_login_datetime, settlement_date, delete_flag, register_datetime, update_datetime
 *
 * [sequence]
 *     user_m_user_id_seq
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
 *     money_reception, regularly_data, user_property
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     moneyReceptionList, regularlyDataList, userPropertyList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer userId = entity.getUserId();
 * String lineId = entity.getLineId();
 * String lineEmail = entity.getLineEmail();
 * String lineName = entity.getLineName();
 * String firstName = entity.getFirstName();
 * String lastName = entity.getLastName();
 * String handleName = entity.getHandleName();
 * java.time.LocalDateTime lastLoginDatetime = entity.getLastLoginDatetime();
 * Integer settlementDate = entity.getSettlementDate();
 * Boolean deleteFlag = entity.getDeleteFlag();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * entity.setUserId(userId);
 * entity.setLineId(lineId);
 * entity.setLineEmail(lineEmail);
 * entity.setLineName(lineName);
 * entity.setFirstName(firstName);
 * entity.setLastName(lastName);
 * entity.setHandleName(handleName);
 * entity.setLastLoginDatetime(lastLoginDatetime);
 * entity.setSettlementDate(settlementDate);
 * entity.setDeleteFlag(deleteFlag);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setUpdateDatetime(updateDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsUserM extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (ユーザーID)user_id: {PK, ID, NotNull, serial(10)} */
    protected Integer _userId;

    /** (LINE_ID)line_id: {text(2147483647)} */
    protected String _lineId;

    /** (LINEのEmail)line_email: {text(2147483647)} */
    protected String _lineEmail;

    /** (LINE表示名)line_name: {text(2147483647)} */
    protected String _lineName;

    /** (名)first_name: {text(2147483647)} */
    protected String _firstName;

    /** (姓)last_name: {text(2147483647)} */
    protected String _lastName;

    /** (ハンドル名)handle_name: {text(2147483647)} */
    protected String _handleName;

    /** (最終ログイン日時)last_login_datetime: {timestamp(26, 3), default=[now()]} */
    protected java.time.LocalDateTime _lastLoginDatetime;

    /** settlement_date: {int4(10)} */
    protected Integer _settlementDate;

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
        return "user_m";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_userId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** money_reception by user_id, named 'moneyReceptionList'. */
    protected List<MoneyReception> _moneyReceptionList;

    /**
     * [get] money_reception by user_id, named 'moneyReceptionList'.
     * @return The entity list of referrer property 'moneyReceptionList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MoneyReception> getMoneyReceptionList() {
        if (_moneyReceptionList == null) { _moneyReceptionList = newReferrerList(); }
        return _moneyReceptionList;
    }

    /**
     * [set] money_reception by user_id, named 'moneyReceptionList'.
     * @param moneyReceptionList The entity list of referrer property 'moneyReceptionList'. (NullAllowed)
     */
    public void setMoneyReceptionList(List<MoneyReception> moneyReceptionList) {
        _moneyReceptionList = moneyReceptionList;
    }

    /** regularly_data by user_id, named 'regularlyDataList'. */
    protected List<RegularlyData> _regularlyDataList;

    /**
     * [get] regularly_data by user_id, named 'regularlyDataList'.
     * @return The entity list of referrer property 'regularlyDataList'. (NotNull: even if no loading, returns empty list)
     */
    public List<RegularlyData> getRegularlyDataList() {
        if (_regularlyDataList == null) { _regularlyDataList = newReferrerList(); }
        return _regularlyDataList;
    }

    /**
     * [set] regularly_data by user_id, named 'regularlyDataList'.
     * @param regularlyDataList The entity list of referrer property 'regularlyDataList'. (NullAllowed)
     */
    public void setRegularlyDataList(List<RegularlyData> regularlyDataList) {
        _regularlyDataList = regularlyDataList;
    }

    /** user_property by user_id, named 'userPropertyList'. */
    protected List<UserProperty> _userPropertyList;

    /**
     * [get] user_property by user_id, named 'userPropertyList'.
     * @return The entity list of referrer property 'userPropertyList'. (NotNull: even if no loading, returns empty list)
     */
    public List<UserProperty> getUserPropertyList() {
        if (_userPropertyList == null) { _userPropertyList = newReferrerList(); }
        return _userPropertyList;
    }

    /**
     * [set] user_property by user_id, named 'userPropertyList'.
     * @param userPropertyList The entity list of referrer property 'userPropertyList'. (NullAllowed)
     */
    public void setUserPropertyList(List<UserProperty> userPropertyList) {
        _userPropertyList = userPropertyList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsUserM) {
            BsUserM other = (BsUserM)obj;
            if (!xSV(_userId, other._userId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _userId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_moneyReceptionList != null) { for (MoneyReception et : _moneyReceptionList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "moneyReceptionList")); } } }
        if (_regularlyDataList != null) { for (RegularlyData et : _regularlyDataList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "regularlyDataList")); } } }
        if (_userPropertyList != null) { for (UserProperty et : _userPropertyList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "userPropertyList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_userId));
        sb.append(dm).append(xfND(_lineId));
        sb.append(dm).append(xfND(_lineEmail));
        sb.append(dm).append(xfND(_lineName));
        sb.append(dm).append(xfND(_firstName));
        sb.append(dm).append(xfND(_lastName));
        sb.append(dm).append(xfND(_handleName));
        sb.append(dm).append(xfND(_lastLoginDatetime));
        sb.append(dm).append(xfND(_settlementDate));
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
        if (_moneyReceptionList != null && !_moneyReceptionList.isEmpty())
        { sb.append(dm).append("moneyReceptionList"); }
        if (_regularlyDataList != null && !_regularlyDataList.isEmpty())
        { sb.append(dm).append("regularlyDataList"); }
        if (_userPropertyList != null && !_userPropertyList.isEmpty())
        { sb.append(dm).append("userPropertyList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public UserM clone() {
        return (UserM)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (ユーザーID)user_id: {PK, ID, NotNull, serial(10)} <br>
     * @return The value of the column 'user_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getUserId() {
        checkSpecifiedProperty("userId");
        return _userId;
    }

    /**
     * [set] (ユーザーID)user_id: {PK, ID, NotNull, serial(10)} <br>
     * @param userId The value of the column 'user_id'. (basically NotNull if update: for the constraint)
     */
    public void setUserId(Integer userId) {
        registerModifiedProperty("userId");
        _userId = userId;
    }

    /**
     * [get] (LINE_ID)line_id: {text(2147483647)} <br>
     * @return The value of the column 'line_id'. (NullAllowed even if selected: for no constraint)
     */
    public String getLineId() {
        checkSpecifiedProperty("lineId");
        return _lineId;
    }

    /**
     * [set] (LINE_ID)line_id: {text(2147483647)} <br>
     * @param lineId The value of the column 'line_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLineId(String lineId) {
        registerModifiedProperty("lineId");
        _lineId = lineId;
    }

    /**
     * [get] (LINEのEmail)line_email: {text(2147483647)} <br>
     * @return The value of the column 'line_email'. (NullAllowed even if selected: for no constraint)
     */
    public String getLineEmail() {
        checkSpecifiedProperty("lineEmail");
        return _lineEmail;
    }

    /**
     * [set] (LINEのEmail)line_email: {text(2147483647)} <br>
     * @param lineEmail The value of the column 'line_email'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLineEmail(String lineEmail) {
        registerModifiedProperty("lineEmail");
        _lineEmail = lineEmail;
    }

    /**
     * [get] (LINE表示名)line_name: {text(2147483647)} <br>
     * @return The value of the column 'line_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getLineName() {
        checkSpecifiedProperty("lineName");
        return _lineName;
    }

    /**
     * [set] (LINE表示名)line_name: {text(2147483647)} <br>
     * @param lineName The value of the column 'line_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLineName(String lineName) {
        registerModifiedProperty("lineName");
        _lineName = lineName;
    }

    /**
     * [get] (名)first_name: {text(2147483647)} <br>
     * @return The value of the column 'first_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getFirstName() {
        checkSpecifiedProperty("firstName");
        return _firstName;
    }

    /**
     * [set] (名)first_name: {text(2147483647)} <br>
     * @param firstName The value of the column 'first_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFirstName(String firstName) {
        registerModifiedProperty("firstName");
        _firstName = firstName;
    }

    /**
     * [get] (姓)last_name: {text(2147483647)} <br>
     * @return The value of the column 'last_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getLastName() {
        checkSpecifiedProperty("lastName");
        return _lastName;
    }

    /**
     * [set] (姓)last_name: {text(2147483647)} <br>
     * @param lastName The value of the column 'last_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLastName(String lastName) {
        registerModifiedProperty("lastName");
        _lastName = lastName;
    }

    /**
     * [get] (ハンドル名)handle_name: {text(2147483647)} <br>
     * @return The value of the column 'handle_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getHandleName() {
        checkSpecifiedProperty("handleName");
        return _handleName;
    }

    /**
     * [set] (ハンドル名)handle_name: {text(2147483647)} <br>
     * @param handleName The value of the column 'handle_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHandleName(String handleName) {
        registerModifiedProperty("handleName");
        _handleName = handleName;
    }

    /**
     * [get] (最終ログイン日時)last_login_datetime: {timestamp(26, 3), default=[now()]} <br>
     * @return The value of the column 'last_login_datetime'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getLastLoginDatetime() {
        checkSpecifiedProperty("lastLoginDatetime");
        return _lastLoginDatetime;
    }

    /**
     * [set] (最終ログイン日時)last_login_datetime: {timestamp(26, 3), default=[now()]} <br>
     * @param lastLoginDatetime The value of the column 'last_login_datetime'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLastLoginDatetime(java.time.LocalDateTime lastLoginDatetime) {
        registerModifiedProperty("lastLoginDatetime");
        _lastLoginDatetime = lastLoginDatetime;
    }

    /**
     * [get] settlement_date: {int4(10)} <br>
     * @return The value of the column 'settlement_date'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getSettlementDate() {
        checkSpecifiedProperty("settlementDate");
        return _settlementDate;
    }

    /**
     * [set] settlement_date: {int4(10)} <br>
     * @param settlementDate The value of the column 'settlement_date'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSettlementDate(Integer settlementDate) {
        registerModifiedProperty("settlementDate");
        _settlementDate = settlementDate;
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
