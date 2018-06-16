package com.olympus.aptx4869.service;

import org.dbflute.optional.OptionalEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.olympus.aptx4869.dbflute.exbhv.UserMBhv;
import com.olympus.aptx4869.dbflute.exentity.UserM;

/**
 * ユーザーマスタのサービスクラス。
 *
 * @author hasegawa_m
 *
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserService {

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

}