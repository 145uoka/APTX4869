package com.olympus.aptx4869.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import com.olympus.aptx4869.dbflute.allcommon.*;
import com.olympus.aptx4869.dbflute.cbean.*;
import com.olympus.aptx4869.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of oauth_property_m.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsOauthPropertyMCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsOauthPropertyMCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "oauth_property_m";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (OAuthプロパティID)oauth_property_id: {PK, ID, NotNull, serial(10)}
     * @param oauthPropertyId The value of oauthPropertyId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOauthPropertyId_Equal(Integer oauthPropertyId) {
        doSetOauthPropertyId_Equal(oauthPropertyId);
    }

    protected void doSetOauthPropertyId_Equal(Integer oauthPropertyId) {
        regOauthPropertyId(CK_EQ, oauthPropertyId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (OAuthプロパティID)oauth_property_id: {PK, ID, NotNull, serial(10)}
     * @param oauthPropertyId The value of oauthPropertyId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOauthPropertyId_NotEqual(Integer oauthPropertyId) {
        doSetOauthPropertyId_NotEqual(oauthPropertyId);
    }

    protected void doSetOauthPropertyId_NotEqual(Integer oauthPropertyId) {
        regOauthPropertyId(CK_NES, oauthPropertyId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (OAuthプロパティID)oauth_property_id: {PK, ID, NotNull, serial(10)}
     * @param oauthPropertyId The value of oauthPropertyId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOauthPropertyId_GreaterThan(Integer oauthPropertyId) {
        regOauthPropertyId(CK_GT, oauthPropertyId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (OAuthプロパティID)oauth_property_id: {PK, ID, NotNull, serial(10)}
     * @param oauthPropertyId The value of oauthPropertyId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOauthPropertyId_LessThan(Integer oauthPropertyId) {
        regOauthPropertyId(CK_LT, oauthPropertyId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (OAuthプロパティID)oauth_property_id: {PK, ID, NotNull, serial(10)}
     * @param oauthPropertyId The value of oauthPropertyId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOauthPropertyId_GreaterEqual(Integer oauthPropertyId) {
        regOauthPropertyId(CK_GE, oauthPropertyId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (OAuthプロパティID)oauth_property_id: {PK, ID, NotNull, serial(10)}
     * @param oauthPropertyId The value of oauthPropertyId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOauthPropertyId_LessEqual(Integer oauthPropertyId) {
        regOauthPropertyId(CK_LE, oauthPropertyId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (OAuthプロパティID)oauth_property_id: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of oauthPropertyId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of oauthPropertyId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setOauthPropertyId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setOauthPropertyId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (OAuthプロパティID)oauth_property_id: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of oauthPropertyId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of oauthPropertyId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setOauthPropertyId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOauthPropertyId(), "oauth_property_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (OAuthプロパティID)oauth_property_id: {PK, ID, NotNull, serial(10)}
     * @param oauthPropertyIdList The collection of oauthPropertyId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOauthPropertyId_InScope(Collection<Integer> oauthPropertyIdList) {
        doSetOauthPropertyId_InScope(oauthPropertyIdList);
    }

    protected void doSetOauthPropertyId_InScope(Collection<Integer> oauthPropertyIdList) {
        regINS(CK_INS, cTL(oauthPropertyIdList), xgetCValueOauthPropertyId(), "oauth_property_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (OAuthプロパティID)oauth_property_id: {PK, ID, NotNull, serial(10)}
     * @param oauthPropertyIdList The collection of oauthPropertyId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOauthPropertyId_NotInScope(Collection<Integer> oauthPropertyIdList) {
        doSetOauthPropertyId_NotInScope(oauthPropertyIdList);
    }

    protected void doSetOauthPropertyId_NotInScope(Collection<Integer> oauthPropertyIdList) {
        regINS(CK_NINS, cTL(oauthPropertyIdList), xgetCValueOauthPropertyId(), "oauth_property_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (OAuthプロパティID)oauth_property_id: {PK, ID, NotNull, serial(10)}
     */
    public void setOauthPropertyId_IsNull() { regOauthPropertyId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (OAuthプロパティID)oauth_property_id: {PK, ID, NotNull, serial(10)}
     */
    public void setOauthPropertyId_IsNotNull() { regOauthPropertyId(CK_ISNN, DOBJ); }

    protected void regOauthPropertyId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOauthPropertyId(), "oauth_property_id"); }
    protected abstract ConditionValue xgetCValueOauthPropertyId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (アプリケーションKEY)app_key: {NotNull, text(2147483647)}
     * @param appKey The value of appKey as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAppKey_Equal(String appKey) {
        doSetAppKey_Equal(fRES(appKey));
    }

    protected void doSetAppKey_Equal(String appKey) {
        regAppKey(CK_EQ, appKey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (アプリケーションKEY)app_key: {NotNull, text(2147483647)}
     * @param appKey The value of appKey as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAppKey_NotEqual(String appKey) {
        doSetAppKey_NotEqual(fRES(appKey));
    }

    protected void doSetAppKey_NotEqual(String appKey) {
        regAppKey(CK_NES, appKey);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (アプリケーションKEY)app_key: {NotNull, text(2147483647)}
     * @param appKey The value of appKey as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAppKey_GreaterThan(String appKey) {
        regAppKey(CK_GT, fRES(appKey));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (アプリケーションKEY)app_key: {NotNull, text(2147483647)}
     * @param appKey The value of appKey as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAppKey_LessThan(String appKey) {
        regAppKey(CK_LT, fRES(appKey));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (アプリケーションKEY)app_key: {NotNull, text(2147483647)}
     * @param appKey The value of appKey as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAppKey_GreaterEqual(String appKey) {
        regAppKey(CK_GE, fRES(appKey));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (アプリケーションKEY)app_key: {NotNull, text(2147483647)}
     * @param appKey The value of appKey as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAppKey_LessEqual(String appKey) {
        regAppKey(CK_LE, fRES(appKey));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (アプリケーションKEY)app_key: {NotNull, text(2147483647)}
     * @param appKeyList The collection of appKey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAppKey_InScope(Collection<String> appKeyList) {
        doSetAppKey_InScope(appKeyList);
    }

    protected void doSetAppKey_InScope(Collection<String> appKeyList) {
        regINS(CK_INS, cTL(appKeyList), xgetCValueAppKey(), "app_key");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (アプリケーションKEY)app_key: {NotNull, text(2147483647)}
     * @param appKeyList The collection of appKey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAppKey_NotInScope(Collection<String> appKeyList) {
        doSetAppKey_NotInScope(appKeyList);
    }

    protected void doSetAppKey_NotInScope(Collection<String> appKeyList) {
        regINS(CK_NINS, cTL(appKeyList), xgetCValueAppKey(), "app_key");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (アプリケーションKEY)app_key: {NotNull, text(2147483647)} <br>
     * <pre>e.g. setAppKey_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param appKey The value of appKey as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAppKey_LikeSearch(String appKey, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAppKey_LikeSearch(appKey, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (アプリケーションKEY)app_key: {NotNull, text(2147483647)} <br>
     * <pre>e.g. setAppKey_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param appKey The value of appKey as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setAppKey_LikeSearch(String appKey, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(appKey), xgetCValueAppKey(), "app_key", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (アプリケーションKEY)app_key: {NotNull, text(2147483647)}
     * @param appKey The value of appKey as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setAppKey_NotLikeSearch(String appKey, ConditionOptionCall<LikeSearchOption> opLambda) {
        setAppKey_NotLikeSearch(appKey, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (アプリケーションKEY)app_key: {NotNull, text(2147483647)}
     * @param appKey The value of appKey as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setAppKey_NotLikeSearch(String appKey, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(appKey), xgetCValueAppKey(), "app_key", likeSearchOption);
    }

    protected void regAppKey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAppKey(), "app_key"); }
    protected abstract ConditionValue xgetCValueAppKey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (OAuth認証後のcallbackURL)redirect_url: {NotNull, text(2147483647)}
     * @param redirectUrl The value of redirectUrl as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRedirectUrl_Equal(String redirectUrl) {
        doSetRedirectUrl_Equal(fRES(redirectUrl));
    }

    protected void doSetRedirectUrl_Equal(String redirectUrl) {
        regRedirectUrl(CK_EQ, redirectUrl);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (OAuth認証後のcallbackURL)redirect_url: {NotNull, text(2147483647)}
     * @param redirectUrl The value of redirectUrl as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRedirectUrl_NotEqual(String redirectUrl) {
        doSetRedirectUrl_NotEqual(fRES(redirectUrl));
    }

    protected void doSetRedirectUrl_NotEqual(String redirectUrl) {
        regRedirectUrl(CK_NES, redirectUrl);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (OAuth認証後のcallbackURL)redirect_url: {NotNull, text(2147483647)}
     * @param redirectUrl The value of redirectUrl as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRedirectUrl_GreaterThan(String redirectUrl) {
        regRedirectUrl(CK_GT, fRES(redirectUrl));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (OAuth認証後のcallbackURL)redirect_url: {NotNull, text(2147483647)}
     * @param redirectUrl The value of redirectUrl as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRedirectUrl_LessThan(String redirectUrl) {
        regRedirectUrl(CK_LT, fRES(redirectUrl));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (OAuth認証後のcallbackURL)redirect_url: {NotNull, text(2147483647)}
     * @param redirectUrl The value of redirectUrl as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRedirectUrl_GreaterEqual(String redirectUrl) {
        regRedirectUrl(CK_GE, fRES(redirectUrl));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (OAuth認証後のcallbackURL)redirect_url: {NotNull, text(2147483647)}
     * @param redirectUrl The value of redirectUrl as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRedirectUrl_LessEqual(String redirectUrl) {
        regRedirectUrl(CK_LE, fRES(redirectUrl));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (OAuth認証後のcallbackURL)redirect_url: {NotNull, text(2147483647)}
     * @param redirectUrlList The collection of redirectUrl as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRedirectUrl_InScope(Collection<String> redirectUrlList) {
        doSetRedirectUrl_InScope(redirectUrlList);
    }

    protected void doSetRedirectUrl_InScope(Collection<String> redirectUrlList) {
        regINS(CK_INS, cTL(redirectUrlList), xgetCValueRedirectUrl(), "redirect_url");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (OAuth認証後のcallbackURL)redirect_url: {NotNull, text(2147483647)}
     * @param redirectUrlList The collection of redirectUrl as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRedirectUrl_NotInScope(Collection<String> redirectUrlList) {
        doSetRedirectUrl_NotInScope(redirectUrlList);
    }

    protected void doSetRedirectUrl_NotInScope(Collection<String> redirectUrlList) {
        regINS(CK_NINS, cTL(redirectUrlList), xgetCValueRedirectUrl(), "redirect_url");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (OAuth認証後のcallbackURL)redirect_url: {NotNull, text(2147483647)} <br>
     * <pre>e.g. setRedirectUrl_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param redirectUrl The value of redirectUrl as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRedirectUrl_LikeSearch(String redirectUrl, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRedirectUrl_LikeSearch(redirectUrl, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (OAuth認証後のcallbackURL)redirect_url: {NotNull, text(2147483647)} <br>
     * <pre>e.g. setRedirectUrl_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param redirectUrl The value of redirectUrl as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setRedirectUrl_LikeSearch(String redirectUrl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(redirectUrl), xgetCValueRedirectUrl(), "redirect_url", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (OAuth認証後のcallbackURL)redirect_url: {NotNull, text(2147483647)}
     * @param redirectUrl The value of redirectUrl as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRedirectUrl_NotLikeSearch(String redirectUrl, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRedirectUrl_NotLikeSearch(redirectUrl, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (OAuth認証後のcallbackURL)redirect_url: {NotNull, text(2147483647)}
     * @param redirectUrl The value of redirectUrl as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setRedirectUrl_NotLikeSearch(String redirectUrl, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(redirectUrl), xgetCValueRedirectUrl(), "redirect_url", likeSearchOption);
    }

    protected void regRedirectUrl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRedirectUrl(), "redirect_url"); }
    protected abstract ConditionValue xgetCValueRedirectUrl();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (クライアントID)client_id: {NotNull, text(2147483647)}
     * @param clientId The value of clientId as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_Equal(String clientId) {
        doSetClientId_Equal(fRES(clientId));
    }

    protected void doSetClientId_Equal(String clientId) {
        regClientId(CK_EQ, clientId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (クライアントID)client_id: {NotNull, text(2147483647)}
     * @param clientId The value of clientId as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_NotEqual(String clientId) {
        doSetClientId_NotEqual(fRES(clientId));
    }

    protected void doSetClientId_NotEqual(String clientId) {
        regClientId(CK_NES, clientId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (クライアントID)client_id: {NotNull, text(2147483647)}
     * @param clientId The value of clientId as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_GreaterThan(String clientId) {
        regClientId(CK_GT, fRES(clientId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (クライアントID)client_id: {NotNull, text(2147483647)}
     * @param clientId The value of clientId as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_LessThan(String clientId) {
        regClientId(CK_LT, fRES(clientId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (クライアントID)client_id: {NotNull, text(2147483647)}
     * @param clientId The value of clientId as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_GreaterEqual(String clientId) {
        regClientId(CK_GE, fRES(clientId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (クライアントID)client_id: {NotNull, text(2147483647)}
     * @param clientId The value of clientId as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_LessEqual(String clientId) {
        regClientId(CK_LE, fRES(clientId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (クライアントID)client_id: {NotNull, text(2147483647)}
     * @param clientIdList The collection of clientId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_InScope(Collection<String> clientIdList) {
        doSetClientId_InScope(clientIdList);
    }

    protected void doSetClientId_InScope(Collection<String> clientIdList) {
        regINS(CK_INS, cTL(clientIdList), xgetCValueClientId(), "client_id");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (クライアントID)client_id: {NotNull, text(2147483647)}
     * @param clientIdList The collection of clientId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_NotInScope(Collection<String> clientIdList) {
        doSetClientId_NotInScope(clientIdList);
    }

    protected void doSetClientId_NotInScope(Collection<String> clientIdList) {
        regINS(CK_NINS, cTL(clientIdList), xgetCValueClientId(), "client_id");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (クライアントID)client_id: {NotNull, text(2147483647)} <br>
     * <pre>e.g. setClientId_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param clientId The value of clientId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setClientId_LikeSearch(String clientId, ConditionOptionCall<LikeSearchOption> opLambda) {
        setClientId_LikeSearch(clientId, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (クライアントID)client_id: {NotNull, text(2147483647)} <br>
     * <pre>e.g. setClientId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param clientId The value of clientId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setClientId_LikeSearch(String clientId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(clientId), xgetCValueClientId(), "client_id", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (クライアントID)client_id: {NotNull, text(2147483647)}
     * @param clientId The value of clientId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setClientId_NotLikeSearch(String clientId, ConditionOptionCall<LikeSearchOption> opLambda) {
        setClientId_NotLikeSearch(clientId, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (クライアントID)client_id: {NotNull, text(2147483647)}
     * @param clientId The value of clientId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setClientId_NotLikeSearch(String clientId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(clientId), xgetCValueClientId(), "client_id", likeSearchOption);
    }

    protected void regClientId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClientId(), "client_id"); }
    protected abstract ConditionValue xgetCValueClientId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (クライアントSECRET)client_secret: {NotNull, text(2147483647)}
     * @param clientSecret The value of clientSecret as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientSecret_Equal(String clientSecret) {
        doSetClientSecret_Equal(fRES(clientSecret));
    }

    protected void doSetClientSecret_Equal(String clientSecret) {
        regClientSecret(CK_EQ, clientSecret);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (クライアントSECRET)client_secret: {NotNull, text(2147483647)}
     * @param clientSecret The value of clientSecret as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientSecret_NotEqual(String clientSecret) {
        doSetClientSecret_NotEqual(fRES(clientSecret));
    }

    protected void doSetClientSecret_NotEqual(String clientSecret) {
        regClientSecret(CK_NES, clientSecret);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (クライアントSECRET)client_secret: {NotNull, text(2147483647)}
     * @param clientSecret The value of clientSecret as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientSecret_GreaterThan(String clientSecret) {
        regClientSecret(CK_GT, fRES(clientSecret));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (クライアントSECRET)client_secret: {NotNull, text(2147483647)}
     * @param clientSecret The value of clientSecret as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientSecret_LessThan(String clientSecret) {
        regClientSecret(CK_LT, fRES(clientSecret));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (クライアントSECRET)client_secret: {NotNull, text(2147483647)}
     * @param clientSecret The value of clientSecret as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientSecret_GreaterEqual(String clientSecret) {
        regClientSecret(CK_GE, fRES(clientSecret));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (クライアントSECRET)client_secret: {NotNull, text(2147483647)}
     * @param clientSecret The value of clientSecret as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientSecret_LessEqual(String clientSecret) {
        regClientSecret(CK_LE, fRES(clientSecret));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (クライアントSECRET)client_secret: {NotNull, text(2147483647)}
     * @param clientSecretList The collection of clientSecret as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientSecret_InScope(Collection<String> clientSecretList) {
        doSetClientSecret_InScope(clientSecretList);
    }

    protected void doSetClientSecret_InScope(Collection<String> clientSecretList) {
        regINS(CK_INS, cTL(clientSecretList), xgetCValueClientSecret(), "client_secret");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (クライアントSECRET)client_secret: {NotNull, text(2147483647)}
     * @param clientSecretList The collection of clientSecret as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientSecret_NotInScope(Collection<String> clientSecretList) {
        doSetClientSecret_NotInScope(clientSecretList);
    }

    protected void doSetClientSecret_NotInScope(Collection<String> clientSecretList) {
        regINS(CK_NINS, cTL(clientSecretList), xgetCValueClientSecret(), "client_secret");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (クライアントSECRET)client_secret: {NotNull, text(2147483647)} <br>
     * <pre>e.g. setClientSecret_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param clientSecret The value of clientSecret as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setClientSecret_LikeSearch(String clientSecret, ConditionOptionCall<LikeSearchOption> opLambda) {
        setClientSecret_LikeSearch(clientSecret, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (クライアントSECRET)client_secret: {NotNull, text(2147483647)} <br>
     * <pre>e.g. setClientSecret_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param clientSecret The value of clientSecret as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setClientSecret_LikeSearch(String clientSecret, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(clientSecret), xgetCValueClientSecret(), "client_secret", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (クライアントSECRET)client_secret: {NotNull, text(2147483647)}
     * @param clientSecret The value of clientSecret as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setClientSecret_NotLikeSearch(String clientSecret, ConditionOptionCall<LikeSearchOption> opLambda) {
        setClientSecret_NotLikeSearch(clientSecret, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (クライアントSECRET)client_secret: {NotNull, text(2147483647)}
     * @param clientSecret The value of clientSecret as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setClientSecret_NotLikeSearch(String clientSecret, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(clientSecret), xgetCValueClientSecret(), "client_secret", likeSearchOption);
    }

    protected void regClientSecret(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClientSecret(), "client_secret"); }
    protected abstract ConditionValue xgetCValueClientSecret();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (削除フラグ)delete_flag: {NotNull, bool(1), default=[false]}
     * @param deleteFlag The value of deleteFlag as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeleteFlag_Equal(Boolean deleteFlag) {
        regDeleteFlag(CK_EQ, deleteFlag);
    }

    protected void regDeleteFlag(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeleteFlag(), "delete_flag"); }
    protected abstract ConditionValue xgetCValueDeleteFlag();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (登録日時)register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @param registerDatetime The value of registerDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_Equal(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_EQ,  registerDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (登録日時)register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @param registerDatetime The value of registerDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_GreaterThan(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_GT,  registerDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (登録日時)register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @param registerDatetime The value of registerDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_LessThan(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_LT,  registerDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (登録日時)register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @param registerDatetime The value of registerDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_GreaterEqual(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_GE,  registerDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (登録日時)register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * @param registerDatetime The value of registerDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_LessEqual(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_LE, registerDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (登録日時)register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setRegisterDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (登録日時)register_datetime: {NotNull, timestamp(26, 3), default=[now()]}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "register_datetime"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueRegisterDatetime(), nm, op);
    }

    protected void regRegisterDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterDatetime(), "register_datetime"); }
    protected abstract ConditionValue xgetCValueRegisterDatetime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (更新日時)update_datetime: {timestamp(26, 3)}
     * @param updateDatetime The value of updateDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_Equal(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_EQ,  updateDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (更新日時)update_datetime: {timestamp(26, 3)}
     * @param updateDatetime The value of updateDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_GreaterThan(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_GT,  updateDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (更新日時)update_datetime: {timestamp(26, 3)}
     * @param updateDatetime The value of updateDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_LessThan(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_LT,  updateDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (更新日時)update_datetime: {timestamp(26, 3)}
     * @param updateDatetime The value of updateDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_GreaterEqual(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_GE,  updateDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (更新日時)update_datetime: {timestamp(26, 3)}
     * @param updateDatetime The value of updateDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_LessEqual(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_LE, updateDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (更新日時)update_datetime: {timestamp(26, 3)}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setUpdateDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (更新日時)update_datetime: {timestamp(26, 3)}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "update_datetime"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueUpdateDatetime(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (更新日時)update_datetime: {timestamp(26, 3)}
     */
    public void setUpdateDatetime_IsNull() { regUpdateDatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (更新日時)update_datetime: {timestamp(26, 3)}
     */
    public void setUpdateDatetime_IsNotNull() { regUpdateDatetime(CK_ISNN, DOBJ); }

    protected void regUpdateDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateDatetime(), "update_datetime"); }
    protected abstract ConditionValue xgetCValueUpdateDatetime();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<OauthPropertyMCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, OauthPropertyMCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<OauthPropertyMCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, OauthPropertyMCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<OauthPropertyMCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, OauthPropertyMCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<OauthPropertyMCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, OauthPropertyMCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<OauthPropertyMCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, OauthPropertyMCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;OauthPropertyMCB&gt;() {
     *     public void query(OauthPropertyMCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<OauthPropertyMCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, OauthPropertyMCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        OauthPropertyMCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(OauthPropertyMCQ sq);

    protected OauthPropertyMCB xcreateScalarConditionCB() {
        OauthPropertyMCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected OauthPropertyMCB xcreateScalarConditionPartitionByCB() {
        OauthPropertyMCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<OauthPropertyMCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        OauthPropertyMCB cb = new OauthPropertyMCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "oauth_property_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(OauthPropertyMCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<OauthPropertyMCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(OauthPropertyMCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        OauthPropertyMCB cb = new OauthPropertyMCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "oauth_property_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(OauthPropertyMCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<OauthPropertyMCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        OauthPropertyMCB cb = new OauthPropertyMCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(OauthPropertyMCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected OauthPropertyMCB newMyCB() {
        return new OauthPropertyMCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return OauthPropertyMCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
