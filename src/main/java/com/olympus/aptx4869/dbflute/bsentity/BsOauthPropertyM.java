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
 * The entity of (OAuthプロパティ_M)oauth_property_m as TABLE. <br>
 * <pre>
 * [primary-key]
 *     oauth_property_id
 *
 * [column]
 *     oauth_property_id, app_key, redirect_url, client_id, client_secret, delete_flag, register_datetime, update_datetime
 *
 * [sequence]
 *     oauth_property_m_oauth_property_id_seq
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
 * Integer oauthPropertyId = entity.getOauthPropertyId();
 * String appKey = entity.getAppKey();
 * String redirectUrl = entity.getRedirectUrl();
 * String clientId = entity.getClientId();
 * String clientSecret = entity.getClientSecret();
 * Boolean deleteFlag = entity.getDeleteFlag();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * entity.setOauthPropertyId(oauthPropertyId);
 * entity.setAppKey(appKey);
 * entity.setRedirectUrl(redirectUrl);
 * entity.setClientId(clientId);
 * entity.setClientSecret(clientSecret);
 * entity.setDeleteFlag(deleteFlag);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setUpdateDatetime(updateDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsOauthPropertyM extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** (OAuthプロパティID)oauth_property_id: {PK, ID, NotNull, serial(10)} */
    protected Integer _oauthPropertyId;

    /** (アプリケーションKEY)app_key: {NotNull, text(2147483647)} */
    protected String _appKey;

    /** (OAuth認証後のcallbackURL)redirect_url: {NotNull, text(2147483647)} */
    protected String _redirectUrl;

    /** (クライアントID)client_id: {NotNull, text(2147483647)} */
    protected String _clientId;

    /** (クライアントSECRET)client_secret: {NotNull, text(2147483647)} */
    protected String _clientSecret;

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
        return "oauth_property_m";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_oauthPropertyId == null) { return false; }
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
        if (obj instanceof BsOauthPropertyM) {
            BsOauthPropertyM other = (BsOauthPropertyM)obj;
            if (!xSV(_oauthPropertyId, other._oauthPropertyId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _oauthPropertyId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_oauthPropertyId));
        sb.append(dm).append(xfND(_appKey));
        sb.append(dm).append(xfND(_redirectUrl));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_clientSecret));
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
    public OauthPropertyM clone() {
        return (OauthPropertyM)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] (OAuthプロパティID)oauth_property_id: {PK, ID, NotNull, serial(10)} <br>
     * @return The value of the column 'oauth_property_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getOauthPropertyId() {
        checkSpecifiedProperty("oauthPropertyId");
        return _oauthPropertyId;
    }

    /**
     * [set] (OAuthプロパティID)oauth_property_id: {PK, ID, NotNull, serial(10)} <br>
     * @param oauthPropertyId The value of the column 'oauth_property_id'. (basically NotNull if update: for the constraint)
     */
    public void setOauthPropertyId(Integer oauthPropertyId) {
        registerModifiedProperty("oauthPropertyId");
        _oauthPropertyId = oauthPropertyId;
    }

    /**
     * [get] (アプリケーションKEY)app_key: {NotNull, text(2147483647)} <br>
     * @return The value of the column 'app_key'. (basically NotNull if selected: for the constraint)
     */
    public String getAppKey() {
        checkSpecifiedProperty("appKey");
        return _appKey;
    }

    /**
     * [set] (アプリケーションKEY)app_key: {NotNull, text(2147483647)} <br>
     * @param appKey The value of the column 'app_key'. (basically NotNull if update: for the constraint)
     */
    public void setAppKey(String appKey) {
        registerModifiedProperty("appKey");
        _appKey = appKey;
    }

    /**
     * [get] (OAuth認証後のcallbackURL)redirect_url: {NotNull, text(2147483647)} <br>
     * @return The value of the column 'redirect_url'. (basically NotNull if selected: for the constraint)
     */
    public String getRedirectUrl() {
        checkSpecifiedProperty("redirectUrl");
        return _redirectUrl;
    }

    /**
     * [set] (OAuth認証後のcallbackURL)redirect_url: {NotNull, text(2147483647)} <br>
     * @param redirectUrl The value of the column 'redirect_url'. (basically NotNull if update: for the constraint)
     */
    public void setRedirectUrl(String redirectUrl) {
        registerModifiedProperty("redirectUrl");
        _redirectUrl = redirectUrl;
    }

    /**
     * [get] (クライアントID)client_id: {NotNull, text(2147483647)} <br>
     * @return The value of the column 'client_id'. (basically NotNull if selected: for the constraint)
     */
    public String getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] (クライアントID)client_id: {NotNull, text(2147483647)} <br>
     * @param clientId The value of the column 'client_id'. (basically NotNull if update: for the constraint)
     */
    public void setClientId(String clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
    }

    /**
     * [get] (クライアントSECRET)client_secret: {NotNull, text(2147483647)} <br>
     * @return The value of the column 'client_secret'. (basically NotNull if selected: for the constraint)
     */
    public String getClientSecret() {
        checkSpecifiedProperty("clientSecret");
        return _clientSecret;
    }

    /**
     * [set] (クライアントSECRET)client_secret: {NotNull, text(2147483647)} <br>
     * @param clientSecret The value of the column 'client_secret'. (basically NotNull if update: for the constraint)
     */
    public void setClientSecret(String clientSecret) {
        registerModifiedProperty("clientSecret");
        _clientSecret = clientSecret;
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
