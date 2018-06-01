package com.olympus.aptx4869.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.olympus.aptx4869.dbflute.exbhv.*;
import com.olympus.aptx4869.dbflute.exentity.*;
import com.olympus.aptx4869.dbflute.cbean.*;

/**
 * The referrer loader of (ユーザー_M)user_m as TABLE. <br>
 * <pre>
 * [primary key]
 *     user_id
 *
 * [column]
 *     user_id, line_id, line_email, line_name, first_name, last_name, handle_name, last_login_datetime, settlement_date, delete_flag, register_datetime, update_datetime
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
 *     money_reception, regularly_data, user_property
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     moneyReceptionList, regularlyDataList, userPropertyList
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
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MoneyReception> _referrerMoneyReception;

    /**
     * Load referrer of moneyReceptionList by the set-upper of referrer. <br>
     * money_reception by user_id, named 'moneyReceptionList'.
     * <pre>
     * <span style="color: #0000C0">userMBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">userMList</span>, <span style="color: #553000">mLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">mLoader</span>.<span style="color: #CC4747">loadMoneyReception</span>(<span style="color: #553000">receptionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">receptionCB</span>.setupSelect...
     *         <span style="color: #553000">receptionCB</span>.query().set...
     *         <span style="color: #553000">receptionCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">receptionLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    receptionLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (UserM userM : <span style="color: #553000">userMList</span>) {
     *     ... = userM.<span style="color: #CC4747">getMoneyReceptionList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setUserId_InScope(pkList);
     * cb.query().addOrderBy_UserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMoneyReception> loadMoneyReception(ReferrerConditionSetupper<MoneyReceptionCB> refCBLambda) {
        myBhv().loadMoneyReception(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMoneyReception = refLs);
        return hd -> hd.handle(new LoaderOfMoneyReception().ready(_referrerMoneyReception, _selector));
    }

    protected List<RegularlyData> _referrerRegularlyData;

    /**
     * Load referrer of regularlyDataList by the set-upper of referrer. <br>
     * regularly_data by user_id, named 'regularlyDataList'.
     * <pre>
     * <span style="color: #0000C0">userMBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">userMList</span>, <span style="color: #553000">mLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">mLoader</span>.<span style="color: #CC4747">loadRegularlyData</span>(<span style="color: #553000">dataCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">dataCB</span>.setupSelect...
     *         <span style="color: #553000">dataCB</span>.query().set...
     *         <span style="color: #553000">dataCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">dataLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    dataLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (UserM userM : <span style="color: #553000">userMList</span>) {
     *     ... = userM.<span style="color: #CC4747">getRegularlyDataList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setUserId_InScope(pkList);
     * cb.query().addOrderBy_UserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfRegularlyData> loadRegularlyData(ReferrerConditionSetupper<RegularlyDataCB> refCBLambda) {
        myBhv().loadRegularlyData(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerRegularlyData = refLs);
        return hd -> hd.handle(new LoaderOfRegularlyData().ready(_referrerRegularlyData, _selector));
    }

    protected List<UserProperty> _referrerUserProperty;

    /**
     * Load referrer of userPropertyList by the set-upper of referrer. <br>
     * user_property by user_id, named 'userPropertyList'.
     * <pre>
     * <span style="color: #0000C0">userMBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">userMList</span>, <span style="color: #553000">mLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">mLoader</span>.<span style="color: #CC4747">loadUserProperty</span>(<span style="color: #553000">propertyCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">propertyCB</span>.setupSelect...
     *         <span style="color: #553000">propertyCB</span>.query().set...
     *         <span style="color: #553000">propertyCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">propertyLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    propertyLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (UserM userM : <span style="color: #553000">userMList</span>) {
     *     ... = userM.<span style="color: #CC4747">getUserPropertyList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setUserId_InScope(pkList);
     * cb.query().addOrderBy_UserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfUserProperty> loadUserProperty(ReferrerConditionSetupper<UserPropertyCB> refCBLambda) {
        myBhv().loadUserProperty(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerUserProperty = refLs);
        return hd -> hd.handle(new LoaderOfUserProperty().ready(_referrerUserProperty, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<UserM> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
