package com.olympus.aptx4869.service;

import org.dbflute.optional.OptionalEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olympus.aptx4869.dbflute.exbhv.GenreBhv;
import com.olympus.aptx4869.dbflute.exbhv.MoneyReceptionBhv;
import com.olympus.aptx4869.dbflute.exbhv.UserMBhv;
import com.olympus.aptx4869.dbflute.exentity.UserM;
import com.olympus.aptx4869.dto.UserDto;

@Service
public class GraphService {
	@Autowired
	MoneyReceptionBhv moneyReceptionBhv;
	@Autowired
	GenreBhv genreBhv;
	@Autowired
	UserMBhv userBhv;



	/**
	 * データベースから決算日取得
	 *
	 * @return 決算を返却
	 */
	public UserDto findSettlementDate(Integer userId) {

		OptionalEntity<UserM> user = userBhv.selectEntity(cb -> {
			cb.query().setUserId_Equal(userId);
			cb.query().setDeleteFlag_Equal(false);
		});

		if (!user.isPresent()) {
			return null;
		}

		UserDto userDto = new UserDto();
		UserM userEntity = user.get();

		BeanUtils.copyProperties(userEntity, userDto);
		return userDto;
	}
}
