package com.olympus.aptx4869.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.olympus.aptx4869.dbflute.exbhv.*;
import com.olympus.aptx4869.dbflute.exentity.*;

/**
 * The referrer loader of genre as TABLE. <br>
 * <pre>
 * [primary key]
 *     genre_id
 *
 * [column]
 *     genre_id, genre_name, delete_flag, register_datetime, update_datetime
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
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
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
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Genre> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
