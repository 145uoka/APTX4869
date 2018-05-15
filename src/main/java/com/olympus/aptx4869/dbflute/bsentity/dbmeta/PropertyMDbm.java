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
 * The DB meta of property_m. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class PropertyMDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final PropertyMDbm _instance = new PropertyMDbm();
    private PropertyMDbm() {}
    public static PropertyMDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((PropertyM)et).getPropertyId(), (et, vl) -> ((PropertyM)et).setPropertyId(cti(vl)), "propertyId");
        setupEpg(_epgMap, et -> ((PropertyM)et).getPropName(), (et, vl) -> ((PropertyM)et).setPropName((String)vl), "propName");
        setupEpg(_epgMap, et -> ((PropertyM)et).getPropVal(), (et, vl) -> ((PropertyM)et).setPropVal((String)vl), "propVal");
        setupEpg(_epgMap, et -> ((PropertyM)et).getPropGroupName(), (et, vl) -> ((PropertyM)et).setPropGroupName((String)vl), "propGroupName");
        setupEpg(_epgMap, et -> ((PropertyM)et).getDeleteFlag(), (et, vl) -> ((PropertyM)et).setDeleteFlag((Boolean)vl), "deleteFlag");
        setupEpg(_epgMap, et -> ((PropertyM)et).getRegisterDatetime(), (et, vl) -> ((PropertyM)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((PropertyM)et).getUpdateDatetime(), (et, vl) -> ((PropertyM)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "property_m";
    protected final String _tableDispName = "property_m";
    protected final String _tablePropertyName = "propertyM";
    protected final TableSqlName _tableSqlName = new TableSqlName("property_m", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPropertyId = cci("property_id", "property_id", null, "プロパティID", Integer.class, "propertyId", null, true, true, true, "serial", 10, 0, null, "nextval('property_m_property_id_seq'::regclass)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPropName = cci("prop_name", "prop_name", null, "プロパティ名", String.class, "propName", null, false, false, true, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPropVal = cci("prop_val", "prop_val", null, "プロパティ値", String.class, "propVal", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPropGroupName = cci("prop_group_name", "prop_group_name", null, "プロパティグループ名", String.class, "propGroupName", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeleteFlag = cci("delete_flag", "delete_flag", null, "削除フラグ", Boolean.class, "deleteFlag", null, false, false, true, "bool", 1, 0, null, "false", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, "登録日時", java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "timestamp", 26, 3, null, "now()", true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, "更新日時", java.time.LocalDateTime.class, "updateDatetime", null, false, false, false, "timestamp", 26, 3, null, null, true, null, null, null, null, null, false);

    /**
     * (プロパティID)property_id: {PK, ID, NotNull, serial(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPropertyId() { return _columnPropertyId; }
    /**
     * (プロパティ名)prop_name: {UQ, NotNull, text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPropName() { return _columnPropName; }
    /**
     * (プロパティ値)prop_val: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPropVal() { return _columnPropVal; }
    /**
     * (プロパティグループ名)prop_group_name: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPropGroupName() { return _columnPropGroupName; }
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
        ls.add(columnPropName());
        ls.add(columnPropVal());
        ls.add(columnPropGroupName());
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

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnPropName()); }

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
    public String getSequenceName() { return "property_m_property_id_seq"; }
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
    public String getEntityTypeName() { return "com.olympus.aptx4869.dbflute.exentity.PropertyM"; }
    public String getConditionBeanTypeName() { return "com.olympus.aptx4869.dbflute.cbean.PropertyMCB"; }
    public String getBehaviorTypeName() { return "com.olympus.aptx4869.dbflute.exbhv.PropertyMBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<PropertyM> getEntityType() { return PropertyM.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public PropertyM newEntity() { return new PropertyM(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((PropertyM)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((PropertyM)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
