package com.olympus.aptx4869.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.optional.OptionalEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

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
     * ユーザーマスタからラインIDで検索をする．
     *
     * @param lineId ラインID
     * @return userMEntity
     */
    public OptionalEntity<UserM> findUserMEntity(String lineId) {
        OptionalEntity<UserM> userMEntity = userMBhv.selectEntity(cb ->{
            cb.query().setLineId_Equal(lineId);
            cb.query().setDeleteFlag_Equal(false);
        });
        return userMEntity;
    }

    /**
     * 金銭授受_TからユーザーIDと日付で検索をする．
     *
     * @param userId ユーザーID
     * @param moneyReceptionDate 日付
     * @return moneyReceptionEntityList
     */
    public ListResultBean<MoneyReception> findMoneyReceptionEntityList(Integer userId, LocalDate moneyReceptionDate) {
        ListResultBean<MoneyReception> moneyReceptionEntityList = moneyReceptionBhv.selectList(cb ->{
            cb.query().setUserId_Equal(userId);
            cb.query().setMoneyReceptionDate_Equal(moneyReceptionDate);
            cb.query().setDeleteFlag_Equal(false);
        });
        return moneyReceptionEntityList;
    }


	/**
	 * 金銭授受_Tの登録処理を行う。(API用：１件のみ)
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

		if(MoneyReceptionEntity.getMoneyReceptionDate() == null){
		    MoneyReceptionEntity.setMoneyReceptionDate(LocalDate.now());
		}

		moneyReceptionBhv.insert(MoneyReceptionEntity);

		return MoneyReceptionEntity;
	}

	/**
     * 金銭授受_Tの登録処理を行う。（アプリ用：複数件）
     *
     * @param dtoList 登録情報
     * @return MoneyReceptionEntityのリスト
     */
    public List<MoneyReception> storeList( List<MoneyReceptionDto> dtoList) {

        List<MoneyReception> moneyReceptionEntityList = new ArrayList<MoneyReception>();

        for(MoneyReceptionDto dto : dtoList){

        MoneyReception MoneyReceptionEntity = new MoneyReception();
        // 次の金銭授受IDを取得する。
        Long moneyReceptionId = moneyReceptionBhv.selectNextVal();

        // entityにdtoの値をセット。
        BeanUtils.copyProperties(dto, MoneyReceptionEntity);
        MoneyReceptionEntity.setMoneyReceptionId(moneyReceptionId);

        moneyReceptionEntityList.add(MoneyReceptionEntity);

        }

        moneyReceptionBhv.batchInsert(moneyReceptionEntityList);

        return moneyReceptionEntityList;
    }


    /**
     * 金銭授受_Tの更新処理を行う。
     *
     * @param dtoList 更新情報
     * @return moneyReceptionEntityList
     * @throws NotFoundRecordException レコード取得エラー
     */
    public List<MoneyReception> updateList(List<MoneyReceptionDto> dtoList) throws NotFoundRecordException{

        // 金銭授受_Tから対象のレコードをSELECT。
        ListResultBean<MoneyReception> moneyReceptionSelectEntityList =
                findMoneyReceptionEntityList(dtoList.get(0).getUserId(), dtoList.get(0).getMoneyReceptionDate());

        if(CollectionUtils.isEmpty(moneyReceptionSelectEntityList)){
            //対象レコードが存在しなければ、エラー画面へ
            loggerService.outLog(LogMessageKeyConstants.Warn.W_99_0002, new Object[]{"金銭授受_T"});
            throw new NotFoundRecordException();
        }

        //レコード削除
        moneyReceptionBhv.batchDelete(moneyReceptionSelectEntityList);

        List<MoneyReception> moneyReceptionEntityList = new ArrayList<MoneyReception>();

        for(MoneyReceptionDto dto : dtoList){

            MoneyReception MoneyReceptionEntity = new MoneyReception();
            // 次の金銭授受IDを取得する。
            Long moneyReceptionId = moneyReceptionBhv.selectNextVal();
            // entityにdtoの値をセット。
            BeanUtils.copyProperties(dto, MoneyReceptionEntity);
            MoneyReceptionEntity.setMoneyReceptionId(moneyReceptionId);

            moneyReceptionEntityList.add(MoneyReceptionEntity);

        }

        //新しいレコードを登録
        moneyReceptionBhv.batchInsert(moneyReceptionEntityList);

        return moneyReceptionEntityList;
    }

}
