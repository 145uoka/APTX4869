package com.olympus.aptx4869.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.olympus.aptx4869.dbflute.allcommon.*;
import com.olympus.aptx4869.dbflute.exentity.*;

/**
 * The DB meta of oauth_property_m. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class OauthPropertyMDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final OauthPropertyMDbm _instance = new OauthPropertyMDbm();
    private OauthPropertyMDbm() {}
    public static OauthPropertyMDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((OauthPropertyM)et).getOauthPropertyId(), (et, vl) -> ((OauthPropertyM)et).setOauthPropertyId(cti(vl)), "oauthPropertyId");
        setupEpg(_epgMap, et -> ((OauthPropertyM)et).getAppKey(), (et, vl) -> ((OauthPropertyM)et).setAppKey((String)vl), "appKey");
        setupEpg(_epgMap, et -> ((OauthPropertyM)et).getRedirectUrl(), (et, vl) -> ((OauthPropertyM)et).setRedirectUrl((String)vl), "redirectUrl");
        setupEpg(_epgMap, et -> ((OauthPropertyM)et).getClientId(), (et, vl) -> ((OauthPropertyM)et).setClientId((String)vl), "clientId");
        setupEpg(_epgMap, et -> ((OauthPropertyM)et).getClientSecret(), (et, vl) -> ((OauthPropertyM)et).setClientSecret((String)vl), "clientSecret");
        setupEpg(_epgMap, et -> ((OauthPropertyM)et).getDeleteFlag(), (et, vl) -> ((OauthPropertyM)et).setDeleteFlag((Boolean)vl), "deleteFlag");
        setupEpg(_epgMap, et -> ((OauthPropertyM)et).getRegisterDatetime(), (et, vl) -> ((OauthPropertyM)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((OauthPropertyM)et).getUpdateDatetime(), (et, vl) -> ((OauthPropertyM)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "oauth_property_m";
    protected final String _tableDispName = "oauth_property_m";
    protected final String _tablePropertyName = "oauthPropertyM";
    protected final TableSqlName _tableSqlName = new TableSqlName("oauth_property_m", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "OAuthプロパティ_M";
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnOauthPropertyId = cci("oauth_property_id", "oauth_property_id", null, "OAuthプロパティID", Integer.class, "oauthPropertyId", null, true, true, true, "serial", 10, 0, null, "nextval('oauth_property_m_oauth_property_id_seq'::regclass)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAppKey = cci("app_key", "app_key", null, "アプリケーションKEY", String.class, "appKey", null, false, false, true, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRedirectUrl = cci("redirect_url", "redirect_url", null, "OAuth認証後のcallbackURL", String.class, "redirectUrl", null, false, false, true, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientId = cci("client_id", "client_id", null, "クライアントID", String.class, "clientId", null, false, false, true, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnClientSecret = cci("client_secret", "client_secret", null, "クライアントSECRET", String.class, "clientSecret", null, false, false, true, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeleteFlag = cci("delete_flag", "delete_flag", null, "削除フラグ", Boolean.class, "deleteFlag", null, false, false, true, "bool", 1, 0, null, "false", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, "登録日時", java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "timestamp", 26, 3, null, "now()", true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, "更新日時", java.time.LocalDateTime.class, "updateDatetime", null, false, false, false, "timestamp", 26, 3, null, null, true, null, null, null, null, null, false);

    /**
     * (OAuthプロパティID)oauth_property_id: {PK, ID, NotNull, serial(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOauthPropertyId() { return _columnOauthPropertyId; }
    /**
     * (アプリケーションKEY)app_key: {NotNull, text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAppKey() { return _columnAppKey; }
    /**
     * (OAuth認証後のcallbackURL)redirect_url: {NotNull, text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRedirectUrl() { return _columnRedirectUrl; }
    /**
     * (クライアントID)client_id: {NotNull, text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientId() { return _columnClientId; }
    /**
     * (クライアントSECRET)client_secret: {NotNull, text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnClientSecret() { return _columnClientSecret; }
    /**
     * (削除フラグ)delete_flag: {NotNull, bool(1), default=[false]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeleteFlag() { return _columnDeleteFlag; }
    /**
     * (登録日時)register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    /**
     * (更新日時)update_datetime: {timestamp(26, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnOauthPropertyId());
        ls.add(columnAppKey());
        ls.add(columnRedirectUrl());
        ls.add(columnClientId());
        ls.add(columnClientSecret());
        ls.add(columnDeleteFlag());
        ls.add(columnRegisterDatetime());
        ls.add(columnUpdateDatetime());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnOauthPropertyId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "oauth_property_m_oauth_property_id_seq"; }
    public Integer getSequenceIncrementSize() { return 1; }
    public Integer getSequenceCacheSize() { return null; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnRegisterDatetime(), columnUpdateDatetime()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnRegisterDatetime()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.olympus.aptx4869.dbflute.exentity.OauthPropertyM"; }
    public String getConditionBeanTypeName() { return "com.olympus.aptx4869.dbflute.cbean.OauthPropertyMCB"; }
    public String getBehaviorTypeName() { return "com.olympus.aptx4869.dbflute.exbhv.OauthPropertyMBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<OauthPropertyM> getEntityType() { return OauthPropertyM.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public OauthPropertyM newEntity() { return new OauthPropertyM(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((OauthPropertyM)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((OauthPropertyM)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
