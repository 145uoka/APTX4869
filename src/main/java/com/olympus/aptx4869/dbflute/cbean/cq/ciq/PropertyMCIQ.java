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
 * The condition-query for in-line of property_m.
 * @author DBFlute(AutoGenerator)
 */
public class PropertyMCIQ extends AbstractBsPropertyMCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsPropertyMCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public PropertyMCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsPropertyMCQ myCQ) {
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
    protected ConditionValue xgetCValuePropertyId() { return _myCQ.xdfgetPropertyId(); }
    protected ConditionValue xgetCValuePropName() { return _myCQ.xdfgetPropName(); }
    protected ConditionValue xgetCValuePropVal() { return _myCQ.xdfgetPropVal(); }
    protected ConditionValue xgetCValuePropGroupName() { return _myCQ.xdfgetPropGroupName(); }
    protected ConditionValue xgetCValueDeleteFlag() { return _myCQ.xdfgetDeleteFlag(); }
    protected ConditionValue xgetCValueRegisterDatetime() { return _myCQ.xdfgetRegisterDatetime(); }
    protected ConditionValue xgetCValueUpdateDatetime() { return _myCQ.xdfgetUpdateDatetime(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(PropertyMCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(PropertyMCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(PropertyMCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(PropertyMCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return PropertyMCB.class.getName(); }
    protected String xinCQ() { return PropertyMCQ.class.getName(); }
}
