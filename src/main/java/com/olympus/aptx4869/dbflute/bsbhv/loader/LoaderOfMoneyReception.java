package com.olympus.aptx4869.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.olympus.aptx4869.dbflute.exbhv.*;
import com.olympus.aptx4869.dbflute.exentity.*;

/**
 * The referrer loader of money_reception as TABLE. <br>
 * <pre>
 * [primary key]
 *     money_reception_id
 *
 * [column]
 *     money_reception_id, user_id, genre_id, money_reception_flag, amount, money_reception_date, supplement, delete_flag, register_datetime, update_datetime
 *
 * [sequence]
 *     money_reception_money_reception_id_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     genre, user_m
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     genre, userM
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMoneyReception {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MoneyReception> _selectedList;
    protected BehaviorSelector _selector;
    protected MoneyReceptionBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMoneyReception ready(List<MoneyReception> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MoneyReceptionBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MoneyReceptionBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfGenre _foreignGenreLoader;
    public LoaderOfGenre pulloutGenre() {
        if (_foreignGenreLoader == null)
        { _foreignGenreLoader = new LoaderOfGenre().ready(myBhv().pulloutGenre(_selectedList), _selector); }
        return _foreignGenreLoader;
    }

    protected LoaderOfUserM _foreignUserMLoader;
    public LoaderOfUserM pulloutUserM() {
        if (_foreignUserMLoader == null)
        { _foreignUserMLoader = new LoaderOfUserM().ready(myBhv().pulloutUserM(_selectedList), _selector); }
        return _foreignUserMLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MoneyReception> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
