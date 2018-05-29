package com.olympus.aptx4869.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.olympus.aptx4869.dbflute.exbhv.MoneyReceptionBhv;
import com.olympus.aptx4869.dbflute.exentity.MoneyReception;
import com.olympus.aptx4869.dto.MoneyReceptionCreateDto;

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
	LoggerService loggerService;


	/**
	 * イベントテーブルの登録処理を行う。
	 *
	 * @param dto 登録情報
	 * @return entity DB登録したentity
	 */
	public MoneyReception insert(MoneyReceptionCreateDto dto) {
	    MoneyReception MoneyReceptionEntity = new MoneyReception();
		// 次のイベントIDを取得する。
		//Integer moneyReceptionId = moneyReceptionBhv.selectNextVal();

		// 入力情報をDBに挿入する。
		BeanUtils.copyProperties(dto, MoneyReceptionEntity);
		//MoneyReceptionEntity.setMoneyReceptionId(moneyReceptionId);

		moneyReceptionBhv.insert(MoneyReceptionEntity);

		return MoneyReceptionEntity;
	}





}
