package com.olympus.aptx4869.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.olympus.aptx4869.dbflute.allcommon.EntityDefinedCommonColumn;
import com.olympus.aptx4869.dbflute.allcommon.DBMetaInstanceHandler;
import com.olympus.aptx4869.dbflute.exentity.*;

/**
 * The entity of genre as TABLE. <br>
 * <pre>
 * [primary-key]
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
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer genreId = entity.getGenreId();
 * String genreName = entity.getGenreName();
 * Boolean balanceFlg = entity.getBalanceFlg();
 * Boolean deleteFlag = entity.getDeleteFlag();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * entity.setGenreId(genreId);
 * entity.setGenreName(genreName);
 * entity.setBalanceFlg(balanceFlg);
 * entity.setDeleteFlag(deleteFlag);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setUpdateDatetime(updateDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsGenre extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** genre_id: {PK, ID, NotNull, serial(10)} */
    protected Integer _genreId;

    /** genre_name: {NotNull, text(2147483647)} */
    protected String _genreName;

    /** balance_flg: {NotNull, bool(1)} */
    protected Boolean _balanceFlg;

    /** (削除フラグ)delete_flag: {NotNull, bool(1), default=[false]} */
    protected Boolean _deleteFlag;

    /** (登録日時)register_datetime: {NotNull, timestamp(26, 3), default=[now()]} */
    protected java.time.LocalDateTime _registerDatetime;

    /** (更新日時)update_datetime: {timestamp(26, 3)} */
    protected java.time.LocalDateTime _updateDatetime;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "genre";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_genreId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** money_reception by genre_id, named 'moneyReceptionList'. */
    protected List<MoneyReception> _moneyReceptionList;

    /**
     * [get] money_reception by genre_id, named 'moneyReceptionList'.
     * @return The entity list of referrer property 'moneyReceptionList'. (NotNull: even if no loading, returns empty list)
     */
    public List<MoneyReception> getMoneyReceptionList() {
        if (_moneyReceptionList == null) { _moneyReceptionList = newReferrerList(); }
        return _moneyReceptionList;
    }

    /**
     * [set] money_reception by genre_id, named 'moneyReceptionList'.
     * @param moneyReceptionList The entity list of referrer property 'moneyReceptionList'. (NullAllowed)
     */
    public void setMoneyReceptionList(List<MoneyReception> moneyReceptionList) {
        _moneyReceptionList = moneyReceptionList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsGenre) {
            BsGenre other = (BsGenre)obj;
            if (!xSV(_genreId, other._genreId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _genreId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_moneyReceptionList != null) { for (MoneyReception et : _moneyReceptionList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "moneyReceptionList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_genreId));
        sb.append(dm).append(xfND(_genreName));
        sb.append(dm).append(xfND(_balanceFlg));
        sb.append(dm).append(xfND(_deleteFlag));
        sb.append(dm).append(xfND(_registerDatetime));
        sb.append(dm).append(xfND(_updateDatetime));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_moneyReceptionList != null && !_moneyReceptionList.isEmpty())
        { sb.append(dm).append("moneyReceptionList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Genre clone() {
        return (Genre)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] genre_id: {PK, ID, NotNull, serial(10)} <br>
     * @return The value of the column 'genre_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getGenreId() {
        checkSpecifiedProperty("genreId");
        return _genreId;
    }

    /**
     * [set] genre_id: {PK, ID, NotNull, serial(10)} <br>
     * @param genreId The value of the column 'genre_id'. (basically NotNull if update: for the constraint)
     */
    public void setGenreId(Integer genreId) {
        registerModifiedProperty("genreId");
        _genreId = genreId;
    }

    /**
     * [get] genre_name: {NotNull, text(2147483647)} <br>
     * @return The value of the column 'genre_name'. (basically NotNull if selected: for the constraint)
     */
    public String getGenreName() {
        checkSpecifiedProperty("genreName");
        return _genreName;
    }

    /**
     * [set] genre_name: {NotNull, text(2147483647)} <br>
     * @param genreName The value of the column 'genre_name'. (basically NotNull if update: for the constraint)
     */
    public void setGenreName(String genreName) {
        registerModifiedProperty("genreName");
        _genreName = genreName;
    }

    /**
     * [get] balance_flg: {NotNull, bool(1)} <br>
     * @return The value of the column 'balance_flg'. (basically NotNull if selected: for the constraint)
     */
    public Boolean getBalanceFlg() {
        checkSpecifiedProperty("balanceFlg");
        return _balanceFlg;
    }

    /**
     * [set] balance_flg: {NotNull, bool(1)} <br>
     * @param balanceFlg The value of the column 'balance_flg'. (basically NotNull if update: for the constraint)
     */
    public void setBalanceFlg(Boolean balanceFlg) {
        registerModifiedProperty("balanceFlg");
        _balanceFlg = balanceFlg;
    }

    /**
     * [get] (削除フラグ)delete_flag: {NotNull, bool(1), default=[false]} <br>
     * @return The value of the column 'delete_flag'. (basically NotNull if selected: for the constraint)
     */
    public Boolean getDeleteFlag() {
        checkSpecifiedProperty("deleteFlag");
        return _deleteFlag;
    }

    /**
     * [set] (削除フラグ)delete_flag: {NotNull, bool(1), default=[false]} <br>
     * @param deleteFlag The value of the column 'delete_flag'. (basically NotNull if update: for the constraint)
     */
    public void setDeleteFlag(Boolean deleteFlag) {
        registerModifiedProperty("deleteFlag");
        _deleteFlag = deleteFlag;
    }

    /**
     * [get] (登録日時)register_datetime: {NotNull, timestamp(26, 3), default=[now()]} <br>
     * @return The value of the column 'register_datetime'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] (登録日時)register_datetime: {NotNull, timestamp(26, 3), default=[now()]} <br>
     * @param registerDatetime The value of the column 'register_datetime'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterDatetime(java.time.LocalDateTime registerDatetime) {
        registerModifiedProperty("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] (更新日時)update_datetime: {timestamp(26, 3)} <br>
     * @return The value of the column 'update_datetime'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getUpdateDatetime() {
        checkSpecifiedProperty("updateDatetime");
        return _updateDatetime;
    }

    /**
     * [set] (更新日時)update_datetime: {timestamp(26, 3)} <br>
     * @param updateDatetime The value of the column 'update_datetime'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdateDatetime(java.time.LocalDateTime updateDatetime) {
        registerModifiedProperty("updateDatetime");
        _updateDatetime = updateDatetime;
    }
}
