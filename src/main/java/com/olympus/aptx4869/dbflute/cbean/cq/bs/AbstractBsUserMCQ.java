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
 * The abstract condition-query of user_m.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsUserMCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsUserMCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "user_m";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (ユーザーID)user_id: {PK, ID, NotNull, serial(10)}
     * @param userId The value of userId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_Equal(Integer userId) {
        doSetUserId_Equal(userId);
    }

    protected void doSetUserId_Equal(Integer userId) {
        regUserId(CK_EQ, userId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (ユーザーID)user_id: {PK, ID, NotNull, serial(10)}
     * @param userId The value of userId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_NotEqual(Integer userId) {
        doSetUserId_NotEqual(userId);
    }

    protected void doSetUserId_NotEqual(Integer userId) {
        regUserId(CK_NES, userId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (ユーザーID)user_id: {PK, ID, NotNull, serial(10)}
     * @param userId The value of userId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterThan(Integer userId) {
        regUserId(CK_GT, userId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (ユーザーID)user_id: {PK, ID, NotNull, serial(10)}
     * @param userId The value of userId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessThan(Integer userId) {
        regUserId(CK_LT, userId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (ユーザーID)user_id: {PK, ID, NotNull, serial(10)}
     * @param userId The value of userId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterEqual(Integer userId) {
        regUserId(CK_GE, userId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (ユーザーID)user_id: {PK, ID, NotNull, serial(10)}
     * @param userId The value of userId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessEqual(Integer userId) {
        regUserId(CK_LE, userId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (ユーザーID)user_id: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setUserId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setUserId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (ユーザーID)user_id: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of userId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setUserId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUserId(), "user_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (ユーザーID)user_id: {PK, ID, NotNull, serial(10)}
     * @param userIdList The collection of userId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserId_InScope(Collection<Integer> userIdList) {
        doSetUserId_InScope(userIdList);
    }

    protected void doSetUserId_InScope(Collection<Integer> userIdList) {
        regINS(CK_INS, cTL(userIdList), xgetCValueUserId(), "user_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (ユーザーID)user_id: {PK, ID, NotNull, serial(10)}
     * @param userIdList The collection of userId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserId_NotInScope(Collection<Integer> userIdList) {
        doSetUserId_NotInScope(userIdList);
    }

    protected void doSetUserId_NotInScope(Collection<Integer> userIdList) {
        regINS(CK_NINS, cTL(userIdList), xgetCValueUserId(), "user_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (ユーザーID)user_id: {PK, ID, NotNull, serial(10)}
     */
    public void setUserId_IsNull() { regUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (ユーザーID)user_id: {PK, ID, NotNull, serial(10)}
     */
    public void setUserId_IsNotNull() { regUserId(CK_ISNN, DOBJ); }

    protected void regUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserId(), "user_id"); }
    protected abstract ConditionValue xgetCValueUserId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (LINE_ID)line_id: {text(2147483647)}
     * @param lineId The value of lineId as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineId_Equal(String lineId) {
        doSetLineId_Equal(fRES(lineId));
    }

    protected void doSetLineId_Equal(String lineId) {
        regLineId(CK_EQ, lineId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (LINE_ID)line_id: {text(2147483647)}
     * @param lineId The value of lineId as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineId_NotEqual(String lineId) {
        doSetLineId_NotEqual(fRES(lineId));
    }

    protected void doSetLineId_NotEqual(String lineId) {
        regLineId(CK_NES, lineId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (LINE_ID)line_id: {text(2147483647)}
     * @param lineId The value of lineId as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineId_GreaterThan(String lineId) {
        regLineId(CK_GT, fRES(lineId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (LINE_ID)line_id: {text(2147483647)}
     * @param lineId The value of lineId as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineId_LessThan(String lineId) {
        regLineId(CK_LT, fRES(lineId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (LINE_ID)line_id: {text(2147483647)}
     * @param lineId The value of lineId as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineId_GreaterEqual(String lineId) {
        regLineId(CK_GE, fRES(lineId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (LINE_ID)line_id: {text(2147483647)}
     * @param lineId The value of lineId as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineId_LessEqual(String lineId) {
        regLineId(CK_LE, fRES(lineId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (LINE_ID)line_id: {text(2147483647)}
     * @param lineIdList The collection of lineId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineId_InScope(Collection<String> lineIdList) {
        doSetLineId_InScope(lineIdList);
    }

    protected void doSetLineId_InScope(Collection<String> lineIdList) {
        regINS(CK_INS, cTL(lineIdList), xgetCValueLineId(), "line_id");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (LINE_ID)line_id: {text(2147483647)}
     * @param lineIdList The collection of lineId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineId_NotInScope(Collection<String> lineIdList) {
        doSetLineId_NotInScope(lineIdList);
    }

    protected void doSetLineId_NotInScope(Collection<String> lineIdList) {
        regINS(CK_NINS, cTL(lineIdList), xgetCValueLineId(), "line_id");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (LINE_ID)line_id: {text(2147483647)} <br>
     * <pre>e.g. setLineId_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param lineId The value of lineId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLineId_LikeSearch(String lineId, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLineId_LikeSearch(lineId, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (LINE_ID)line_id: {text(2147483647)} <br>
     * <pre>e.g. setLineId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lineId The value of lineId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setLineId_LikeSearch(String lineId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lineId), xgetCValueLineId(), "line_id", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (LINE_ID)line_id: {text(2147483647)}
     * @param lineId The value of lineId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLineId_NotLikeSearch(String lineId, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLineId_NotLikeSearch(lineId, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (LINE_ID)line_id: {text(2147483647)}
     * @param lineId The value of lineId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setLineId_NotLikeSearch(String lineId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lineId), xgetCValueLineId(), "line_id", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (LINE_ID)line_id: {text(2147483647)}
     */
    public void setLineId_IsNull() { regLineId(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (LINE_ID)line_id: {text(2147483647)}
     */
    public void setLineId_IsNullOrEmpty() { regLineId(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (LINE_ID)line_id: {text(2147483647)}
     */
    public void setLineId_IsNotNull() { regLineId(CK_ISNN, DOBJ); }

    protected void regLineId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLineId(), "line_id"); }
    protected abstract ConditionValue xgetCValueLineId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (LINEのEmail)line_email: {text(2147483647)}
     * @param lineEmail The value of lineEmail as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineEmail_Equal(String lineEmail) {
        doSetLineEmail_Equal(fRES(lineEmail));
    }

    protected void doSetLineEmail_Equal(String lineEmail) {
        regLineEmail(CK_EQ, lineEmail);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (LINEのEmail)line_email: {text(2147483647)}
     * @param lineEmail The value of lineEmail as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineEmail_NotEqual(String lineEmail) {
        doSetLineEmail_NotEqual(fRES(lineEmail));
    }

    protected void doSetLineEmail_NotEqual(String lineEmail) {
        regLineEmail(CK_NES, lineEmail);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (LINEのEmail)line_email: {text(2147483647)}
     * @param lineEmail The value of lineEmail as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineEmail_GreaterThan(String lineEmail) {
        regLineEmail(CK_GT, fRES(lineEmail));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (LINEのEmail)line_email: {text(2147483647)}
     * @param lineEmail The value of lineEmail as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineEmail_LessThan(String lineEmail) {
        regLineEmail(CK_LT, fRES(lineEmail));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (LINEのEmail)line_email: {text(2147483647)}
     * @param lineEmail The value of lineEmail as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineEmail_GreaterEqual(String lineEmail) {
        regLineEmail(CK_GE, fRES(lineEmail));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (LINEのEmail)line_email: {text(2147483647)}
     * @param lineEmail The value of lineEmail as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineEmail_LessEqual(String lineEmail) {
        regLineEmail(CK_LE, fRES(lineEmail));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (LINEのEmail)line_email: {text(2147483647)}
     * @param lineEmailList The collection of lineEmail as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineEmail_InScope(Collection<String> lineEmailList) {
        doSetLineEmail_InScope(lineEmailList);
    }

    protected void doSetLineEmail_InScope(Collection<String> lineEmailList) {
        regINS(CK_INS, cTL(lineEmailList), xgetCValueLineEmail(), "line_email");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (LINEのEmail)line_email: {text(2147483647)}
     * @param lineEmailList The collection of lineEmail as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineEmail_NotInScope(Collection<String> lineEmailList) {
        doSetLineEmail_NotInScope(lineEmailList);
    }

    protected void doSetLineEmail_NotInScope(Collection<String> lineEmailList) {
        regINS(CK_NINS, cTL(lineEmailList), xgetCValueLineEmail(), "line_email");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (LINEのEmail)line_email: {text(2147483647)} <br>
     * <pre>e.g. setLineEmail_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param lineEmail The value of lineEmail as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLineEmail_LikeSearch(String lineEmail, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLineEmail_LikeSearch(lineEmail, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (LINEのEmail)line_email: {text(2147483647)} <br>
     * <pre>e.g. setLineEmail_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lineEmail The value of lineEmail as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setLineEmail_LikeSearch(String lineEmail, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lineEmail), xgetCValueLineEmail(), "line_email", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (LINEのEmail)line_email: {text(2147483647)}
     * @param lineEmail The value of lineEmail as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLineEmail_NotLikeSearch(String lineEmail, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLineEmail_NotLikeSearch(lineEmail, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (LINEのEmail)line_email: {text(2147483647)}
     * @param lineEmail The value of lineEmail as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setLineEmail_NotLikeSearch(String lineEmail, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lineEmail), xgetCValueLineEmail(), "line_email", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (LINEのEmail)line_email: {text(2147483647)}
     */
    public void setLineEmail_IsNull() { regLineEmail(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (LINEのEmail)line_email: {text(2147483647)}
     */
    public void setLineEmail_IsNullOrEmpty() { regLineEmail(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (LINEのEmail)line_email: {text(2147483647)}
     */
    public void setLineEmail_IsNotNull() { regLineEmail(CK_ISNN, DOBJ); }

    protected void regLineEmail(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLineEmail(), "line_email"); }
    protected abstract ConditionValue xgetCValueLineEmail();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (LINE表示名)line_name: {text(2147483647)}
     * @param lineName The value of lineName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineName_Equal(String lineName) {
        doSetLineName_Equal(fRES(lineName));
    }

    protected void doSetLineName_Equal(String lineName) {
        regLineName(CK_EQ, lineName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (LINE表示名)line_name: {text(2147483647)}
     * @param lineName The value of lineName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineName_NotEqual(String lineName) {
        doSetLineName_NotEqual(fRES(lineName));
    }

    protected void doSetLineName_NotEqual(String lineName) {
        regLineName(CK_NES, lineName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (LINE表示名)line_name: {text(2147483647)}
     * @param lineName The value of lineName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineName_GreaterThan(String lineName) {
        regLineName(CK_GT, fRES(lineName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (LINE表示名)line_name: {text(2147483647)}
     * @param lineName The value of lineName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineName_LessThan(String lineName) {
        regLineName(CK_LT, fRES(lineName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (LINE表示名)line_name: {text(2147483647)}
     * @param lineName The value of lineName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineName_GreaterEqual(String lineName) {
        regLineName(CK_GE, fRES(lineName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (LINE表示名)line_name: {text(2147483647)}
     * @param lineName The value of lineName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineName_LessEqual(String lineName) {
        regLineName(CK_LE, fRES(lineName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (LINE表示名)line_name: {text(2147483647)}
     * @param lineNameList The collection of lineName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineName_InScope(Collection<String> lineNameList) {
        doSetLineName_InScope(lineNameList);
    }

    protected void doSetLineName_InScope(Collection<String> lineNameList) {
        regINS(CK_INS, cTL(lineNameList), xgetCValueLineName(), "line_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (LINE表示名)line_name: {text(2147483647)}
     * @param lineNameList The collection of lineName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineName_NotInScope(Collection<String> lineNameList) {
        doSetLineName_NotInScope(lineNameList);
    }

    protected void doSetLineName_NotInScope(Collection<String> lineNameList) {
        regINS(CK_NINS, cTL(lineNameList), xgetCValueLineName(), "line_name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (LINE表示名)line_name: {text(2147483647)} <br>
     * <pre>e.g. setLineName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param lineName The value of lineName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLineName_LikeSearch(String lineName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLineName_LikeSearch(lineName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (LINE表示名)line_name: {text(2147483647)} <br>
     * <pre>e.g. setLineName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lineName The value of lineName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setLineName_LikeSearch(String lineName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lineName), xgetCValueLineName(), "line_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (LINE表示名)line_name: {text(2147483647)}
     * @param lineName The value of lineName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLineName_NotLikeSearch(String lineName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLineName_NotLikeSearch(lineName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (LINE表示名)line_name: {text(2147483647)}
     * @param lineName The value of lineName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setLineName_NotLikeSearch(String lineName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lineName), xgetCValueLineName(), "line_name", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (LINE表示名)line_name: {text(2147483647)}
     */
    public void setLineName_IsNull() { regLineName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (LINE表示名)line_name: {text(2147483647)}
     */
    public void setLineName_IsNullOrEmpty() { regLineName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (LINE表示名)line_name: {text(2147483647)}
     */
    public void setLineName_IsNotNull() { regLineName(CK_ISNN, DOBJ); }

    protected void regLineName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLineName(), "line_name"); }
    protected abstract ConditionValue xgetCValueLineName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (名)first_name: {text(2147483647)}
     * @param firstName The value of firstName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstName_Equal(String firstName) {
        doSetFirstName_Equal(fRES(firstName));
    }

    protected void doSetFirstName_Equal(String firstName) {
        regFirstName(CK_EQ, firstName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (名)first_name: {text(2147483647)}
     * @param firstName The value of firstName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstName_NotEqual(String firstName) {
        doSetFirstName_NotEqual(fRES(firstName));
    }

    protected void doSetFirstName_NotEqual(String firstName) {
        regFirstName(CK_NES, firstName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (名)first_name: {text(2147483647)}
     * @param firstName The value of firstName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstName_GreaterThan(String firstName) {
        regFirstName(CK_GT, fRES(firstName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (名)first_name: {text(2147483647)}
     * @param firstName The value of firstName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstName_LessThan(String firstName) {
        regFirstName(CK_LT, fRES(firstName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (名)first_name: {text(2147483647)}
     * @param firstName The value of firstName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstName_GreaterEqual(String firstName) {
        regFirstName(CK_GE, fRES(firstName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (名)first_name: {text(2147483647)}
     * @param firstName The value of firstName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstName_LessEqual(String firstName) {
        regFirstName(CK_LE, fRES(firstName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (名)first_name: {text(2147483647)}
     * @param firstNameList The collection of firstName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstName_InScope(Collection<String> firstNameList) {
        doSetFirstName_InScope(firstNameList);
    }

    protected void doSetFirstName_InScope(Collection<String> firstNameList) {
        regINS(CK_INS, cTL(firstNameList), xgetCValueFirstName(), "first_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (名)first_name: {text(2147483647)}
     * @param firstNameList The collection of firstName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstName_NotInScope(Collection<String> firstNameList) {
        doSetFirstName_NotInScope(firstNameList);
    }

    protected void doSetFirstName_NotInScope(Collection<String> firstNameList) {
        regINS(CK_NINS, cTL(firstNameList), xgetCValueFirstName(), "first_name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (名)first_name: {text(2147483647)} <br>
     * <pre>e.g. setFirstName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param firstName The value of firstName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setFirstName_LikeSearch(String firstName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setFirstName_LikeSearch(firstName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (名)first_name: {text(2147483647)} <br>
     * <pre>e.g. setFirstName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param firstName The value of firstName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setFirstName_LikeSearch(String firstName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(firstName), xgetCValueFirstName(), "first_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (名)first_name: {text(2147483647)}
     * @param firstName The value of firstName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setFirstName_NotLikeSearch(String firstName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setFirstName_NotLikeSearch(firstName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (名)first_name: {text(2147483647)}
     * @param firstName The value of firstName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setFirstName_NotLikeSearch(String firstName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(firstName), xgetCValueFirstName(), "first_name", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (名)first_name: {text(2147483647)}
     */
    public void setFirstName_IsNull() { regFirstName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (名)first_name: {text(2147483647)}
     */
    public void setFirstName_IsNullOrEmpty() { regFirstName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (名)first_name: {text(2147483647)}
     */
    public void setFirstName_IsNotNull() { regFirstName(CK_ISNN, DOBJ); }

    protected void regFirstName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFirstName(), "first_name"); }
    protected abstract ConditionValue xgetCValueFirstName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (姓)last_name: {text(2147483647)}
     * @param lastName The value of lastName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastName_Equal(String lastName) {
        doSetLastName_Equal(fRES(lastName));
    }

    protected void doSetLastName_Equal(String lastName) {
        regLastName(CK_EQ, lastName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (姓)last_name: {text(2147483647)}
     * @param lastName The value of lastName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastName_NotEqual(String lastName) {
        doSetLastName_NotEqual(fRES(lastName));
    }

    protected void doSetLastName_NotEqual(String lastName) {
        regLastName(CK_NES, lastName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (姓)last_name: {text(2147483647)}
     * @param lastName The value of lastName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastName_GreaterThan(String lastName) {
        regLastName(CK_GT, fRES(lastName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (姓)last_name: {text(2147483647)}
     * @param lastName The value of lastName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastName_LessThan(String lastName) {
        regLastName(CK_LT, fRES(lastName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (姓)last_name: {text(2147483647)}
     * @param lastName The value of lastName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastName_GreaterEqual(String lastName) {
        regLastName(CK_GE, fRES(lastName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (姓)last_name: {text(2147483647)}
     * @param lastName The value of lastName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastName_LessEqual(String lastName) {
        regLastName(CK_LE, fRES(lastName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (姓)last_name: {text(2147483647)}
     * @param lastNameList The collection of lastName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastName_InScope(Collection<String> lastNameList) {
        doSetLastName_InScope(lastNameList);
    }

    protected void doSetLastName_InScope(Collection<String> lastNameList) {
        regINS(CK_INS, cTL(lastNameList), xgetCValueLastName(), "last_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (姓)last_name: {text(2147483647)}
     * @param lastNameList The collection of lastName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLastName_NotInScope(Collection<String> lastNameList) {
        doSetLastName_NotInScope(lastNameList);
    }

    protected void doSetLastName_NotInScope(Collection<String> lastNameList) {
        regINS(CK_NINS, cTL(lastNameList), xgetCValueLastName(), "last_name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (姓)last_name: {text(2147483647)} <br>
     * <pre>e.g. setLastName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param lastName The value of lastName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLastName_LikeSearch(String lastName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLastName_LikeSearch(lastName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (姓)last_name: {text(2147483647)} <br>
     * <pre>e.g. setLastName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lastName The value of lastName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setLastName_LikeSearch(String lastName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lastName), xgetCValueLastName(), "last_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (姓)last_name: {text(2147483647)}
     * @param lastName The value of lastName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLastName_NotLikeSearch(String lastName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLastName_NotLikeSearch(lastName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (姓)last_name: {text(2147483647)}
     * @param lastName The value of lastName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setLastName_NotLikeSearch(String lastName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lastName), xgetCValueLastName(), "last_name", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (姓)last_name: {text(2147483647)}
     */
    public void setLastName_IsNull() { regLastName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (姓)last_name: {text(2147483647)}
     */
    public void setLastName_IsNullOrEmpty() { regLastName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (姓)last_name: {text(2147483647)}
     */
    public void setLastName_IsNotNull() { regLastName(CK_ISNN, DOBJ); }

    protected void regLastName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLastName(), "last_name"); }
    protected abstract ConditionValue xgetCValueLastName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (ハンドル名)handle_name: {text(2147483647)}
     * @param handleName The value of handleName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHandleName_Equal(String handleName) {
        doSetHandleName_Equal(fRES(handleName));
    }

    protected void doSetHandleName_Equal(String handleName) {
        regHandleName(CK_EQ, handleName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (ハンドル名)handle_name: {text(2147483647)}
     * @param handleName The value of handleName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHandleName_NotEqual(String handleName) {
        doSetHandleName_NotEqual(fRES(handleName));
    }

    protected void doSetHandleName_NotEqual(String handleName) {
        regHandleName(CK_NES, handleName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (ハンドル名)handle_name: {text(2147483647)}
     * @param handleName The value of handleName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHandleName_GreaterThan(String handleName) {
        regHandleName(CK_GT, fRES(handleName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (ハンドル名)handle_name: {text(2147483647)}
     * @param handleName The value of handleName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHandleName_LessThan(String handleName) {
        regHandleName(CK_LT, fRES(handleName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (ハンドル名)handle_name: {text(2147483647)}
     * @param handleName The value of handleName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHandleName_GreaterEqual(String handleName) {
        regHandleName(CK_GE, fRES(handleName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (ハンドル名)handle_name: {text(2147483647)}
     * @param handleName The value of handleName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHandleName_LessEqual(String handleName) {
        regHandleName(CK_LE, fRES(handleName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (ハンドル名)handle_name: {text(2147483647)}
     * @param handleNameList The collection of handleName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHandleName_InScope(Collection<String> handleNameList) {
        doSetHandleName_InScope(handleNameList);
    }

    protected void doSetHandleName_InScope(Collection<String> handleNameList) {
        regINS(CK_INS, cTL(handleNameList), xgetCValueHandleName(), "handle_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (ハンドル名)handle_name: {text(2147483647)}
     * @param handleNameList The collection of handleName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHandleName_NotInScope(Collection<String> handleNameList) {
        doSetHandleName_NotInScope(handleNameList);
    }

    protected void doSetHandleName_NotInScope(Collection<String> handleNameList) {
        regINS(CK_NINS, cTL(handleNameList), xgetCValueHandleName(), "handle_name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (ハンドル名)handle_name: {text(2147483647)} <br>
     * <pre>e.g. setHandleName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param handleName The value of handleName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setHandleName_LikeSearch(String handleName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setHandleName_LikeSearch(handleName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (ハンドル名)handle_name: {text(2147483647)} <br>
     * <pre>e.g. setHandleName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param handleName The value of handleName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setHandleName_LikeSearch(String handleName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(handleName), xgetCValueHandleName(), "handle_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (ハンドル名)handle_name: {text(2147483647)}
     * @param handleName The value of handleName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setHandleName_NotLikeSearch(String handleName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setHandleName_NotLikeSearch(handleName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (ハンドル名)handle_name: {text(2147483647)}
     * @param handleName The value of handleName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setHandleName_NotLikeSearch(String handleName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(handleName), xgetCValueHandleName(), "handle_name", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (ハンドル名)handle_name: {text(2147483647)}
     */
    public void setHandleName_IsNull() { regHandleName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (ハンドル名)handle_name: {text(2147483647)}
     */
    public void setHandleName_IsNullOrEmpty() { regHandleName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (ハンドル名)handle_name: {text(2147483647)}
     */
    public void setHandleName_IsNotNull() { regHandleName(CK_ISNN, DOBJ); }

    protected void regHandleName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHandleName(), "handle_name"); }
    protected abstract ConditionValue xgetCValueHandleName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (最終ログイン日時)last_login_datetime: {timestamp(26, 3), default=[now()]}
     * @param lastLoginDatetime The value of lastLoginDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLastLoginDatetime_Equal(java.time.LocalDateTime lastLoginDatetime) {
        regLastLoginDatetime(CK_EQ,  lastLoginDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (最終ログイン日時)last_login_datetime: {timestamp(26, 3), default=[now()]}
     * @param lastLoginDatetime The value of lastLoginDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLastLoginDatetime_GreaterThan(java.time.LocalDateTime lastLoginDatetime) {
        regLastLoginDatetime(CK_GT,  lastLoginDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (最終ログイン日時)last_login_datetime: {timestamp(26, 3), default=[now()]}
     * @param lastLoginDatetime The value of lastLoginDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLastLoginDatetime_LessThan(java.time.LocalDateTime lastLoginDatetime) {
        regLastLoginDatetime(CK_LT,  lastLoginDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (最終ログイン日時)last_login_datetime: {timestamp(26, 3), default=[now()]}
     * @param lastLoginDatetime The value of lastLoginDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLastLoginDatetime_GreaterEqual(java.time.LocalDateTime lastLoginDatetime) {
        regLastLoginDatetime(CK_GE,  lastLoginDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (最終ログイン日時)last_login_datetime: {timestamp(26, 3), default=[now()]}
     * @param lastLoginDatetime The value of lastLoginDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLastLoginDatetime_LessEqual(java.time.LocalDateTime lastLoginDatetime) {
        regLastLoginDatetime(CK_LE, lastLoginDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (最終ログイン日時)last_login_datetime: {timestamp(26, 3), default=[now()]}
     * <pre>e.g. setLastLoginDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of lastLoginDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of lastLoginDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setLastLoginDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setLastLoginDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (最終ログイン日時)last_login_datetime: {timestamp(26, 3), default=[now()]}
     * <pre>e.g. setLastLoginDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of lastLoginDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of lastLoginDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setLastLoginDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "last_login_datetime"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueLastLoginDatetime(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (最終ログイン日時)last_login_datetime: {timestamp(26, 3), default=[now()]}
     */
    public void setLastLoginDatetime_IsNull() { regLastLoginDatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (最終ログイン日時)last_login_datetime: {timestamp(26, 3), default=[now()]}
     */
    public void setLastLoginDatetime_IsNotNull() { regLastLoginDatetime(CK_ISNN, DOBJ); }

    protected void regLastLoginDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLastLoginDatetime(), "last_login_datetime"); }
    protected abstract ConditionValue xgetCValueLastLoginDatetime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * settlement_date: {int4(10)}
     * @param settlementDate The value of settlementDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSettlementDate_Equal(Integer settlementDate) {
        doSetSettlementDate_Equal(settlementDate);
    }

    protected void doSetSettlementDate_Equal(Integer settlementDate) {
        regSettlementDate(CK_EQ, settlementDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * settlement_date: {int4(10)}
     * @param settlementDate The value of settlementDate as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSettlementDate_NotEqual(Integer settlementDate) {
        doSetSettlementDate_NotEqual(settlementDate);
    }

    protected void doSetSettlementDate_NotEqual(Integer settlementDate) {
        regSettlementDate(CK_NES, settlementDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * settlement_date: {int4(10)}
     * @param settlementDate The value of settlementDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSettlementDate_GreaterThan(Integer settlementDate) {
        regSettlementDate(CK_GT, settlementDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * settlement_date: {int4(10)}
     * @param settlementDate The value of settlementDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSettlementDate_LessThan(Integer settlementDate) {
        regSettlementDate(CK_LT, settlementDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * settlement_date: {int4(10)}
     * @param settlementDate The value of settlementDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSettlementDate_GreaterEqual(Integer settlementDate) {
        regSettlementDate(CK_GE, settlementDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * settlement_date: {int4(10)}
     * @param settlementDate The value of settlementDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSettlementDate_LessEqual(Integer settlementDate) {
        regSettlementDate(CK_LE, settlementDate);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * settlement_date: {int4(10)}
     * @param minNumber The min number of settlementDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of settlementDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setSettlementDate_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setSettlementDate_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * settlement_date: {int4(10)}
     * @param minNumber The min number of settlementDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of settlementDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setSettlementDate_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSettlementDate(), "settlement_date", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * settlement_date: {int4(10)}
     * @param settlementDateList The collection of settlementDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSettlementDate_InScope(Collection<Integer> settlementDateList) {
        doSetSettlementDate_InScope(settlementDateList);
    }

    protected void doSetSettlementDate_InScope(Collection<Integer> settlementDateList) {
        regINS(CK_INS, cTL(settlementDateList), xgetCValueSettlementDate(), "settlement_date");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * settlement_date: {int4(10)}
     * @param settlementDateList The collection of settlementDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSettlementDate_NotInScope(Collection<Integer> settlementDateList) {
        doSetSettlementDate_NotInScope(settlementDateList);
    }

    protected void doSetSettlementDate_NotInScope(Collection<Integer> settlementDateList) {
        regINS(CK_NINS, cTL(settlementDateList), xgetCValueSettlementDate(), "settlement_date");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * settlement_date: {int4(10)}
     */
    public void setSettlementDate_IsNull() { regSettlementDate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * settlement_date: {int4(10)}
     */
    public void setSettlementDate_IsNotNull() { regSettlementDate(CK_ISNN, DOBJ); }

    protected void regSettlementDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSettlementDate(), "settlement_date"); }
    protected abstract ConditionValue xgetCValueSettlementDate();

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
    public HpSLCFunction<UserMCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, UserMCB.class);
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
    public HpSLCFunction<UserMCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, UserMCB.class);
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
    public HpSLCFunction<UserMCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, UserMCB.class);
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
    public HpSLCFunction<UserMCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, UserMCB.class);
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
    public HpSLCFunction<UserMCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, UserMCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;UserMCB&gt;() {
     *     public void query(UserMCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<UserMCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, UserMCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        UserMCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(UserMCQ sq);

    protected UserMCB xcreateScalarConditionCB() {
        UserMCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected UserMCB xcreateScalarConditionPartitionByCB() {
        UserMCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<UserMCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        UserMCB cb = new UserMCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "user_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(UserMCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<UserMCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(UserMCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        UserMCB cb = new UserMCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "user_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(UserMCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<UserMCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        UserMCB cb = new UserMCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(UserMCQ sq);

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
    protected UserMCB newMyCB() {
        return new UserMCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return UserMCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
