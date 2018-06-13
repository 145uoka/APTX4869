package com.olympus.aptx4869.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.optional.OptionalEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olympus.aptx4869.constants.SystemCodeConstants.SettlementDate;
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

	Logger logger = LoggerFactory.getLogger(this.getClass());

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
	public List<AmountDto> getAmound(int userId, int year, int month, SettlementDate settlementDate, boolean flag){

			//締め日
			LocalDate  toDate = getLastOfMonth(year, month, settlementDate);

			//集計開始日
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

	/**
	 * 対象年月の締め日を取得。
	 * <p>
	 * @param year 対象年
	 * @param month 月
	 * @param settlementDate 締め日
	 * @return 対象年月の締め日
	 */
	public LocalDate getLastOfMonth(int year, int month, SettlementDate settlementDate) {

		logger.debug("SettlementDate : " + settlementDate.getValue());

	    LocalDate date = null;

	    if (settlementDate == SettlementDate.LAST_OF_MONTH) {
	        date = LocalDate.of(year,month + 1, 1);
	        date.minusDays(1);
        } else {
            date = LocalDate.of(year,month, settlementDate.getValue());
        }
	    return date;
	}


}
