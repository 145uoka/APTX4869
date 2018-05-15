package com.olympus.aptx4869.dbflute.bsbhv;

import java.util.List;

import org.dbflute.*;
import org.dbflute.bhv.*;
import org.dbflute.bhv.readable.*;
import org.dbflute.bhv.writable.*;
import org.dbflute.bhv.referrer.*;
import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.HpSLSFunction;
import org.dbflute.cbean.result.*;
import org.dbflute.exception.*;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.outsidesql.executor.*;
import com.olympus.aptx4869.dbflute.exbhv.*;
import com.olympus.aptx4869.dbflute.bsbhv.loader.*;
import com.olympus.aptx4869.dbflute.exentity.*;
import com.olympus.aptx4869.dbflute.bsentity.dbmeta.*;
import com.olympus.aptx4869.dbflute.cbean.*;

/**
 * The behavior of (OAuthプロパティ_M)oauth_property_m as TABLE. <br>
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
public abstract class BsOauthPropertyMBhv extends AbstractBehaviorWritable<OauthPropertyM, OauthPropertyMCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public OauthPropertyMDbm asDBMeta() { return OauthPropertyMDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "oauth_property_m"; }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public OauthPropertyMCB newConditionBean() { return new OauthPropertyMCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">oauthPropertyMBhv</span>.<span style="color: #CC4747">selectCount</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of OauthPropertyM. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(CBCall<OauthPropertyMCB> cbLambda) {
        return facadeSelectCount(createCB(cbLambda));
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. <br>
     * It returns not-null optional entity, so you should ... <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, alwaysPresent().</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If it might be no data, isPresent() and orElse(), ...</span>
     * <pre>
     * <span style="color: #3F7E5E">// if the data always exists as your business rule</span>
     * <span style="color: #0000C0">oauthPropertyMBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">alwaysPresent</span>(<span style="color: #553000">oauthPropertyM</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present, or exception</span>
     *     ... = <span style="color: #553000">oauthPropertyM</span>.get...
     * });
     *
     * <span style="color: #3F7E5E">// if it might be no data, ...</span>
     * <span style="color: #0000C0">oauthPropertyMBhv</span>.<span style="color: #CC4747">selectEntity</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }).<span style="color: #CC4747">ifPresent</span>(<span style="color: #553000">oauthPropertyM</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if present</span>
     *     ... = <span style="color: #553000">oauthPropertyM</span>.get...
     * }).<span style="color: #994747">orElse</span>(() <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// called if not present</span>
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of OauthPropertyM. (NotNull)
     * @return The optional entity selected by the condition. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<OauthPropertyM> selectEntity(CBCall<OauthPropertyMCB> cbLambda) {
        return facadeSelectEntity(createCB(cbLambda));
    }

    protected OptionalEntity<OauthPropertyM> facadeSelectEntity(OauthPropertyMCB cb) {
        return doSelectOptionalEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends OauthPropertyM> OptionalEntity<ENTITY> doSelectOptionalEntity(OauthPropertyMCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)).orElse(null); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * OauthPropertyM <span style="color: #553000">oauthPropertyM</span> = <span style="color: #0000C0">oauthPropertyMBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> cb.acceptPK(1));
     * ... = <span style="color: #553000">oauthPropertyM</span>.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cbLambda The callback for condition-bean of OauthPropertyM. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OauthPropertyM selectEntityWithDeletedCheck(CBCall<OauthPropertyMCB> cbLambda) {
        return facadeSelectEntityWithDeletedCheck(createCB(cbLambda));
    }

    /**
     * Select the entity by the primary-key value.
     * @param oauthPropertyId (OAuthプロパティID): PK, ID, NotNull, serial(10). (NotNull)
     * @return The optional entity selected by the PK. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<OauthPropertyM> selectByPK(Integer oauthPropertyId) {
        return facadeSelectByPK(oauthPropertyId);
    }

    protected OptionalEntity<OauthPropertyM> facadeSelectByPK(Integer oauthPropertyId) {
        return doSelectOptionalByPK(oauthPropertyId, typeOfSelectedEntity());
    }

    protected <ENTITY extends OauthPropertyM> ENTITY doSelectByPK(Integer oauthPropertyId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(oauthPropertyId), tp);
    }

    protected <ENTITY extends OauthPropertyM> OptionalEntity<ENTITY> doSelectOptionalByPK(Integer oauthPropertyId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(oauthPropertyId, tp), oauthPropertyId);
    }

    protected OauthPropertyMCB xprepareCBAsPK(Integer oauthPropertyId) {
        assertObjectNotNull("oauthPropertyId", oauthPropertyId);
        return newConditionBean().acceptPK(oauthPropertyId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * ListResultBean&lt;OauthPropertyM&gt; <span style="color: #553000">oauthPropertyMList</span> = <span style="color: #0000C0">oauthPropertyMBhv</span>.<span style="color: #CC4747">selectList</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...;
     *     <span style="color: #553000">cb</span>.query().addOrderBy...;
     * });
     * <span style="color: #70226C">for</span> (OauthPropertyM <span style="color: #553000">oauthPropertyM</span> : <span style="color: #553000">oauthPropertyMList</span>) {
     *     ... = <span style="color: #553000">oauthPropertyM</span>.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of OauthPropertyM. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<OauthPropertyM> selectList(CBCall<OauthPropertyMCB> cbLambda) {
        return facadeSelectList(createCB(cbLambda));
    }

    @Override
    protected boolean isEntityDerivedMappable() { return true; }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * PagingResultBean&lt;OauthPropertyM&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">oauthPropertyMBhv</span>.<span style="color: #CC4747">selectPage</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     *     <span style="color: #553000">cb</span>.query().addOrderBy...
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * });
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (OauthPropertyM oauthPropertyM : <span style="color: #553000">page</span>) {
     *     ... = oauthPropertyM.get...;
     * }
     * </pre>
     * @param cbLambda The callback for condition-bean of OauthPropertyM. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<OauthPropertyM> selectPage(CBCall<OauthPropertyMCB> cbLambda) {
        return facadeSelectPage(createCB(cbLambda));
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * <span style="color: #0000C0">oauthPropertyMBhv</span>.<span style="color: #CC4747">selectCursor</span>(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * }, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of OauthPropertyM. (NotNull)
     * @param entityLambda The handler of entity row of OauthPropertyM. (NotNull)
     */
    public void selectCursor(CBCall<OauthPropertyMCB> cbLambda, EntityRowHandler<OauthPropertyM> entityLambda) {
        facadeSelectCursor(createCB(cbLambda), entityLambda);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">oauthPropertyMBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<OauthPropertyMCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    /**
     * Select the next value as sequence. <br>
     * This method is called when insert() and set to primary-key automatically.
     * So you don't need to call this as long as you need to get next value before insert().
     * @return The next value. (NotNull)
     */
    public Integer selectNextVal() {
        return facadeSelectNextVal();
    }

    protected Integer facadeSelectNextVal() {
        return doSelectNextVal(Integer.class);
    }

    protected <RESULT> RESULT doSelectNextVal(Class<RESULT> tp) {
        return delegateSelectNextVal(tp);
    }

    @Override
    protected Number doReadNextVal() {
        return facadeSelectNextVal();
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * Load referrer for the list by the referrer loader.
     * <pre>
     * List&lt;Member&gt; <span style="color: #553000">memberList</span> = <span style="color: #0000C0">memberBhv</span>.selectList(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * memberBhv.<span style="color: #CC4747">load</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadPurchase</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.setupSelect...
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *         <span style="color: #553000">purchaseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(purchaseLoader -&gt; {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePayment(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//memberLoader.pulloutMemberStatus().loadMemberLogin(...)</span>
     * });
     * <span style="color: #70226C">for</span> (Member member : <span style="color: #553000">memberList</span>) {
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #CC4747">getPurchaseList()</span>;
     *     <span style="color: #70226C">for</span> (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param oauthPropertyMList The entity list of oauthPropertyM. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<OauthPropertyM> oauthPropertyMList, ReferrerLoaderHandler<LoaderOfOauthPropertyM> loaderLambda) {
        xassLRArg(oauthPropertyMList, loaderLambda);
        loaderLambda.handle(new LoaderOfOauthPropertyM().ready(oauthPropertyMList, _behaviorSelector));
    }

    /**
     * Load referrer for the entity by the referrer loader.
     * <pre>
     * Member <span style="color: #553000">member</span> = <span style="color: #0000C0">memberBhv</span>.selectEntityWithDeletedCheck(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> <span style="color: #553000">cb</span>.acceptPK(1));
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">load</span>(<span style="color: #553000">member</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadPurchase</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.setupSelect...
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *         <span style="color: #553000">purchaseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(purchaseLoader -&gt; {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePayment(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//memberLoader.pulloutMemberStatus().loadMemberLogin(...)</span>
     * });
     * List&lt;Purchase&gt; purchaseList = <span style="color: #553000">member</span>.<span style="color: #CC4747">getPurchaseList()</span>;
     * <span style="color: #70226C">for</span> (Purchase purchase : purchaseList) {
     *     ...
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param oauthPropertyM The entity of oauthPropertyM. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(OauthPropertyM oauthPropertyM, ReferrerLoaderHandler<LoaderOfOauthPropertyM> loaderLambda) {
        xassLRArg(oauthPropertyM, loaderLambda);
        loaderLambda.handle(new LoaderOfOauthPropertyM().ready(xnewLRAryLs(oauthPropertyM), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key oauthPropertyId.
     * @param oauthPropertyMList The list of oauthPropertyM. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Integer> extractOauthPropertyIdList(List<OauthPropertyM> oauthPropertyMList)
    { return helpExtractListInternally(oauthPropertyMList, "oauthPropertyId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * OauthPropertyM oauthPropertyM = <span style="color: #70226C">new</span> OauthPropertyM();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * oauthPropertyM.setFoo...(value);
     * oauthPropertyM.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//oauthPropertyM.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//oauthPropertyM.set...;</span>
     * <span style="color: #0000C0">oauthPropertyMBhv</span>.<span style="color: #CC4747">insert</span>(oauthPropertyM);
     * ... = oauthPropertyM.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param oauthPropertyM The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(OauthPropertyM oauthPropertyM) {
        doInsert(oauthPropertyM, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * OauthPropertyM oauthPropertyM = <span style="color: #70226C">new</span> OauthPropertyM();
     * oauthPropertyM.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * oauthPropertyM.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//oauthPropertyM.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//oauthPropertyM.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * oauthPropertyM.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">oauthPropertyMBhv</span>.<span style="color: #CC4747">update</span>(oauthPropertyM);
     * </pre>
     * @param oauthPropertyM The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(OauthPropertyM oauthPropertyM) {
        doUpdate(oauthPropertyM, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param oauthPropertyM The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(OauthPropertyM oauthPropertyM) {
        doInsertOrUpdate(oauthPropertyM, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * OauthPropertyM oauthPropertyM = <span style="color: #70226C">new</span> OauthPropertyM();
     * oauthPropertyM.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * oauthPropertyM.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">oauthPropertyMBhv</span>.<span style="color: #CC4747">delete</span>(oauthPropertyM);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param oauthPropertyM The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(OauthPropertyM oauthPropertyM) {
        doDelete(oauthPropertyM, null);
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <p><span style="color: #CC4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     OauthPropertyM oauthPropertyM = <span style="color: #70226C">new</span> OauthPropertyM();
     *     oauthPropertyM.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         oauthPropertyM.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     oauthPropertyMList.add(oauthPropertyM);
     * }
     * <span style="color: #0000C0">oauthPropertyMBhv</span>.<span style="color: #CC4747">batchInsert</span>(oauthPropertyMList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param oauthPropertyMList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<OauthPropertyM> oauthPropertyMList) {
        return doBatchInsert(oauthPropertyMList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     OauthPropertyM oauthPropertyM = <span style="color: #70226C">new</span> OauthPropertyM();
     *     oauthPropertyM.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         oauthPropertyM.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         oauthPropertyM.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//oauthPropertyM.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     oauthPropertyMList.add(oauthPropertyM);
     * }
     * <span style="color: #0000C0">oauthPropertyMBhv</span>.<span style="color: #CC4747">batchUpdate</span>(oauthPropertyMList);
     * </pre>
     * @param oauthPropertyMList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdate(List<OauthPropertyM> oauthPropertyMList) {
        return doBatchUpdate(oauthPropertyMList, null);
    }

    /**
     * Batch-delete the entity list. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param oauthPropertyMList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDelete(List<OauthPropertyM> oauthPropertyMList) {
        return doBatchDelete(oauthPropertyMList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">oauthPropertyMBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;OauthPropertyM, OauthPropertyMCB&gt;() {
     *     public ConditionBean setup(OauthPropertyM entity, OauthPropertyMCB intoCB) {
     *         FooCB cb = FooCB();
     *         cb.setupSelect_Bar();
     *
     *         <span style="color: #3F7E5E">// mapping</span>
     *         intoCB.specify().columnMyName().mappedFrom(cb.specify().columnFooName());
     *         intoCB.specify().columnMyCount().mappedFrom(cb.specify().columnFooCount());
     *         intoCB.specify().columnMyDate().mappedFrom(cb.specify().specifyBar().columnBarDate());
     *         entity.setMyFixedValue("foo"); <span style="color: #3F7E5E">// fixed value</span>
     *         <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     *         <span style="color: #3F7E5E">//entity.setRegisterUser(value);</span>
     *         <span style="color: #3F7E5E">//entity.set...;</span>
     *         <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     *         <span style="color: #3F7E5E">//entity.setVersionNo(value);</span>
     *
     *         return cb;
     *     }
     * });
     * </pre>
     * @param manyArgLambda The callback to set up query-insert. (NotNull)
     * @return The inserted count.
     */
    public int queryInsert(QueryInsertSetupper<OauthPropertyM, OauthPropertyMCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * OauthPropertyM oauthPropertyM = <span style="color: #70226C">new</span> OauthPropertyM();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//oauthPropertyM.setPK...(value);</span>
     * oauthPropertyM.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//oauthPropertyM.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//oauthPropertyM.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//oauthPropertyM.setVersionNo(value);</span>
     * <span style="color: #0000C0">oauthPropertyMBhv</span>.<span style="color: #CC4747">queryUpdate</span>(oauthPropertyM, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param oauthPropertyM The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cbLambda The callback for condition-bean of OauthPropertyM. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(OauthPropertyM oauthPropertyM, CBCall<OauthPropertyMCB> cbLambda) {
        return doQueryUpdate(oauthPropertyM, createCB(cbLambda), null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * <span style="color: #0000C0">oauthPropertyMBhv</span>.<span style="color: #CC4747">queryDelete</span>(oauthPropertyM, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of OauthPropertyM. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(CBCall<OauthPropertyMCB> cbLambda) {
        return doQueryDelete(createCB(cbLambda), null);
    }

    // ===================================================================================
    //                                                                      Varying Update
    //                                                                      ==============
    // -----------------------------------------------------
    //                                         Entity Update
    //                                         -------------
    /**
     * Insert the entity with varying requests. <br>
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br>
     * Other specifications are same as insert(entity).
     * <pre>
     * OauthPropertyM oauthPropertyM = <span style="color: #70226C">new</span> OauthPropertyM();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * oauthPropertyM.setFoo...(value);
     * oauthPropertyM.setBar...(value);
     * <span style="color: #0000C0">oauthPropertyMBhv</span>.<span style="color: #CC4747">varyingInsert</span>(oauthPropertyM, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = oauthPropertyM.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param oauthPropertyM The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(OauthPropertyM oauthPropertyM, WritableOptionCall<OauthPropertyMCB, InsertOption<OauthPropertyMCB>> opLambda) {
        doInsert(oauthPropertyM, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * OauthPropertyM oauthPropertyM = <span style="color: #70226C">new</span> OauthPropertyM();
     * oauthPropertyM.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * oauthPropertyM.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * oauthPropertyM.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">oauthPropertyMBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(oauthPropertyM, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param oauthPropertyM The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(OauthPropertyM oauthPropertyM, WritableOptionCall<OauthPropertyMCB, UpdateOption<OauthPropertyMCB>> opLambda) {
        doUpdate(oauthPropertyM, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param oauthPropertyM The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(OauthPropertyM oauthPropertyM, WritableOptionCall<OauthPropertyMCB, InsertOption<OauthPropertyMCB>> insertOpLambda, WritableOptionCall<OauthPropertyMCB, UpdateOption<OauthPropertyMCB>> updateOpLambda) {
        doInsertOrUpdate(oauthPropertyM, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param oauthPropertyM The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(OauthPropertyM oauthPropertyM, WritableOptionCall<OauthPropertyMCB, DeleteOption<OauthPropertyMCB>> opLambda) {
        doDelete(oauthPropertyM, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param oauthPropertyMList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<OauthPropertyM> oauthPropertyMList, WritableOptionCall<OauthPropertyMCB, InsertOption<OauthPropertyMCB>> opLambda) {
        return doBatchInsert(oauthPropertyMList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param oauthPropertyMList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<OauthPropertyM> oauthPropertyMList, WritableOptionCall<OauthPropertyMCB, UpdateOption<OauthPropertyMCB>> opLambda) {
        return doBatchUpdate(oauthPropertyMList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param oauthPropertyMList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<OauthPropertyM> oauthPropertyMList, WritableOptionCall<OauthPropertyMCB, DeleteOption<OauthPropertyMCB>> opLambda) {
        return doBatchDelete(oauthPropertyMList, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Query Update
    //                                          ------------
    /**
     * Insert the several entities by query with varying requests (modified-only for fixed value). <br>
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br>
     * Other specifications are same as queryInsert(entity, setupper).
     * @param manyArgLambda The set-upper of query-insert. (NotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The inserted count.
     */
    public int varyingQueryInsert(QueryInsertSetupper<OauthPropertyM, OauthPropertyMCB> manyArgLambda, WritableOptionCall<OauthPropertyMCB, InsertOption<OauthPropertyMCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * OauthPropertyM oauthPropertyM = <span style="color: #70226C">new</span> OauthPropertyM();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//oauthPropertyM.setPK...(value);</span>
     * oauthPropertyM.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//oauthPropertyM.setVersionNo(value);</span>
     * <span style="color: #0000C0">oauthPropertyMBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(oauthPropertyM, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param oauthPropertyM The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cbLambda The callback for condition-bean of OauthPropertyM. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(OauthPropertyM oauthPropertyM, CBCall<OauthPropertyMCB> cbLambda, WritableOptionCall<OauthPropertyMCB, UpdateOption<OauthPropertyMCB>> opLambda) {
        return doQueryUpdate(oauthPropertyM, createCB(cbLambda), createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * <pre>
     * <span style="color: #0000C0">oauthPropertyMBhv</span>.<span style="color: #CC4747">queryDelete</span>(oauthPropertyM, <span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().setFoo...
     * }, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>...
     * });
     * </pre>
     * @param cbLambda The callback for condition-bean of OauthPropertyM. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(CBCall<OauthPropertyMCB> cbLambda, WritableOptionCall<OauthPropertyMCB, DeleteOption<OauthPropertyMCB>> opLambda) {
        return doQueryDelete(createCB(cbLambda), createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * oauthPropertyMBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * oauthPropertyMBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * oauthPropertyMBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * oauthPropertyMBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * oauthPropertyMBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * oauthPropertyMBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * oauthPropertyMBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * oauthPropertyMBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * oauthPropertyMBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * oauthPropertyMBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * oauthPropertyMBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * oauthPropertyMBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * oauthPropertyMBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * oauthPropertyMBhv.outideSql().removeBlockComment().selectList()
     * oauthPropertyMBhv.outideSql().removeLineComment().selectList()
     * oauthPropertyMBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlAllFacadeExecutor<OauthPropertyMBhv> outsideSql() {
        return doOutsideSql();
    }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends OauthPropertyM> typeOfSelectedEntity() { return OauthPropertyM.class; }
    protected Class<OauthPropertyM> typeOfHandlingEntity() { return OauthPropertyM.class; }
    protected Class<OauthPropertyMCB> typeOfHandlingConditionBean() { return OauthPropertyMCB.class; }
}
