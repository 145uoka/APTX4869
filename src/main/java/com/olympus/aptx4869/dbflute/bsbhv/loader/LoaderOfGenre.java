package com.olympus.aptx4869.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.olympus.aptx4869.dbflute.exbhv.*;
import com.olympus.aptx4869.dbflute.exentity.*;
import com.olympus.aptx4869.dbflute.cbean.*;

/**
 * The referrer loader of genre as TABLE. <br>
 * <pre>
 * [primary key]
 *     genre_id
 *
 * [column]
 *     genre_id, genre_name, balance_flg, delete_flag, register_datetime, update_datetime
 *
 * [sequence]
 *     genre_genre_id_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     money_reception
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     moneyReceptionList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfGenre {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Genre> _selectedList;
    protected BehaviorSelector _selector;
    protected GenreBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfGenre ready(List<Genre> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected GenreBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(GenreBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MoneyReception> _referrerMoneyReception;

    /**
     * Load referrer of moneyReceptionList by the set-upper of referrer. <br>
     * money_reception by genre_id, named 'moneyReceptionList'.
     * <pre>
     * <span style="color: #0000C0">genreBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">genreList</span>, <span style="color: #553000">genreLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">genreLoader</span>.<span style="color: #CC4747">loadMoneyReception</span>(<span style="color: #553000">receptionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">receptionCB</span>.setupSelect...
     *         <span style="color: #553000">receptionCB</span>.query().set...
     *         <span style="color: #553000">receptionCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">receptionLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    receptionLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (Genre genre : <span style="color: #553000">genreList</span>) {
     *     ... = genre.<span style="color: #CC4747">getMoneyReceptionList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setGenreId_InScope(pkList);
     * cb.query().addOrderBy_GenreId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMoneyReception> loadMoneyReception(ReferrerConditionSetupper<MoneyReceptionCB> refCBLambda) {
        myBhv().loadMoneyReception(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMoneyReception = refLs);
        return hd -> hd.handle(new LoaderOfMoneyReception().ready(_referrerMoneyReception, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Genre> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
