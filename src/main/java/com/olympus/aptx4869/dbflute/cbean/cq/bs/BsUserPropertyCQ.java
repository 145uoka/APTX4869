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
 * The base condition-query of user_property.
 * @author DBFlute(AutoGenerator)
 */
public class BsUserPropertyCQ extends AbstractBsUserPropertyCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected UserPropertyCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsUserPropertyCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from user_property) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public UserPropertyCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected UserPropertyCIQ xcreateCIQ() {
        UserPropertyCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected UserPropertyCIQ xnewCIQ() {
        return new UserPropertyCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join user_property on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public UserPropertyCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        UserPropertyCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _propertyId;
    public ConditionValue xdfgetPropertyId()
    { if (_propertyId == null) { _propertyId = nCV(); }
      return _propertyId; }
    protected ConditionValue xgetCValuePropertyId() { return xdfgetPropertyId(); }

    /**
     * Add order-by as ascend. <br>
     * property_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsUserPropertyCQ addOrderBy_PropertyId_Asc() { regOBA("property_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * property_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsUserPropertyCQ addOrderBy_PropertyId_Desc() { regOBD("property_id"); return this; }

    protected ConditionValue _userId;
    public ConditionValue xdfgetUserId()
    { if (_userId == null) { _userId = nCV(); }
      return _userId; }
    protected ConditionValue xgetCValueUserId() { return xdfgetUserId(); }

    /**
     * Add order-by as ascend. <br>
     * (ユーザーID)user_id: {NotNull, int4(10), FK to user_m}
     * @return this. (NotNull)
     */
    public BsUserPropertyCQ addOrderBy_UserId_Asc() { regOBA("user_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * (ユーザーID)user_id: {NotNull, int4(10), FK to user_m}
     * @return this. (NotNull)
     */
    public BsUserPropertyCQ addOrderBy_UserId_Desc() { regOBD("user_id"); return this; }

    protected ConditionValue _settlementDate;
    public ConditionValue xdfgetSettlementDate()
    { if (_settlementDate == null) { _settlementDate = nCV(); }
      return _settlementDate; }
    protected ConditionValue xgetCValueSettlementDate() { return xdfgetSettlementDate(); }

    /**
     * Add order-by as ascend. <br>
     * settlement_date: {int4(10)}
     * @return this. (NotNull)
     */
    public BsUserPropertyCQ addOrderBy_SettlementDate_Asc() { regOBA("settlement_date"); return this; }

    /**
     * Add order-by as descend. <br>
     * settlement_date: {int4(10)}
     * @return this. (NotNull)
     */
    public BsUserPropertyCQ addOrderBy_SettlementDate_Desc() { regOBD("settlement_date"); return this; }

    protected ConditionValue _budget;
    public ConditionValue xdfgetBudget()
    { if (_budget == null) { _budget = nCV(); }
      return _budget; }
    protected ConditionValue xgetCValueBudget() { return xdfgetBudget(); }

    /**
     * Add order-by as ascend. <br>
     * budget: {int4(10)}
     * @return this. (NotNull)
     */
    public BsUserPropertyCQ addOrderBy_Budget_Asc() { regOBA("budget"); return this; }

    /**
     * Add order-by as descend. <br>
     * budget: {int4(10)}
     * @return this. (NotNull)
     */
    public BsUserPropertyCQ addOrderBy_Budget_Desc() { regOBD("budget"); return this; }

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
    public BsUserPropertyCQ addOrderBy_DeleteFlag_Asc() { regOBA("delete_flag"); return this; }

    /**
     * Add order-by as descend. <br>
     * (削除フラグ)delete_flag: {NotNull, bool(1), default=[false]}
     * @return this. (NotNull)
     */
    public BsUserPropertyCQ addOrderBy_DeleteFlag_Desc() { regOBD("delete_flag"); return this; }

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
    public BsUserPropertyCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録日時)register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @return this. (NotNull)
     */
    public BsUserPropertyCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

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
    public BsUserPropertyCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新日時)update_datetime: {timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsUserPropertyCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

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
    public BsUserPropertyCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsUserPropertyCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        UserPropertyCQ bq = (UserPropertyCQ)bqs;
        UserPropertyCQ uq = (UserPropertyCQ)uqs;
        if (bq.hasConditionQueryUserM()) {
            uq.queryUserM().reflectRelationOnUnionQuery(bq.queryUserM(), uq.queryUserM());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * (ユーザー_M)user_m by my user_id, named 'userM'.
     * @return The instance of condition-query. (NotNull)
     */
    public UserMCQ queryUserM() {
        return xdfgetConditionQueryUserM();
    }
    public UserMCQ xdfgetConditionQueryUserM() {
        String prop = "userM";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryUserM()); xsetupOuterJoinUserM(); }
        return xgetQueRlMap(prop);
    }
    protected UserMCQ xcreateQueryUserM() {
        String nrp = xresolveNRP("user_property", "userM"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new UserMCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "userM", nrp);
    }
    protected void xsetupOuterJoinUserM() { xregOutJo("userM"); }
    public boolean hasConditionQueryUserM() { return xhasQueRlMap("userM"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, UserPropertyCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(UserPropertyCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, UserPropertyCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(UserPropertyCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, UserPropertyCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(UserPropertyCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, UserPropertyCQ> _myselfExistsMap;
    public Map<String, UserPropertyCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(UserPropertyCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, UserPropertyCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(UserPropertyCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return UserPropertyCB.class.getName(); }
    protected String xCQ() { return UserPropertyCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
