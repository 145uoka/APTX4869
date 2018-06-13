package com.olympus.aptx4869.service;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.optional.OptionalEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olympus.aptx4869.dbflute.exbhv.GenreBhv;
import com.olympus.aptx4869.dbflute.exbhv.MoneyReceptionBhv;
import com.olympus.aptx4869.dbflute.exbhv.UserPropertyBhv;
import com.olympus.aptx4869.dbflute.exbhv.pmbean.SumAmountPmb;
import com.olympus.aptx4869.dbflute.exentity.UserProperty;
import com.olympus.aptx4869.dbflute.exentity.customize.SumAmount;
import com.olympus.aptx4869.dto.AmountDto;
import com.olympus.aptx4869.dto.UserPropertyDto;

/**
 * @author tokuno_a
 *グラフ
 */
@Service
public class GraphService {
	@Autowired
	MoneyReceptionBhv moneyReceptionBhv;
	@Autowired
	GenreBhv genreBhv;
	@Autowired
	UserPropertyBhv userPropertyBhv;



	/**
	 * データベースから締め日取得
	 * @param userId ユーザーID
	 *
	 * @return 締め日を返却
	 */
	public UserPropertyDto findSettlementDate(Integer userId) {

		OptionalEntity<UserProperty> user = userPropertyBhv.selectEntity(cb -> {
			cb.query().setUserId_Equal(userId);
			cb.query().setDeleteFlag_Equal(false);
		});

		if (!user.isPresent()) {
			return null;
		}
		UserPropertyDto userPropertyDto = new UserPropertyDto();
		UserProperty userEntity = user.get();
		BeanUtils.copyProperties(userEntity, userPropertyDto);
		return userPropertyDto;
	}

	/**
	 * 該当月の収支取得
	 * @param userId ユーザーID
	 * @param settlementDate 締め日
	 * @param flag trueは収入、falseは支出
	 * @return 収支データー
	 */
	public List<AmountDto> getAmound(int userId, int settlementDate, boolean flag){
			// 現在日付
			LocalDate today = LocalDate.now();
			LocalDate  toDate = null;
			//締め日
			if(settlementDate == 100){
				toDate = today.with(TemporalAdjusters.lastDayOfMonth());
			}else{
				toDate = LocalDate.of(today.getYear(), today.getMonthValue(), settlementDate);
			}
			if(today.isAfter(toDate)){
				toDate = toDate.plusMonths(1);
			}
			//締め日の翌日
			LocalDate  fromDate = toDate.minusMonths(1).plusDays(1);
			//外だしSQL
			SumAmountPmb pmb = new SumAmountPmb();
			pmb.setUserId(userId);
			pmb.setMoneyReceptionFromDate(fromDate);
			pmb.setMoneyReceptionToDate(toDate);
			pmb.setMoneyReceptionFlag(flag);
			ListResultBean<SumAmount> amountList = moneyReceptionBhv.outsideSql().selectList(pmb);

			// AmountDtoにset
			List<AmountDto> amountDtoList = new ArrayList<AmountDto>();
			for (int i = 0; i < amountList.size(); i++) {
				AmountDto amountDto = new AmountDto();
				amountDto.setGenreName(amountList.get(i).getGenreName());
				amountDto.setSum(amountList.get(i).getSum());
				amountDtoList.add(amountDto);
			}
			return amountDtoList;
	}


}
