package com.olympus.aptx4869.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.olympus.aptx4869.dbflute.exentity.customize.*;

/**
 * The entity of SumAmount. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     genre_name, sum
 *
 * [sequence]
 *     
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
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String genreName = entity.getGenreName();
 * Long sum = entity.getSum();
 * entity.setGenreName(genreName);
 * entity.setSum(sum);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSumAmount extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** genre_name: {text(2147483647), refers to genre.genre_name} */
    protected String _genreName;

    /** sum: {int8(19)} */
    protected Long _sum;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.olympus.aptx4869.dbflute.bsentity.customize.dbmeta.SumAmountDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SumAmount";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        return false;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsSumAmount) {
            BsSumAmount other = (BsSumAmount)obj;
            if (!xSV(_genreName, other._genreName)) { return false; }
            if (!xSV(_sum, other._sum)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _genreName);
        hs = xCH(hs, _sum);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_genreName));
        sb.append(dm).append(xfND(_sum));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public SumAmount clone() {
        return (SumAmount)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] genre_name: {text(2147483647), refers to genre.genre_name} <br>
     * @return The value of the column 'genre_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getGenreName() {
        checkSpecifiedProperty("genreName");
        return _genreName;
    }

    /**
     * [set] genre_name: {text(2147483647), refers to genre.genre_name} <br>
     * @param genreName The value of the column 'genre_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGenreName(String genreName) {
        registerModifiedProperty("genreName");
        _genreName = genreName;
    }

    /**
     * [get] sum: {int8(19)} <br>
     * @return The value of the column 'sum'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSum() {
        checkSpecifiedProperty("sum");
        return _sum;
    }

    /**
     * [set] sum: {int8(19)} <br>
     * @param sum The value of the column 'sum'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSum(Long sum) {
        registerModifiedProperty("sum");
        _sum = sum;
    }
}
