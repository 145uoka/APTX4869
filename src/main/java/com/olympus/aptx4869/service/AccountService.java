package com.olympus.aptx4869.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.olympus.aptx4869.dto.SettlementDate;
/**
 * @author tokuno_a
 *アカウントで使用するサービスクラス
 */
@Service
public class AccountService {

	public List<SettlementDate> settlementDate (){
	List<SettlementDate> settlementDateList = new ArrayList<SettlementDate>();
	SettlementDate settlementDate = new SettlementDate();
	settlementDate.setLabel("締め日を選択してください");
	settlementDateList.add(settlementDate);
	settlementDateList.add(new SettlementDate("10日", 10));
	settlementDateList.add(new SettlementDate("15日", 15));
	settlementDateList.add(new SettlementDate("20日", 20));
	settlementDateList.add(new SettlementDate("25日", 25));
	settlementDateList.add(new SettlementDate("月末", 100));
	return settlementDateList;
	}
}
