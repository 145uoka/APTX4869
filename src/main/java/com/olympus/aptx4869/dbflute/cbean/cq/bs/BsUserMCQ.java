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
 * The base condition-query of user_m.
 * @author DBFlute(AutoGenerator)
 */
public class BsUserMCQ extends AbstractBsUserMCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected UserMCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsUserMCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from user_m) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public UserMCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected UserMCIQ xcreateCIQ() {
        UserMCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected UserMCIQ xnewCIQ() {
        return new UserMCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join user_m on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public UserMCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        UserMCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _userId;
    public ConditionValue xdfgetUserId()
    { if (_userId == null) { _userId = nCV(); }
      return _userId; }
    protected ConditionValue xgetCValueUserId() { return xdfgetUserId(); }

    /**
     * Add order-by as ascend. <br>
     * (ユーザーID)user_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsUserMCQ addOrderBy_UserId_Asc() { regOBA("user_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * (ユーザーID)user_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsUserMCQ addOrderBy_UserId_Desc() { regOBD("user_id"); return this; }

    protected ConditionValue _lineId;
    public ConditionValue xdfgetLineId()
    { if (_lineId == null) { _lineId = nCV(); }
      return _lineId; }
    protected ConditionValue xgetCValueLineId() { return xdfgetLineId(); }

    /**
     * Add order-by as ascend. <br>
     * (LINE_ID)line_id: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsUserMCQ addOrderBy_LineId_Asc() { regOBA("line_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * (LINE_ID)line_id: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsUserMCQ addOrderBy_LineId_Desc() { regOBD("line_id"); return this; }

    protected ConditionValue _lineEmail;
    public ConditionValue xdfgetLineEmail()
    { if (_lineEmail == null) { _lineEmail = nCV(); }
      return _lineEmail; }
    protected ConditionValue xgetCValueLineEmail() { return xdfgetLineEmail(); }

    /**
     * Add order-by as ascend. <br>
     * (LINEのEmail)line_email: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsUserMCQ addOrderBy_LineEmail_Asc() { regOBA("line_email"); return this; }

    /**
     * Add order-by as descend. <br>
     * (LINEのEmail)line_email: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsUserMCQ addOrderBy_LineEmail_Desc() { regOBD("line_email"); return this; }

    protected ConditionValue _lineName;
    public ConditionValue xdfgetLineName()
    { if (_lineName == null) { _lineName = nCV(); }
      return _lineName; }
    protected ConditionValue xgetCValueLineName() { return xdfgetLineName(); }

    /**
     * Add order-by as ascend. <br>
     * (LINE表示名)line_name: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsUserMCQ addOrderBy_LineName_Asc() { regOBA("line_name"); return this; }

    /**
     * Add order-by as descend. <br>
     * (LINE表示名)line_name: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsUserMCQ addOrderBy_LineName_Desc() { regOBD("line_name"); return this; }

    protected ConditionValue _firstName;
    public ConditionValue xdfgetFirstName()
    { if (_firstName == null) { _firstName = nCV(); }
      return _firstName; }
    protected ConditionValue xgetCValueFirstName() { return xdfgetFirstName(); }

    /**
     * Add order-by as ascend. <br>
     * (名)first_name: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsUserMCQ addOrderBy_FirstName_Asc() { regOBA("first_name"); return this; }

    /**
     * Add order-by as descend. <br>
     * (名)first_name: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsUserMCQ addOrderBy_FirstName_Desc() { regOBD("first_name"); return this; }

    protected ConditionValue _lastName;
    public ConditionValue xdfgetLastName()
    { if (_lastName == null) { _lastName = nCV(); }
      return _lastName; }
    protected ConditionValue xgetCValueLastName() { return xdfgetLastName(); }

    /**
     * Add order-by as ascend. <br>
     * (姓)last_name: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsUserMCQ addOrderBy_LastName_Asc() { regOBA("last_name"); return this; }

    /**
     * Add order-by as descend. <br>
     * (姓)last_name: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsUserMCQ addOrderBy_LastName_Desc() { regOBD("last_name"); return this; }

    protected ConditionValue _handleName;
    public ConditionValue xdfgetHandleName()
    { if (_handleName == null) { _handleName = nCV(); }
      return _handleName; }
    protected ConditionValue xgetCValueHandleName() { return xdfgetHandleName(); }

    /**
     * Add order-by as ascend. <br>
     * (ハンドル名)handle_name: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsUserMCQ addOrderBy_HandleName_Asc() { regOBA("handle_name"); return this; }

    /**
     * Add order-by as descend. <br>
     * (ハンドル名)handle_name: {text(2147483647)}
     * @return this. (NotNull)
     */
    public BsUserMCQ addOrderBy_HandleName_Desc() { regOBD("handle_name"); return this; }

    protected ConditionValue _lastLoginDatetime;
    public ConditionValue xdfgetLastLoginDatetime()
    { if (_lastLoginDatetime == null) { _lastLoginDatetime = nCV(); }
      return _lastLoginDatetime; }
    protected ConditionValue xgetCValueLastLoginDatetime() { return xdfgetLastLoginDatetime(); }

    /**
     * Add order-by as ascend. <br>
     * (最終ログイン日時)last_login_datetime: {timestamp(26, 3), default=[now()]}
     * @return this. (NotNull)
     */
    public BsUserMCQ addOrderBy_LastLoginDatetime_Asc() { regOBA("last_login_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * (最終ログイン日時)last_login_datetime: {timestamp(26, 3), default=[now()]}
     * @return this. (NotNull)
     */
    public BsUserMCQ addOrderBy_LastLoginDatetime_Desc() { regOBD("last_login_datetime"); return this; }

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
    public BsUserMCQ addOrderBy_SettlementDate_Asc() { regOBA("settlement_date"); return this; }

    /**
     * Add order-by as descend. <br>
     * settlement_date: {int4(10)}
     * @return this. (NotNull)
     */
    public BsUserMCQ addOrderBy_SettlementDate_Desc() { regOBD("settlement_date"); return this; }

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
    public BsUserMCQ addOrderBy_DeleteFlag_Asc() { regOBA("delete_flag"); return this; }

    /**
     * Add order-by as descend. <br>
     * (削除フラグ)delete_flag: {NotNull, bool(1), default=[false]}
     * @return this. (NotNull)
     */
    public BsUserMCQ addOrderBy_DeleteFlag_Desc() { regOBD("delete_flag"); return this; }

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
    public BsUserMCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録日時)register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @return this. (NotNull)
     */
    public BsUserMCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

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
    public BsUserMCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新日時)update_datetime: {timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsUserMCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

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
    public BsUserMCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsUserMCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, UserMCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(UserMCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, UserMCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(UserMCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, UserMCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(UserMCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, UserMCQ> _myselfExistsMap;
    public Map<String, UserMCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(UserMCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, UserMCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(UserMCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return UserMCB.class.getName(); }
    protected String xCQ() { return UserMCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
