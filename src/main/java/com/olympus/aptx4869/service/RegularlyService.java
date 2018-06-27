package com.olympus.aptx4869.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.dbflute.cbean.result.ListResultBean;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olympus.aptx4869.constants.SystemCodeConstants;
import com.olympus.aptx4869.constants.SystemCodeConstants.MoneyReceptionFlag;
import com.olympus.aptx4869.constants.SystemCodeConstants.RegularlyMoney;
import com.olympus.aptx4869.dbflute.exbhv.RegularlyDataBhv;
import com.olympus.aptx4869.dbflute.exentity.RegularlyData;
import com.olympus.aptx4869.dto.RegularlyDto;
import com.olympus.aptx4869.form.RegularlyForm;
@Service
public class RegularlyService {

	@Autowired
	RegularlyDataBhv regularlyDataBhv;

	public List<AccountingDate> accountingDate (){
		List<AccountingDate> accountingDateList = new ArrayList<AccountingDate>();
		AccountingDate accountingDate = new AccountingDate();
		accountingDate.setLabel("定期支出日を選択してください");
		accountingDateList.add(accountingDate);

		for(SystemCodeConstants.SettlementDate settlementDateEnum : SystemCodeConstants.SettlementDate.values()) {
			accountingDateList.add(new AccountingDate(settlementDateEnum.getLabel(), settlementDateEnum.getValue()));
		}
		return accountingDateList;
	}

	public List<RegularlyDto> convertRegularly(RegularlyForm form){
		List<RegularlyDto> dtoList = new ArrayList<RegularlyDto>();
		for(int i = 0; i < RegularlyMoney.REGULARLY_MONEY_RECORD; i++){
			if(form.getAccountingDate()[i].equals("0") && StringUtils.isEmpty(form.getAmount()[i])){
				//項目と金額が未入力であれば、スキップ。
				continue;
			}
			RegularlyDto regularlyDto = new RegularlyDto();
			regularlyDto.setUserId(Integer.parseInt(form.getUserId()));
			regularlyDto.setAccountingdate(Integer.parseInt(form.getAccountingDate()[i]));
			regularlyDto.setAmount(Integer.parseInt(form.getAmount()[i]));

			if(i < RegularlyMoney.SPENDING_RECORD){
				regularlyDto.setRegularlyFlag(MoneyReceptionFlag.EXPENSE.getValue());  //支出：false
			}else{
				regularlyDto.setRegularlyFlag(MoneyReceptionFlag.INCOME.getValue());  //収入：true
			}
			dtoList.add(regularlyDto);
		}
		return dtoList;
	}


	public List<RegularlyData> register(List<RegularlyDto> dtoList) {
		List<RegularlyData> entityList = new ArrayList<RegularlyData>();
		for(RegularlyDto dto : dtoList){
			RegularlyData RegularlyDataEntity = new RegularlyData();
			// 次の金銭授受IDを取得する。
			Integer propertyId = regularlyDataBhv.selectNextVal();
			// entityにdtoの値をセット。
			BeanUtils.copyProperties(dto, RegularlyDataEntity);
			RegularlyDataEntity.setPropertyId(propertyId);
			entityList.add(RegularlyDataEntity);
		}
		regularlyDataBhv.batchInsert(entityList);
		return entityList;
	}

	public List<RegularlyDto> findRegularly(Integer userId){
		ListResultBean<RegularlyData> regularyList = regularlyDataBhv.selectList(cb -> {
			cb.query().setUserId_Equal(userId);
			cb.query().setDeleteFlag_Equal(false);
			cb.query().addOrderBy_RegularlyFlag_Asc();
			cb.query().addOrderBy_Accountingdate_Asc();

		});
		List<RegularlyDto> regularlyDtoList = new ArrayList<RegularlyDto>();
		for (RegularlyData regularlyData : regularyList) {
			RegularlyDto regularlyDto = new RegularlyDto();
			BeanUtils.copyProperties(regularlyData, regularlyDto);
			regularlyDtoList.add(regularlyDto);
		}

		return regularlyDtoList;
	}


	public void logicalDeleteRegularly(Integer propertyId) {
		RegularlyData regularlyData = new RegularlyData();
		// 更新内容の設定
		regularlyData.setDeleteFlag(true);

		regularlyDataBhv.queryUpdate(regularlyData, cb -> {
			cb.query().setPropertyId_Equal(propertyId);
			cb.query().setDeleteFlag_Equal(false);
		});

	}

}

