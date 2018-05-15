package com.olympus.aptx4869.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.olympus.aptx4869.dbflute.exbhv.*;
import com.olympus.aptx4869.dbflute.exentity.*;

/**
 * The referrer loader of (ユーザー_M)user_m as TABLE. <br>
 * <pre>
 * [primary key]
 *     user_id
 *
 * [column]
 *     user_id, line_id, line_name, line_email, first_name, last_name, handle_name, last_login_datetime, delete_flag, register_datetime, update_datetime
 *
 * [sequence]
 *     user_m_user_id_seq
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
public class LoaderOfUserM {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<UserM> _selectedList;
    protected BehaviorSelector _selector;
    protected UserMBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfUserM ready(List<UserM> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected UserMBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(UserMBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<UserM> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
