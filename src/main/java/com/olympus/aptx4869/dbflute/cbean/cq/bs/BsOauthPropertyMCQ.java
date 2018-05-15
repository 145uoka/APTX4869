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
 * The base condition-query of oauth_property_m.
 * @author DBFlute(AutoGenerator)
 */
public class BsOauthPropertyMCQ extends AbstractBsOauthPropertyMCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected OauthPropertyMCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsOauthPropertyMCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from oauth_property_m) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public OauthPropertyMCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected OauthPropertyMCIQ xcreateCIQ() {
        OauthPropertyMCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected OauthPropertyMCIQ xnewCIQ() {
        return new OauthPropertyMCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join oauth_property_m on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public OauthPropertyMCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        OauthPropertyMCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _oauthPropertyId;
    public ConditionValue xdfgetOauthPropertyId()
    { if (_oauthPropertyId == null) { _oauthPropertyId = nCV(); }
      return _oauthPropertyId; }
    protected ConditionValue xgetCValueOauthPropertyId() { return xdfgetOauthPropertyId(); }

    /**
     * Add order-by as ascend. <br>
     * (OAuthプロパティID)oauth_property_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsOauthPropertyMCQ addOrderBy_OauthPropertyId_Asc() { regOBA("oauth_property_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * (OAuthプロパティID)oauth_property_id: {PK, ID, NotNull, serial(10)}
     * @return this. (NotNull)
     */
    public BsOauthPropertyMCQ addOrderBy_OauthPropertyId_Desc() { regOBD("oauth_property_id"); return this; }

    protected ConditionValue _appKey;
    public ConditionValue xdfgetAppKey()
    { if (_appKey == null) { _appKey = nCV(); }
      return _appKey; }
    protected ConditionValue xgetCValueAppKey() { return xdfgetAppKey(); }

    /**
     * Add order-by as ascend. <br>
     * (アプリケーションKEY)app_key: {NotNull, text(2147483647)}
     * @return this. (NotNull)
     */
    public BsOauthPropertyMCQ addOrderBy_AppKey_Asc() { regOBA("app_key"); return this; }

    /**
     * Add order-by as descend. <br>
     * (アプリケーションKEY)app_key: {NotNull, text(2147483647)}
     * @return this. (NotNull)
     */
    public BsOauthPropertyMCQ addOrderBy_AppKey_Desc() { regOBD("app_key"); return this; }

    protected ConditionValue _redirectUrl;
    public ConditionValue xdfgetRedirectUrl()
    { if (_redirectUrl == null) { _redirectUrl = nCV(); }
      return _redirectUrl; }
    protected ConditionValue xgetCValueRedirectUrl() { return xdfgetRedirectUrl(); }

    /**
     * Add order-by as ascend. <br>
     * (OAuth認証後のcallbackURL)redirect_url: {NotNull, text(2147483647)}
     * @return this. (NotNull)
     */
    public BsOauthPropertyMCQ addOrderBy_RedirectUrl_Asc() { regOBA("redirect_url"); return this; }

    /**
     * Add order-by as descend. <br>
     * (OAuth認証後のcallbackURL)redirect_url: {NotNull, text(2147483647)}
     * @return this. (NotNull)
     */
    public BsOauthPropertyMCQ addOrderBy_RedirectUrl_Desc() { regOBD("redirect_url"); return this; }

    protected ConditionValue _clientId;
    public ConditionValue xdfgetClientId()
    { if (_clientId == null) { _clientId = nCV(); }
      return _clientId; }
    protected ConditionValue xgetCValueClientId() { return xdfgetClientId(); }

    /**
     * Add order-by as ascend. <br>
     * (クライアントID)client_id: {NotNull, text(2147483647)}
     * @return this. (NotNull)
     */
    public BsOauthPropertyMCQ addOrderBy_ClientId_Asc() { regOBA("client_id"); return this; }

    /**
     * Add order-by as descend. <br>
     * (クライアントID)client_id: {NotNull, text(2147483647)}
     * @return this. (NotNull)
     */
    public BsOauthPropertyMCQ addOrderBy_ClientId_Desc() { regOBD("client_id"); return this; }

    protected ConditionValue _clientSecret;
    public ConditionValue xdfgetClientSecret()
    { if (_clientSecret == null) { _clientSecret = nCV(); }
      return _clientSecret; }
    protected ConditionValue xgetCValueClientSecret() { return xdfgetClientSecret(); }

    /**
     * Add order-by as ascend. <br>
     * (クライアントSECRET)client_secret: {NotNull, text(2147483647)}
     * @return this. (NotNull)
     */
    public BsOauthPropertyMCQ addOrderBy_ClientSecret_Asc() { regOBA("client_secret"); return this; }

    /**
     * Add order-by as descend. <br>
     * (クライアントSECRET)client_secret: {NotNull, text(2147483647)}
     * @return this. (NotNull)
     */
    public BsOauthPropertyMCQ addOrderBy_ClientSecret_Desc() { regOBD("client_secret"); return this; }

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
    public BsOauthPropertyMCQ addOrderBy_DeleteFlag_Asc() { regOBA("delete_flag"); return this; }

    /**
     * Add order-by as descend. <br>
     * (削除フラグ)delete_flag: {NotNull, bool(1), default=[false]}
     * @return this. (NotNull)
     */
    public BsOauthPropertyMCQ addOrderBy_DeleteFlag_Desc() { regOBD("delete_flag"); return this; }

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
    public BsOauthPropertyMCQ addOrderBy_RegisterDatetime_Asc() { regOBA("register_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * (登録日時)register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @return this. (NotNull)
     */
    public BsOauthPropertyMCQ addOrderBy_RegisterDatetime_Desc() { regOBD("register_datetime"); return this; }

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
    public BsOauthPropertyMCQ addOrderBy_UpdateDatetime_Asc() { regOBA("update_datetime"); return this; }

    /**
     * Add order-by as descend. <br>
     * (更新日時)update_datetime: {timestamp(26, 3)}
     * @return this. (NotNull)
     */
    public BsOauthPropertyMCQ addOrderBy_UpdateDatetime_Desc() { regOBD("update_datetime"); return this; }

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
    public BsOauthPropertyMCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsOauthPropertyMCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    public Map<String, OauthPropertyMCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(OauthPropertyMCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, OauthPropertyMCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(OauthPropertyMCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, OauthPropertyMCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(OauthPropertyMCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, OauthPropertyMCQ> _myselfExistsMap;
    public Map<String, OauthPropertyMCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(OauthPropertyMCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, OauthPropertyMCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(OauthPropertyMCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return OauthPropertyMCB.class.getName(); }
    protected String xCQ() { return OauthPropertyMCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
