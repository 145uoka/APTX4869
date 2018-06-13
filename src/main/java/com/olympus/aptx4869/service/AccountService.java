package com.olympus.aptx4869.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.olympus.aptx4869.constants.SystemCodeConstants;
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

	for(SystemCodeConstants.SettlementDate settlementDateEnum : SystemCodeConstants.SettlementDate.values()) {
		settlementDateList.add(new SettlementDate(settlementDateEnum.getLabel(), settlementDateEnum.getValue()));
    }

	return settlementDateList;
	}
}
