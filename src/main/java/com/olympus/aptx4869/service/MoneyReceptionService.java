package com.olympus.aptx4869.service;

import org.dbflute.optional.OptionalEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.olympus.aptx4869.constants.LogMessageKeyConstants;
import com.olympus.aptx4869.dbflute.exbhv.MoneyReceptionBhv;
import com.olympus.aptx4869.dbflute.exbhv.UserMBhv;
import com.olympus.aptx4869.dbflute.exentity.MoneyReception;
import com.olympus.aptx4869.dbflute.exentity.UserM;
import com.olympus.aptx4869.dto.MoneyReceptionDto;
import com.olympus.aptx4869.exception.NotFoundRecordException;

/**
 * イベントテーブルのサービスクラス。
 *
 * @author hasegawa_m
 *
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class MoneyReceptionService {

	@Autowired
	MoneyReceptionBhv moneyReceptionBhv;

    @Autowired
    UserMBhv userMBhv;

	@Autowired
	LoggerService loggerService;


	 /**
     * ユーザーマスタからユーザーIDで検索をする．
     *
     * @param userId ユーザーID
     * @return userMEntity
     */
    public OptionalEntity<UserM> findUserMEntity(Integer userId) {
        OptionalEntity<UserM> userMEntity = userMBhv.selectEntity(cb ->{
            cb.query().setUserId_Equal(userId);
            cb.query().setDeleteFlag_Equal(false);
        });
        return userMEntity;
    }

    /**
     * 金銭授受_Tから金銭授受IDで検索をする．
     *
     * @param moneyReceptionId 金銭授受ID
     * @return userMEntity
     */
    public OptionalEntity<MoneyReception> findMoneyReceptionEntity(Long moneyReceptionId) {
        OptionalEntity<MoneyReception> moneyReceptionEntity = moneyReceptionBhv.selectEntity(cb ->{
            cb.query().setMoneyReceptionId_Equal(moneyReceptionId);
            cb.query().setDeleteFlag_Equal(false);
        });
        return moneyReceptionEntity;
    }

	/**
	 * 金銭授受_Tの登録処理を行う。
	 *
	 * @param dto 登録情報
	 * @return MoneyReceptionEntity
	 */
	public MoneyReception store(MoneyReceptionDto dto) {

	    MoneyReception MoneyReceptionEntity = new MoneyReception();
		// 次の金銭授受IDを取得する。
		Long moneyReceptionId = moneyReceptionBhv.selectNextVal();

		// 入力情報をDBに挿入する。
		BeanUtils.copyProperties(dto, MoneyReceptionEntity);
		MoneyReceptionEntity.setMoneyReceptionId(moneyReceptionId);

		moneyReceptionBhv.insert(MoneyReceptionEntity);

		return MoneyReceptionEntity;
	}

	/**
	 * 金銭授受_Tの更新処理を行う。
	 *
	 * @param dto 更新情報
	 * @return MoneyReceptionEntity
	 * @throws NotFoundRecordException レコード取得エラー
	 */
	public MoneyReception update(MoneyReceptionDto dto) throws NotFoundRecordException{

	    // 金銭授受_Tから金銭授受IDでSELECT.
	    OptionalEntity<MoneyReception> moneyReceptionEntity =  findMoneyReceptionEntity(dto.getMoneyReceptionId());

	    if(!moneyReceptionEntity.isPresent()){
	        //対象レコードが存在しなければ、エラー画面へ
	        loggerService.outLog(LogMessageKeyConstants.Warn.W_99_0001, new Object[]{"金銭授受_T", dto.getMoneyReceptionId()});
            throw new NotFoundRecordException();
	    }

	    // 金銭授受_Tのentity取得
	    MoneyReception entity = moneyReceptionEntity.get();

	    // 入力情報をentityにセットする。
	    BeanUtils.copyProperties(dto, entity);

	    // 金銭授受_Tを更新する。
	    moneyReceptionBhv.update(entity);

	    return entity;
	}

	/**
	 * 金銭授受_Tの削除処理（論理削除）を行う。
	 *
	 * @param moneyReceptionId 金銭授受ID
	 * @return MoneyReceptionEntity
	 * @throws NotFoundRecordException レコード取得エラー
	 */
	public MoneyReception delete(Long moneyReceptionId) throws NotFoundRecordException{

	 // 金銭授受_Tから金銭授受IDでSELECT.
        OptionalEntity<MoneyReception> moneyReceptionEntity =  findMoneyReceptionEntity(moneyReceptionId);

        if(!moneyReceptionEntity.isPresent()){
            //対象レコードが存在しなければ、エラー画面へ
            loggerService.outLog(LogMessageKeyConstants.Warn.W_99_0001, new Object[]{"金銭授受_T", moneyReceptionId});
            throw new NotFoundRecordException();
        }

        // 金銭授受_Tのentity取得
        MoneyReception entity = moneyReceptionEntity.get();

        //deleteFlagにtrueをセットして更新。
        entity.setDeleteFlag(true);
        moneyReceptionBhv.update(entity);

        return entity;
    }

}
