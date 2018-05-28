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
 * The DB meta of money_reception. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MoneyReceptionDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MoneyReceptionDbm _instance = new MoneyReceptionDbm();
    private MoneyReceptionDbm() {}
    public static MoneyReceptionDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((MoneyReception)et).getMoneyReceptionId(), (et, vl) -> ((MoneyReception)et).setMoneyReceptionId(ctl(vl)), "moneyReceptionId");
        setupEpg(_epgMap, et -> ((MoneyReception)et).getUserId(), (et, vl) -> ((MoneyReception)et).setUserId(cti(vl)), "userId");
        setupEpg(_epgMap, et -> ((MoneyReception)et).getGenreId(), (et, vl) -> ((MoneyReception)et).setGenreId(cti(vl)), "genreId");
        setupEpg(_epgMap, et -> ((MoneyReception)et).getMoneyReceptionFlag(), (et, vl) -> ((MoneyReception)et).setMoneyReceptionFlag((Boolean)vl), "moneyReceptionFlag");
        setupEpg(_epgMap, et -> ((MoneyReception)et).getAmount(), (et, vl) -> ((MoneyReception)et).setAmount(cti(vl)), "amount");
        setupEpg(_epgMap, et -> ((MoneyReception)et).getMoneyReceptionDate(), (et, vl) -> ((MoneyReception)et).setMoneyReceptionDate(ctld(vl)), "moneyReceptionDate");
        setupEpg(_epgMap, et -> ((MoneyReception)et).getSupplement(), (et, vl) -> ((MoneyReception)et).setSupplement((String)vl), "supplement");
        setupEpg(_epgMap, et -> ((MoneyReception)et).getDeleteFlag(), (et, vl) -> ((MoneyReception)et).setDeleteFlag((Boolean)vl), "deleteFlag");
        setupEpg(_epgMap, et -> ((MoneyReception)et).getRegisterDatetime(), (et, vl) -> ((MoneyReception)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((MoneyReception)et).getUpdateDatetime(), (et, vl) -> ((MoneyReception)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "money_reception";
    protected final String _tableDispName = "money_reception";
    protected final String _tablePropertyName = "moneyReception";
    protected final TableSqlName _tableSqlName = new TableSqlName("money_reception", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMoneyReceptionId = cci("money_reception_id", "money_reception_id", null, null, Long.class, "moneyReceptionId", null, true, true, true, "bigserial", 19, 0, null, "nextval('money_reception_money_reception_id_seq'::regclass)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserId = cci("user_id", "user_id", null, "ユーザーID", Integer.class, "userId", null, false, false, true, "int4", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGenreId = cci("genre_id", "genre_id", null, null, Integer.class, "genreId", null, false, false, true, "int4", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMoneyReceptionFlag = cci("money_reception_flag", "money_reception_flag", null, null, Boolean.class, "moneyReceptionFlag", null, false, false, true, "bool", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAmount = cci("amount", "amount", null, null, Integer.class, "amount", null, false, false, true, "int4", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMoneyReceptionDate = cci("money_reception_date", "money_reception_date", null, null, java.time.LocalDate.class, "moneyReceptionDate", null, false, false, true, "date", 13, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSupplement = cci("supplement", "supplement", null, null, String.class, "supplement", null, false, false, false, "text", 2147483647, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeleteFlag = cci("delete_flag", "delete_flag", null, "削除フラグ", Boolean.class, "deleteFlag", null, false, false, true, "bool", 1, 0, null, "false", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, "登録日時", java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "timestamp", 26, 3, null, "now()", true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, "更新日時", java.time.LocalDateTime.class, "updateDatetime", null, false, false, false, "timestamp", 26, 3, null, null, true, null, null, null, null, null, false);

    /**
     * money_reception_id: {PK, ID, NotNull, bigserial(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMoneyReceptionId() { return _columnMoneyReceptionId; }
    /**
     * (ユーザーID)user_id: {NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserId() { return _columnUserId; }
    /**
     * genre_id: {NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGenreId() { return _columnGenreId; }
    /**
     * money_reception_flag: {NotNull, bool(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMoneyReceptionFlag() { return _columnMoneyReceptionFlag; }
    /**
     * amount: {NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAmount() { return _columnAmount; }
    /**
     * money_reception_date: {NotNull, date(13)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMoneyReceptionDate() { return _columnMoneyReceptionDate; }
    /**
     * supplement: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSupplement() { return _columnSupplement; }
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
        ls.add(columnMoneyReceptionId());
        ls.add(columnUserId());
        ls.add(columnGenreId());
        ls.add(columnMoneyReceptionFlag());
        ls.add(columnAmount());
        ls.add(columnMoneyReceptionDate());
        ls.add(columnSupplement());
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
    protected UniqueInfo cpui() { return hpcpui(columnMoneyReceptionId()); }
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
    public String getSequenceName() { return "money_reception_money_reception_id_seq"; }
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
    public String getEntityTypeName() { return "com.olympus.aptx4869.dbflute.exentity.MoneyReception"; }
    public String getConditionBeanTypeName() { return "com.olympus.aptx4869.dbflute.cbean.MoneyReceptionCB"; }
    public String getBehaviorTypeName() { return "com.olympus.aptx4869.dbflute.exbhv.MoneyReceptionBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MoneyReception> getEntityType() { return MoneyReception.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public MoneyReception newEntity() { return new MoneyReception(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((MoneyReception)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((MoneyReception)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
