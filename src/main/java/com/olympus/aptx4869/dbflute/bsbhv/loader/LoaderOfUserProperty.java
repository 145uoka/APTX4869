package com.olympus.aptx4869.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.olympus.aptx4869.dbflute.exbhv.*;
import com.olympus.aptx4869.dbflute.exentity.*;

/**
 * The referrer loader of user_property as TABLE. <br>
 * <pre>
 * [primary key]
 *     property_id
 *
 * [column]
 *     property_id, user_id, settlement_date, budget, delete_flag, register_datetime, update_datetime
 *
 * [sequence]
 *     user_property_property_id_seq
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
public class LoaderOfUserProperty {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<UserProperty> _selectedList;
    protected BehaviorSelector _selector;
    protected UserPropertyBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfUserProperty ready(List<UserProperty> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected UserPropertyBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(UserPropertyBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<UserProperty> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
