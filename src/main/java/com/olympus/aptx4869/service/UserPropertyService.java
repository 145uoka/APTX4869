package com.olympus.aptx4869.service;

import org.dbflute.optional.OptionalEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.olympus.aptx4869.dbflute.exbhv.UserPropertyBhv;
import com.olympus.aptx4869.dbflute.exentity.UserProperty;
import com.olympus.aptx4869.dto.UserPropertyDto;



/**
 * @author tokuno_a
 *ユーザープロパティのサービス
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserPropertyService {
	@Autowired
	UserPropertyBhv userPropertyBhv;


	/**
	 * フォームの情報をイベントテーブルに登録
	 *
	 * @param eventDto
	 *            フォームに入力されたエンティティ
	 * @return 登録した情報
	 */
	public void registerUserProperty(UserPropertyDto userPropertyDto) {

		OptionalEntity<UserProperty> optUserProperty = userPropertyBhv.selectEntity(cb->{
			cb.query().setUserId_Equal(userPropertyDto.getUserId());
		});


		UserProperty userProperty = new UserProperty();

		if (optUserProperty.isPresent()) {
			userProperty = optUserProperty.get();
		}

		BeanUtils.copyProperties(userPropertyDto, userProperty);

		userPropertyBhv.insertOrUpdate(userProperty);
	}



}
