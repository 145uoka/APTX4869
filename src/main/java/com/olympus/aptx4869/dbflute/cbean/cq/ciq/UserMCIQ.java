package com.olympus.aptx4869.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.dbflute.cbean.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.ConditionOption;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.olympus.aptx4869.dbflute.cbean.*;
import com.olympus.aptx4869.dbflute.cbean.cq.bs.*;
import com.olympus.aptx4869.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of user_m.
 * @author DBFlute(AutoGenerator)
 */
public class UserMCIQ extends AbstractBsUserMCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsUserMCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public UserMCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsUserMCQ myCQ) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq)
    { throw new IllegalConditionBeanOperationException("InlineView cannot use Union: " + bq + " : " + uq); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col)
    { regIQ(k, v, cv, col); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op)
    { regIQ(k, v, cv, col, op); }

    @Override
    protected void registerWhereClause(String wc)
    { registerInlineWhereClause(wc); }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) { throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported."); }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue xgetCValueUserId() { return _myCQ.xdfgetUserId(); }
    protected ConditionValue xgetCValueLineId() { return _myCQ.xdfgetLineId(); }
    protected ConditionValue xgetCValueLineName() { return _myCQ.xdfgetLineName(); }
    protected ConditionValue xgetCValueLineEmail() { return _myCQ.xdfgetLineEmail(); }
    protected ConditionValue xgetCValueFirstName() { return _myCQ.xdfgetFirstName(); }
    protected ConditionValue xgetCValueLastName() { return _myCQ.xdfgetLastName(); }
    protected ConditionValue xgetCValueHandleName() { return _myCQ.xdfgetHandleName(); }
    protected ConditionValue xgetCValueLastLoginDatetime() { return _myCQ.xdfgetLastLoginDatetime(); }
    protected ConditionValue xgetCValueDeleteFlag() { return _myCQ.xdfgetDeleteFlag(); }
    protected ConditionValue xgetCValueRegisterDatetime() { return _myCQ.xdfgetRegisterDatetime(); }
    protected ConditionValue xgetCValueUpdateDatetime() { return _myCQ.xdfgetUpdateDatetime(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(UserMCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(UserMCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(UserMCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(UserMCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return UserMCB.class.getName(); }
    protected String xinCQ() { return UserMCQ.class.getName(); }
}
