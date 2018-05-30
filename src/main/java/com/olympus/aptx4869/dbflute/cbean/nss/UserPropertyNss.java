package com.olympus.aptx4869.dbflute.cbean.nss;

import com.olympus.aptx4869.dbflute.cbean.cq.UserPropertyCQ;

/**
 * The nest select set-upper of user_property.
 * @author DBFlute(AutoGenerator)
 */
public class UserPropertyNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final UserPropertyCQ _query;
    public UserPropertyNss(UserPropertyCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * (ユーザー_M)user_m by my user_id, named 'userM'.
     */
    public void withUserM() {
        _query.xdoNss(() -> _query.queryUserM());
    }
}
