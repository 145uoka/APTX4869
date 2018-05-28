package com.olympus.aptx4869.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.olympus.aptx4869.dbflute.exbhv.*;
import com.olympus.aptx4869.dbflute.exentity.*;

/**
 * The referrer loader of regularly_data as TABLE. <br>
 * <pre>
 * [primary key]
 *     property_id
 *
 * [column]
 *     property_id, user_id, regularly_flag, amount, accountingdate, delete_flag, register_datetime, update_datetime
 *
 * [sequence]
 *     regularly_data_property_id_seq
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
public class LoaderOfRegularlyData {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<RegularlyData> _selectedList;
    protected BehaviorSelector _selector;
    protected RegularlyDataBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfRegularlyData ready(List<RegularlyData> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected RegularlyDataBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(RegularlyDataBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<RegularlyData> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
