package com.olympus.aptx4869.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.olympus.aptx4869.dbflute.exbhv.*;
import com.olympus.aptx4869.dbflute.exentity.*;

/**
 * The referrer loader of property_m as TABLE. <br>
 * <pre>
 * [primary key]
 *     property_id
 *
 * [column]
 *     property_id, prop_name, prop_val, prop_group_name, delete_flag, register_datetime, update_datetime
 *
 * [sequence]
 *     property_m_property_id_seq
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
public class LoaderOfPropertyM {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<PropertyM> _selectedList;
    protected BehaviorSelector _selector;
    protected PropertyMBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfPropertyM ready(List<PropertyM> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected PropertyMBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(PropertyMBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<PropertyM> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
