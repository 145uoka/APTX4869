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
 * The abstract condition-query of property_m.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsPropertyMCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsPropertyMCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "property_m";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * (プロパティID)property_id: {PK, ID, NotNull, serial(10)}
     * @param propertyId The value of propertyId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPropertyId_Equal(Integer propertyId) {
        doSetPropertyId_Equal(propertyId);
    }

    protected void doSetPropertyId_Equal(Integer propertyId) {
        regPropertyId(CK_EQ, propertyId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (プロパティID)property_id: {PK, ID, NotNull, serial(10)}
     * @param propertyId The value of propertyId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPropertyId_NotEqual(Integer propertyId) {
        doSetPropertyId_NotEqual(propertyId);
    }

    protected void doSetPropertyId_NotEqual(Integer propertyId) {
        regPropertyId(CK_NES, propertyId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (プロパティID)property_id: {PK, ID, NotNull, serial(10)}
     * @param propertyId The value of propertyId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPropertyId_GreaterThan(Integer propertyId) {
        regPropertyId(CK_GT, propertyId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * (プロパティID)property_id: {PK, ID, NotNull, serial(10)}
     * @param propertyId The value of propertyId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPropertyId_LessThan(Integer propertyId) {
        regPropertyId(CK_LT, propertyId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (プロパティID)property_id: {PK, ID, NotNull, serial(10)}
     * @param propertyId The value of propertyId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPropertyId_GreaterEqual(Integer propertyId) {
        regPropertyId(CK_GE, propertyId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * (プロパティID)property_id: {PK, ID, NotNull, serial(10)}
     * @param propertyId The value of propertyId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPropertyId_LessEqual(Integer propertyId) {
        regPropertyId(CK_LE, propertyId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (プロパティID)property_id: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of propertyId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of propertyId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setPropertyId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setPropertyId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * (プロパティID)property_id: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of propertyId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of propertyId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setPropertyId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePropertyId(), "property_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (プロパティID)property_id: {PK, ID, NotNull, serial(10)}
     * @param propertyIdList The collection of propertyId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropertyId_InScope(Collection<Integer> propertyIdList) {
        doSetPropertyId_InScope(propertyIdList);
    }

    protected void doSetPropertyId_InScope(Collection<Integer> propertyIdList) {
        regINS(CK_INS, cTL(propertyIdList), xgetCValuePropertyId(), "property_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * (プロパティID)property_id: {PK, ID, NotNull, serial(10)}
     * @param propertyIdList The collection of propertyId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropertyId_NotInScope(Collection<Integer> propertyIdList) {
        doSetPropertyId_NotInScope(propertyIdList);
    }

    protected void doSetPropertyId_NotInScope(Collection<Integer> propertyIdList) {
        regINS(CK_NINS, cTL(propertyIdList), xgetCValuePropertyId(), "property_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (プロパティID)property_id: {PK, ID, NotNull, serial(10)}
     */
    public void setPropertyId_IsNull() { regPropertyId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (プロパティID)property_id: {PK, ID, NotNull, serial(10)}
     */
    public void setPropertyId_IsNotNull() { regPropertyId(CK_ISNN, DOBJ); }

    protected void regPropertyId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePropertyId(), "property_id"); }
    protected abstract ConditionValue xgetCValuePropertyId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (プロパティ名)prop_name: {UQ, NotNull, text(2147483647)}
     * @param propName The value of propName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropName_Equal(String propName) {
        doSetPropName_Equal(fRES(propName));
    }

    protected void doSetPropName_Equal(String propName) {
        regPropName(CK_EQ, propName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (プロパティ名)prop_name: {UQ, NotNull, text(2147483647)}
     * @param propName The value of propName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropName_NotEqual(String propName) {
        doSetPropName_NotEqual(fRES(propName));
    }

    protected void doSetPropName_NotEqual(String propName) {
        regPropName(CK_NES, propName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (プロパティ名)prop_name: {UQ, NotNull, text(2147483647)}
     * @param propName The value of propName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropName_GreaterThan(String propName) {
        regPropName(CK_GT, fRES(propName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (プロパティ名)prop_name: {UQ, NotNull, text(2147483647)}
     * @param propName The value of propName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropName_LessThan(String propName) {
        regPropName(CK_LT, fRES(propName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (プロパティ名)prop_name: {UQ, NotNull, text(2147483647)}
     * @param propName The value of propName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropName_GreaterEqual(String propName) {
        regPropName(CK_GE, fRES(propName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (プロパティ名)prop_name: {UQ, NotNull, text(2147483647)}
     * @param propName The value of propName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropName_LessEqual(String propName) {
        regPropName(CK_LE, fRES(propName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (プロパティ名)prop_name: {UQ, NotNull, text(2147483647)}
     * @param propNameList The collection of propName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropName_InScope(Collection<String> propNameList) {
        doSetPropName_InScope(propNameList);
    }

    protected void doSetPropName_InScope(Collection<String> propNameList) {
        regINS(CK_INS, cTL(propNameList), xgetCValuePropName(), "prop_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (プロパティ名)prop_name: {UQ, NotNull, text(2147483647)}
     * @param propNameList The collection of propName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropName_NotInScope(Collection<String> propNameList) {
        doSetPropName_NotInScope(propNameList);
    }

    protected void doSetPropName_NotInScope(Collection<String> propNameList) {
        regINS(CK_NINS, cTL(propNameList), xgetCValuePropName(), "prop_name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (プロパティ名)prop_name: {UQ, NotNull, text(2147483647)} <br>
     * <pre>e.g. setPropName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param propName The value of propName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPropName_LikeSearch(String propName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPropName_LikeSearch(propName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (プロパティ名)prop_name: {UQ, NotNull, text(2147483647)} <br>
     * <pre>e.g. setPropName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param propName The value of propName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setPropName_LikeSearch(String propName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(propName), xgetCValuePropName(), "prop_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (プロパティ名)prop_name: {UQ, NotNull, text(2147483647)}
     * @param propName The value of propName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPropName_NotLikeSearch(String propName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPropName_NotLikeSearch(propName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (プロパティ名)prop_name: {UQ, NotNull, text(2147483647)}
     * @param propName The value of propName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setPropName_NotLikeSearch(String propName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(propName), xgetCValuePropName(), "prop_name", likeSearchOption);
    }

    protected void regPropName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePropName(), "prop_name"); }
    protected abstract ConditionValue xgetCValuePropName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (プロパティ値)prop_val: {text(2147483647)}
     * @param propVal The value of propVal as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropVal_Equal(String propVal) {
        doSetPropVal_Equal(fRES(propVal));
    }

    protected void doSetPropVal_Equal(String propVal) {
        regPropVal(CK_EQ, propVal);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (プロパティ値)prop_val: {text(2147483647)}
     * @param propVal The value of propVal as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropVal_NotEqual(String propVal) {
        doSetPropVal_NotEqual(fRES(propVal));
    }

    protected void doSetPropVal_NotEqual(String propVal) {
        regPropVal(CK_NES, propVal);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (プロパティ値)prop_val: {text(2147483647)}
     * @param propVal The value of propVal as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropVal_GreaterThan(String propVal) {
        regPropVal(CK_GT, fRES(propVal));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (プロパティ値)prop_val: {text(2147483647)}
     * @param propVal The value of propVal as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropVal_LessThan(String propVal) {
        regPropVal(CK_LT, fRES(propVal));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (プロパティ値)prop_val: {text(2147483647)}
     * @param propVal The value of propVal as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropVal_GreaterEqual(String propVal) {
        regPropVal(CK_GE, fRES(propVal));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (プロパティ値)prop_val: {text(2147483647)}
     * @param propVal The value of propVal as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropVal_LessEqual(String propVal) {
        regPropVal(CK_LE, fRES(propVal));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (プロパティ値)prop_val: {text(2147483647)}
     * @param propValList The collection of propVal as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropVal_InScope(Collection<String> propValList) {
        doSetPropVal_InScope(propValList);
    }

    protected void doSetPropVal_InScope(Collection<String> propValList) {
        regINS(CK_INS, cTL(propValList), xgetCValuePropVal(), "prop_val");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (プロパティ値)prop_val: {text(2147483647)}
     * @param propValList The collection of propVal as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropVal_NotInScope(Collection<String> propValList) {
        doSetPropVal_NotInScope(propValList);
    }

    protected void doSetPropVal_NotInScope(Collection<String> propValList) {
        regINS(CK_NINS, cTL(propValList), xgetCValuePropVal(), "prop_val");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (プロパティ値)prop_val: {text(2147483647)} <br>
     * <pre>e.g. setPropVal_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param propVal The value of propVal as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPropVal_LikeSearch(String propVal, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPropVal_LikeSearch(propVal, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (プロパティ値)prop_val: {text(2147483647)} <br>
     * <pre>e.g. setPropVal_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param propVal The value of propVal as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setPropVal_LikeSearch(String propVal, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(propVal), xgetCValuePropVal(), "prop_val", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (プロパティ値)prop_val: {text(2147483647)}
     * @param propVal The value of propVal as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPropVal_NotLikeSearch(String propVal, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPropVal_NotLikeSearch(propVal, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (プロパティ値)prop_val: {text(2147483647)}
     * @param propVal The value of propVal as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setPropVal_NotLikeSearch(String propVal, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(propVal), xgetCValuePropVal(), "prop_val", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (プロパティ値)prop_val: {text(2147483647)}
     */
    public void setPropVal_IsNull() { regPropVal(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (プロパティ値)prop_val: {text(2147483647)}
     */
    public void setPropVal_IsNullOrEmpty() { regPropVal(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (プロパティ値)prop_val: {text(2147483647)}
     */
    public void setPropVal_IsNotNull() { regPropVal(CK_ISNN, DOBJ); }

    protected void regPropVal(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePropVal(), "prop_val"); }
    protected abstract ConditionValue xgetCValuePropVal();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (プロパティグループ名)prop_group_name: {text(2147483647)}
     * @param propGroupName The value of propGroupName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropGroupName_Equal(String propGroupName) {
        doSetPropGroupName_Equal(fRES(propGroupName));
    }

    protected void doSetPropGroupName_Equal(String propGroupName) {
        regPropGroupName(CK_EQ, propGroupName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (プロパティグループ名)prop_group_name: {text(2147483647)}
     * @param propGroupName The value of propGroupName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropGroupName_NotEqual(String propGroupName) {
        doSetPropGroupName_NotEqual(fRES(propGroupName));
    }

    protected void doSetPropGroupName_NotEqual(String propGroupName) {
        regPropGroupName(CK_NES, propGroupName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (プロパティグループ名)prop_group_name: {text(2147483647)}
     * @param propGroupName The value of propGroupName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropGroupName_GreaterThan(String propGroupName) {
        regPropGroupName(CK_GT, fRES(propGroupName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (プロパティグループ名)prop_group_name: {text(2147483647)}
     * @param propGroupName The value of propGroupName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropGroupName_LessThan(String propGroupName) {
        regPropGroupName(CK_LT, fRES(propGroupName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (プロパティグループ名)prop_group_name: {text(2147483647)}
     * @param propGroupName The value of propGroupName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropGroupName_GreaterEqual(String propGroupName) {
        regPropGroupName(CK_GE, fRES(propGroupName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * (プロパティグループ名)prop_group_name: {text(2147483647)}
     * @param propGroupName The value of propGroupName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropGroupName_LessEqual(String propGroupName) {
        regPropGroupName(CK_LE, fRES(propGroupName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (プロパティグループ名)prop_group_name: {text(2147483647)}
     * @param propGroupNameList The collection of propGroupName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropGroupName_InScope(Collection<String> propGroupNameList) {
        doSetPropGroupName_InScope(propGroupNameList);
    }

    protected void doSetPropGroupName_InScope(Collection<String> propGroupNameList) {
        regINS(CK_INS, cTL(propGroupNameList), xgetCValuePropGroupName(), "prop_group_name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * (プロパティグループ名)prop_group_name: {text(2147483647)}
     * @param propGroupNameList The collection of propGroupName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPropGroupName_NotInScope(Collection<String> propGroupNameList) {
        doSetPropGroupName_NotInScope(propGroupNameList);
    }

    protected void doSetPropGroupName_NotInScope(Collection<String> propGroupNameList) {
        regINS(CK_NINS, cTL(propGroupNameList), xgetCValuePropGroupName(), "prop_group_name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (プロパティグループ名)prop_group_name: {text(2147483647)} <br>
     * <pre>e.g. setPropGroupName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param propGroupName The value of propGroupName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPropGroupName_LikeSearch(String propGroupName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPropGroupName_LikeSearch(propGroupName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (プロパティグループ名)prop_group_name: {text(2147483647)} <br>
     * <pre>e.g. setPropGroupName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param propGroupName The value of propGroupName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setPropGroupName_LikeSearch(String propGroupName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(propGroupName), xgetCValuePropGroupName(), "prop_group_name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (プロパティグループ名)prop_group_name: {text(2147483647)}
     * @param propGroupName The value of propGroupName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPropGroupName_NotLikeSearch(String propGroupName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPropGroupName_NotLikeSearch(propGroupName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * (プロパティグループ名)prop_group_name: {text(2147483647)}
     * @param propGroupName The value of propGroupName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setPropGroupName_NotLikeSearch(String propGroupName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(propGroupName), xgetCValuePropGroupName(), "prop_group_name", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * (プロパティグループ名)prop_group_name: {text(2147483647)}
     */
    public void setPropGroupName_IsNull() { regPropGroupName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * (プロパティグループ名)prop_group_name: {text(2147483647)}
     */
    public void setPropGroupName_IsNullOrEmpty() { regPropGroupName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * (プロパティグループ名)prop_group_name: {text(2147483647)}
     */
    public void setPropGroupName_IsNotNull() { regPropGroupName(CK_ISNN, DOBJ); }

    protected void regPropGroupName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePropGroupName(), "prop_group_name"); }
    protected abstract ConditionValue xgetCValuePropGroupName();

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
    public HpSLCFunction<PropertyMCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, PropertyMCB.class);
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
    public HpSLCFunction<PropertyMCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, PropertyMCB.class);
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
    public HpSLCFunction<PropertyMCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, PropertyMCB.class);
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
    public HpSLCFunction<PropertyMCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, PropertyMCB.class);
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
    public HpSLCFunction<PropertyMCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, PropertyMCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;PropertyMCB&gt;() {
     *     public void query(PropertyMCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<PropertyMCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, PropertyMCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        PropertyMCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(PropertyMCQ sq);

    protected PropertyMCB xcreateScalarConditionCB() {
        PropertyMCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected PropertyMCB xcreateScalarConditionPartitionByCB() {
        PropertyMCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<PropertyMCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PropertyMCB cb = new PropertyMCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "property_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(PropertyMCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<PropertyMCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(PropertyMCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PropertyMCB cb = new PropertyMCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "property_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(PropertyMCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<PropertyMCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PropertyMCB cb = new PropertyMCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(PropertyMCQ sq);

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
    protected PropertyMCB newMyCB() {
        return new PropertyMCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return PropertyMCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
