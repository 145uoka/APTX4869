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
 * The base condition-query of property_m.
 * @author DBFlute(AutoGenerator)
 */
public class BsPropertyMCQ extends AbstractBsPropertyMCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected PropertyMCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsPropertyMCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from property_m) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public PropertyMCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected PropertyMCIQ xcreateCIQ() {
        PropertyMCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected PropertyMCIQ xnewCIQ() {
        return new PropertyMCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join property_m on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public PropertyMCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        PropertyMCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
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
     * (プロパティID)property_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsPropertyMCQ addOrderBy_PropertyId_Asc() { regOBA("property_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * (プロパティID)property_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsPropertyMCQ addOrderBy_PropertyId_Desc() { regOBD("property_id"); return this; }

    protected ConditionValue _propName;
    public ConditionValue xdfgetPropName()
    { if (_propName == null) { _propName = nCV(); }
      return _propName; }
    protected ConditionValue xgetCValuePropName() { return xdfgetPropName(); }

    /**
     * Add order-by as ascend. <br>
     * (プロパティ名)prop_name: {UQ, NotNull, text(2147483647)}
     * @return this. (NotNull)
     */
    public BsPropertyMCQ addOrderBy_PropName_Asc() { regOBA("prop_name"); return this; }

    /**
     * Add order-by as descend. <br>
     * (プロパティ名)prop_name: {UQ, NotNull, text(2147483647)}
     * @return this. (NotNull)
     */
    public BsPropertyMCQ addOrderBy_PropName_Desc() { regOBD("prop_name"); return this; }

    protected ConditionValue _propVal;
    public ConditionValue xdfgetPropVal()
    { if (_propVal == null) { _propVal = nCV(); }
      return _propVal; }
    protected ConditionValue xgetCValuePropVal() { return xdfgetPropVal(); }

    /**
     * Add order-by as ascend. <br>
     * (プロパティ値)prop_val: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsPropertyMCQ addOrderBy_PropVal_Asc() { regOBA("prop_val"); return this; }

    /**
     * Add order-by as descend. <br>
     * (プロパティ値)prop_val: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsPropertyMCQ addOrderBy_PropVal_Desc() { regOBD("prop_val"); return this; }

    protected ConditionValue _propGroupName;
    public ConditionValue xdfgetPropGroupName()
    { if (_propGroupName == null) { _propGroupName = nCV(); }
      return _propGroupName; }
    protected ConditionValue xgetCValuePropGroupName() { return xdfgetPropGroupName(); }

    /**
     * Add order-by as ascend. <br>
     * (プロパティグループ名)prop_group_name: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsPropertyMCQ addOrderBy_PropGroupName_Asc() { regOBA("prop_group_name"); return this; }

    /**
     * Add order-by as descend. <br>
     * (プロパティグループ名)prop_group_name: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsPropertyMCQ addOrderBy_PropGroupName_Desc() { regOBD("prop_group_name"); return this; }

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
    public BsPropertyMCQ addOrderBy_DeleteFlag_Asc() { regOBA("delete_flag"); return this; }

    /**
     * Add order-by as descend. <br>
     * (削除フラグ)delete_flag: {NotNull, bool(1), default=[false]}
     * @return this. (NotNull)
     */
    public BsPropertyMCQ addOrderBy_DeleteFlag_Desc() { regOBD("delete_flag"); return this; }

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
    public BsPropertyMCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録日時)register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @return this. (NotNull)
     */
    public BsPropertyMCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

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
    public BsPropertyMCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新日時)update_datetime: {timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsPropertyMCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

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
    public BsPropertyMCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsPropertyMCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, PropertyMCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(PropertyMCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, PropertyMCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(PropertyMCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, PropertyMCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(PropertyMCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, PropertyMCQ> _myselfExistsMap;
    public Map<String, PropertyMCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(PropertyMCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, PropertyMCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(PropertyMCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return PropertyMCB.class.getName(); }
    protected String xCQ() { return PropertyMCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
