package com.olympus.aptx4869.dbflute.cbean.nss;

import com.olympus.aptx4869.dbflute.cbean.cq.RegularlyDataCQ;

/**
 * The nest select set-upper of regularly_data.
 * @author DBFlute(AutoGenerator)
 */
public class RegularlyDataNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final RegularlyDataCQ _query;
    public RegularlyDataNss(RegularlyDataCQ query) { _query = query; }
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
