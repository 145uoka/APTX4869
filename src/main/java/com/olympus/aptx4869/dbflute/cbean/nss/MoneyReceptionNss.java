package com.olympus.aptx4869.dbflute.cbean.nss;

import com.olympus.aptx4869.dbflute.cbean.cq.MoneyReceptionCQ;

/**
 * The nest select set-upper of money_reception.
 * @author DBFlute(AutoGenerator)
 */
public class MoneyReceptionNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MoneyReceptionCQ _query;
    public MoneyReceptionNss(MoneyReceptionCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * genre by my genre_id, named 'genre'.
     */
    public void withGenre() {
        _query.xdoNss(() -> _query.queryGenre());
    }
    /**
     * With nested relation columns to select clause. <br>
     * (ユーザー_M)user_m by my user_id, named 'userM'.
     */
    public void withUserM() {
        _query.xdoNss(() -> _query.queryUserM());
    }
}
