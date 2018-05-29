package com.olympus.aptx4869.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.olympus.aptx4869.dbflute.cbean.cq.ciq.*;
import com.olympus.aptx4869.dbflute.cbean.*;
import com.olympus.aptx4869.dbflute.cbean.cq.*;

/**
 * The base condition-query of money_reception.
 * @author DBFlute(AutoGenerator)
 */
public class BsMoneyReceptionCQ extends AbstractBsMoneyReceptionCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MoneyReceptionCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMoneyReceptionCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from money_reception) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MoneyReceptionCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MoneyReceptionCIQ xcreateCIQ() {
        MoneyReceptionCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MoneyReceptionCIQ xnewCIQ() {
        return new MoneyReceptionCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join money_reception on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MoneyReceptionCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MoneyReceptionCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _moneyReceptionId;
    public ConditionValue xdfgetMoneyReceptionId()
    { if (_moneyReceptionId == null) { _moneyReceptionId = nCV(); }
      return _moneyReceptionId; }
    protected ConditionValue xgetCValueMoneyReceptionId() { return xdfgetMoneyReceptionId(); }

    /**
     * Add order-by as ascend. <br>
     * money_reception_id: {PK, ID, NotNull, bigserial(19)}
     * @return this. (NotNull)
     */
    public BsMoneyReceptionCQ addOrderBy_MoneyReceptionId_Asc() { regOBA("money_reception_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * money_reception_id: {PK, ID, NotNull, bigserial(19)}
     * @return this. (NotNull)
     */
    public BsMoneyReceptionCQ addOrderBy_MoneyReceptionId_Desc() { regOBD("money_reception_id"); return this; }

    protected ConditionValue _userId;
    public ConditionValue xdfgetUserId()
    { if (_userId == null) { _userId = nCV(); }
      return _userId; }
    protected ConditionValue xgetCValueUserId() { return xdfgetUserId(); }

    /**
     * Add order-by as ascend. <br>
     * (ユーザーID)user_id: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsMoneyReceptionCQ addOrderBy_UserId_Asc() { regOBA("user_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * (ユーザーID)user_id: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsMoneyReceptionCQ addOrderBy_UserId_Desc() { regOBD("user_id"); return this; }

    protected ConditionValue _genreId;
    public ConditionValue xdfgetGenreId()
    { if (_genreId == null) { _genreId = nCV(); }
      return _genreId; }
    protected ConditionValue xgetCValueGenreId() { return xdfgetGenreId(); }

    /**
     * Add order-by as ascend. <br>
     * genre_id: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsMoneyReceptionCQ addOrderBy_GenreId_Asc() { regOBA("genre_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * genre_id: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsMoneyReceptionCQ addOrderBy_GenreId_Desc() { regOBD("genre_id"); return this; }

    protected ConditionValue _moneyReceptionFlag;
    public ConditionValue xdfgetMoneyReceptionFlag()
    { if (_moneyReceptionFlag == null) { _moneyReceptionFlag = nCV(); }
      return _moneyReceptionFlag; }
    protected ConditionValue xgetCValueMoneyReceptionFlag() { return xdfgetMoneyReceptionFlag(); }

    /**
     * Add order-by as ascend. <br>
     * money_reception_flag: {NotNull, bool(1)}
     * @return this. (NotNull)
     */
    public BsMoneyReceptionCQ addOrderBy_MoneyReceptionFlag_Asc() { regOBA("money_reception_flag"); return this; }

    /**
     * Add order-by as descend. <br>
     * money_reception_flag: {NotNull, bool(1)}
     * @return this. (NotNull)
     */
    public BsMoneyReceptionCQ addOrderBy_MoneyReceptionFlag_Desc() { regOBD("money_reception_flag"); return this; }

    protected ConditionValue _amount;
    public ConditionValue xdfgetAmount()
    { if (_amount == null) { _amount = nCV(); }
      return _amount; }
    protected ConditionValue xgetCValueAmount() { return xdfgetAmount(); }

    /**
     * Add order-by as ascend. <br>
     * amount: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsMoneyReceptionCQ addOrderBy_Amount_Asc() { regOBA("amount"); return this; }

    /**
     * Add order-by as descend. <br>
     * amount: {NotNull, int4(10)}
     * @return this. (NotNull)
     */
    public BsMoneyReceptionCQ addOrderBy_Amount_Desc() { regOBD("amount"); return this; }

    protected ConditionValue _moneyReceptionDate;
    public ConditionValue xdfgetMoneyReceptionDate()
    { if (_moneyReceptionDate == null) { _moneyReceptionDate = nCV(); }
      return _moneyReceptionDate; }
    protected ConditionValue xgetCValueMoneyReceptionDate() { return xdfgetMoneyReceptionDate(); }

    /**
     * Add order-by as ascend. <br>
     * money_reception_date: {NotNull, date(13)}
     * @return this. (NotNull)
     */
    public BsMoneyReceptionCQ addOrderBy_MoneyReceptionDate_Asc() { regOBA("money_reception_date"); return this; }

    /**
     * Add order-by as descend. <br>
     * money_reception_date: {NotNull, date(13)}
     * @return this. (NotNull)
     */
    public BsMoneyReceptionCQ addOrderBy_MoneyReceptionDate_Desc() { regOBD("money_reception_date"); return this; }

    protected ConditionValue _supplement;
    public ConditionValue xdfgetSupplement()
    { if (_supplement == null) { _supplement = nCV(); }
      return _supplement; }
    protected ConditionValue xgetCValueSupplement() { return xdfgetSupplement(); }

    /**
     * Add order-by as ascend. <br>
     * supplement: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMoneyReceptionCQ addOrderBy_Supplement_Asc() { regOBA("supplement"); return this; }

    /**
     * Add order-by as descend. <br>
     * supplement: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsMoneyReceptionCQ addOrderBy_Supplement_Desc() { regOBD("supplement"); return this; }

    protected ConditionValue _deleteFlag;
    public ConditionValue xdfgetDeleteFlag()
    { if (_deleteFlag == null) { _deleteFlag = nCV(); }
      return _deleteFlag; }
    protected ConditionValue xgetCValueDeleteFlag() { return xdfgetDeleteFlag(); }

    /**
     * Add order-by as ascend. <br>
     * (削除フラグ)delete_flag: {NotNull, bool(1), default=[false]}
     * @return this. (NotNull)
     */
    public BsMoneyReceptionCQ addOrderBy_DeleteFlag_Asc() { regOBA("delete_flag"); return this; }

    /**
     * Add order-by as descend. <br>
     * (削除フラグ)delete_flag: {NotNull, bool(1), default=[false]}
     * @return this. (NotNull)
     */
    public BsMoneyReceptionCQ addOrderBy_DeleteFlag_Desc() { regOBD("delete_flag"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue xdfgetRegisterDatetime()
    { if (_registerDatetime == null) { _registerDatetime = nCV(); }
      return _registerDatetime; }
    protected ConditionValue xgetCValueRegisterDatetime() { return xdfgetRegisterDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * (登録日時)register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @return this. (NotNull)
     */
    public BsMoneyReceptionCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録日時)register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @return this. (NotNull)
     */
    public BsMoneyReceptionCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

    protected ConditionValue _updateDatetime;
    public ConditionValue xdfgetUpdateDatetime()
    { if (_updateDatetime == null) { _updateDatetime = nCV(); }
      return _updateDatetime; }
    protected ConditionValue xgetCValueUpdateDatetime() { return xdfgetUpdateDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * (更新日時)update_datetime: {timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsMoneyReceptionCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新日時)update_datetime: {timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsMoneyReceptionCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsMoneyReceptionCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsMoneyReceptionCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MoneyReceptionCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MoneyReceptionCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MoneyReceptionCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MoneyReceptionCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MoneyReceptionCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MoneyReceptionCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MoneyReceptionCQ> _myselfExistsMap;
    public Map<String, MoneyReceptionCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MoneyReceptionCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MoneyReceptionCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MoneyReceptionCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MoneyReceptionCB.class.getName(); }
    protected String xCQ() { return MoneyReceptionCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
