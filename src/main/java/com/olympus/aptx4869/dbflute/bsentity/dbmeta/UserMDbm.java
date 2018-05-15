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
 * The DB meta of user_m. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class UserMDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final UserMDbm _instance = new UserMDbm();
    private UserMDbm() {}
    public static UserMDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((UserM)et).getUserId(), (et, vl) -> ((UserM)et).setUserId(cti(vl)), "userId");
        setupEpg(_epgMap, et -> ((UserM)et).getLineId(), (et, vl) -> ((UserM)et).setLineId((String)vl), "lineId");
        setupEpg(_epgMap, et -> ((UserM)et).getLineName(), (et, vl) -> ((UserM)et).setLineName((String)vl), "lineName");
        setupEpg(_epgMap, et -> ((UserM)et).getLineEmail(), (et, vl) -> ((UserM)et).setLineEmail((String)vl), "lineEmail");
        setupEpg(_epgMap, et -> ((UserM)et).getFirstName(), (et, vl) -> ((UserM)et).setFirstName((String)vl), "firstName");
        setupEpg(_epgMap, et -> ((UserM)et).getLastName(), (et, vl) -> ((UserM)et).setLastName((String)vl), "lastName");
        setupEpg(_epgMap, et -> ((UserM)et).getHandleName(), (et, vl) -> ((UserM)et).setHandleName((String)vl), "handleName");
        setupEpg(_epgMap, et -> ((UserM)et).getLastLoginDatetime(), (et, vl) -> ((UserM)et).setLastLoginDatetime(ctldt(vl)), "lastLoginDatetime");
        setupEpg(_epgMap, et -> ((UserM)et).getDeleteFlag(), (et, vl) -> ((UserM)et).setDeleteFlag((Boolean)vl), "deleteFlag");
        setupEpg(_epgMap, et -> ((UserM)et).getRegisterDatetime(), (et, vl) -> ((UserM)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((UserM)et).getUpdateDatetime(), (et, vl) -> ((UserM)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "user_m";
    protected final String _tableDispName = "user_m";
    protected final String _tablePropertyName = "userM";
    protected final TableSqlName _tableSqlName = new TableSqlName("user_m", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }
    protected final String _tableAlias = "ユーザー_M";
    public String getTableAlias() { return _tableAlias; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnUserId = cci("user_id", "user_id", null, "ユーザーID", Integer.class, "userId", null, true, true, true, "serial", 10, 0, null, "nextval('user_m_user_id_seq'::regclass)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLineId = cci("line_id", "line_id", null, "LINE_ID", String.class, "lineId", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLineName = cci("line_name", "line_name", null, "LINE表示名", String.class, "lineName", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLineEmail = cci("line_email", "line_email", null, "LINEのEmail", String.class, "lineEmail", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFirstName = cci("first_name", "first_name", null, "名", String.class, "firstName", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLastName = cci("last_name", "last_name", null, "姓", String.class, "lastName", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnHandleName = cci("handle_name", "handle_name", null, "ハンドル名", String.class, "handleName", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLastLoginDatetime = cci("last_login_datetime", "last_login_datetime", null, "最終ログイン日時", java.time.LocalDateTime.class, "lastLoginDatetime", null, false, false, false, "timestamp", 26, 3, null, "now()", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeleteFlag = cci("delete_flag", "delete_flag", null, "削除フラグ", Boolean.class, "deleteFlag", null, false, false, true, "bool", 1, 0, null, "false", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, "登録日時", java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "timestamp", 26, 3, null, "now()", true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, "更新日時", java.time.LocalDateTime.class, "updateDatetime", null, false, false, false, "timestamp", 26, 3, null, null, true, null, null, null, null, null, false);

    /**
     * (ユーザーID)user_id: {PK, ID, NotNull, serial(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserId() { return _columnUserId; }
    /**
     * (LINE_ID)line_id: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLineId() { return _columnLineId; }
    /**
     * (LINE表示名)line_name: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLineName() { return _columnLineName; }
    /**
     * (LINEのEmail)line_email: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLineEmail() { return _columnLineEmail; }
    /**
     * (名)first_name: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFirstName() { return _columnFirstName; }
    /**
     * (姓)last_name: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLastName() { return _columnLastName; }
    /**
     * (ハンドル名)handle_name: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHandleName() { return _columnHandleName; }
    /**
     * (最終ログイン日時)last_login_datetime: {timestamp(26, 3), default=[now()]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLastLoginDatetime() { return _columnLastLoginDatetime; }
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
        ls.add(columnUserId());
        ls.add(columnLineId());
        ls.add(columnLineName());
        ls.add(columnLineEmail());
        ls.add(columnFirstName());
        ls.add(columnLastName());
        ls.add(columnHandleName());
        ls.add(columnLastLoginDatetime());
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
    protected UniqueInfo cpui() { return hpcpui(columnUserId()); }
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
    public String getSequenceName() { return "user_m_user_id_seq"; }
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
    public String getEntityTypeName() { return "com.olympus.aptx4869.dbflute.exentity.UserM"; }
    public String getConditionBeanTypeName() { return "com.olympus.aptx4869.dbflute.cbean.UserMCB"; }
    public String getBehaviorTypeName() { return "com.olympus.aptx4869.dbflute.exbhv.UserMBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<UserM> getEntityType() { return UserM.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public UserM newEntity() { return new UserM(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((UserM)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((UserM)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
