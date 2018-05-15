package com.olympus.aptx4869.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.olympus.aptx4869.dbflute.exbhv.*;
import com.olympus.aptx4869.dbflute.exentity.*;

/**
 * The referrer loader of (OAuthプロパティ_M)oauth_property_m as TABLE. <br>
 * <pre>
 * [primary key]
 *     oauth_property_id
 *
 * [column]
 *     oauth_property_id, app_key, redirect_url, client_id, client_secret, delete_flag, register_datetime, update_datetime
 *
 * [sequence]
 *     oauth_property_m_oauth_property_id_seq
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
public class LoaderOfOauthPropertyM {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<OauthPropertyM> _selectedList;
    protected BehaviorSelector _selector;
    protected OauthPropertyMBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfOauthPropertyM ready(List<OauthPropertyM> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected OauthPropertyMBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(OauthPropertyMBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<OauthPropertyM> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
