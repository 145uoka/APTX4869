package com.olympus.aptx4869.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.olympus.aptx4869.dbflute.allcommon.*;
import com.olympus.aptx4869.dbflute.exentity.*;

/**
 * The DB meta of regularly_data. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class RegularlyDataDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final RegularlyDataDbm _instance = new RegularlyDataDbm();
    private RegularlyDataDbm() {}
    public static RegularlyDataDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((RegularlyData)et).getPropertyId(), (et, vl) -> ((RegularlyData)et).setPropertyId(cti(vl)), "propertyId");
        setupEpg(_epgMap, et -> ((RegularlyData)et).getUserId(), (et, vl) -> ((RegularlyData)et).setUserId(cti(vl)), "userId");
        setupEpg(_epgMap, et -> ((RegularlyData)et).getRegularlyFlag(), (et, vl) -> ((RegularlyData)et).setRegularlyFlag((Boolean)vl), "regularlyFlag");
        setupEpg(_epgMap, et -> ((RegularlyData)et).getAmount(), (et, vl) -> ((RegularlyData)et).setAmount(cti(vl)), "amount");
        setupEpg(_epgMap, et -> ((RegularlyData)et).getAccountingdate(), (et, vl) -> ((RegularlyData)et).setAccountingdate(cti(vl)), "accountingdate");
        setupEpg(_epgMap, et -> ((RegularlyData)et).getDeleteFlag(), (et, vl) -> ((RegularlyData)et).setDeleteFlag((Boolean)vl), "deleteFlag");
        setupEpg(_epgMap, et -> ((RegularlyData)et).getRegisterDatetime(), (et, vl) -> ((RegularlyData)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((RegularlyData)et).getUpdateDatetime(), (et, vl) -> ((RegularlyData)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    @SuppressWarnings("unchecked")
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((RegularlyData)et).getUserM(), (et, vl) -> ((RegularlyData)et).setUserM((OptionalEntity<UserM>)vl), "userM");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "regularly_data";
    protected final String _tableDispName = "regularly_data";
    protected final String _tablePropertyName = "regularlyData";
    protected final TableSqlName _tableSqlName = new TableSqlName("regularly_data", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPropertyId = cci("property_id", "property_id", null, null, Integer.class, "propertyId", null, true, true, true, "serial", 10, 0, null, "nextval('regularly_data_property_id_seq'::regclass)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserId = cci("user_id", "user_id", null, "ユーザーID", Integer.class, "userId", null, false, false, true, "int4", 10, 0, null, null, false, null, null, "userM", null, null, false);
    protected final ColumnInfo _columnRegularlyFlag = cci("regularly_flag", "regularly_flag", null, null, Boolean.class, "regularlyFlag", null, false, false, true, "bool", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAmount = cci("amount", "amount", null, null, Integer.class, "amount", null, false, false, true, "int4", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAccountingdate = cci("accountingdate", "accountingdate", null, null, Integer.class, "accountingdate", null, false, false, true, "int4", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeleteFlag = cci("delete_flag", "delete_flag", null, "削除フラグ", Boolean.class, "deleteFlag", null, false, false, true, "bool", 1, 0, null, "false", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, "登録日時", java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "timestamp", 26, 3, null, "now()", true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, "更新日時", java.time.LocalDateTime.class, "updateDatetime", null, false, false, false, "timestamp", 26, 3, null, null, true, null, null, null, null, null, false);

    /**
     * property_id: {PK, ID, NotNull, serial(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPropertyId() { return _columnPropertyId; }
    /**
     * (ユーザーID)user_id: {NotNull, int4(10), FK to user_m}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserId() { return _columnUserId; }
    /**
     * regularly_flag: {NotNull, bool(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegularlyFlag() { return _columnRegularlyFlag; }
    /**
     * amount: {NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAmount() { return _columnAmount; }
    /**
     * accountingdate: {NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAccountingdate() { return _columnAccountingdate; }
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
        ls.add(columnPropertyId());
        ls.add(columnUserId());
        ls.add(columnRegularlyFlag());
        ls.add(columnAmount());
        ls.add(columnAccountingdate());
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
    protected UniqueInfo cpui() { return hpcpui(columnPropertyId()); }
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
    /**
     * (ユーザー_M)user_m by my user_id, named 'userM'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignUserM() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), UserMDbm.getInstance().columnUserId());
        return cfi("regularly_data_user_id_fkey", "userM", this, UserMDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "regularlyDataList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "regularly_data_property_id_seq"; }
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
    public String getEntityTypeName() { return "com.olympus.aptx4869.dbflute.exentity.RegularlyData"; }
    public String getConditionBeanTypeName() { return "com.olympus.aptx4869.dbflute.cbean.RegularlyDataCB"; }
    public String getBehaviorTypeName() { return "com.olympus.aptx4869.dbflute.exbhv.RegularlyDataBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<RegularlyData> getEntityType() { return RegularlyData.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public RegularlyData newEntity() { return new RegularlyData(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((RegularlyData)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((RegularlyData)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
