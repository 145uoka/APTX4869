package com.olympus.aptx4869.service;

import java.util.ArrayList;

import org.apache.commons.codec.binary.StringUtils;
import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.optional.OptionalEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olympus.aptx4869.constants.SystemCodeConstants.Flag;
import com.olympus.aptx4869.dbflute.exbhv.PropertyMBhv;
import com.olympus.aptx4869.dbflute.exentity.PropertyM;
import com.olympus.aptx4869.dto.PropertyDto;
import com.olympus.aptx4869.exception.NotFoundRecordException;

@Service
public class PropertyService {

    @Autowired
    PropertyMBhv propertyMBhv;

    public PropertyDto findProperty(String propName) {

        OptionalEntity<PropertyM> optionalEntity = propertyMBhv.selectEntity(cb->{
            cb.query().setPropName_Equal(propName);
            cb.query().setDeleteFlag_Equal(Flag.OFF.isBoolValue());
        });

        if (optionalEntity.isPresent()) {
            PropertyDto propertyDto = new PropertyDto();
            BeanUtils.copyProperties(optionalEntity.get(), propertyDto);
            return propertyDto;
        }
        return null;
    }

    public ArrayList<PropertyDto> findPropertyGroup(String groupName) {

        ListResultBean<PropertyM> propertyMList = propertyMBhv.selectList(cb->{
            cb.query().setPropGroupName_Equal(groupName);
            cb.query().setDeleteFlag_Equal(Flag.OFF.isBoolValue());
        });

        ArrayList<PropertyDto> propertyDtoList = new ArrayList<PropertyDto>();

        for (PropertyM propertyM : propertyMList) {
            PropertyDto propertyDto = new PropertyDto();
            BeanUtils.copyProperties(propertyM, propertyDto);
            propertyDtoList.add(propertyDto);
        }
        return propertyDtoList;
    }

    public PropertyDto getPropertyDtoForGroup(ArrayList<PropertyDto> propertyDtoList, String propName) {

        for (PropertyDto propertyDto : propertyDtoList) {
            if (StringUtils.equals(propertyDto.getPropName(), propName)) {
                return propertyDto;
            }
        }
        return null;
    }

    public String getPropValueForGroup(ArrayList<PropertyDto> propertyDtoList, String propName, boolean isRequired)
            throws NotFoundRecordException {

        for (PropertyDto propertyDto : propertyDtoList) {
            if (StringUtils.equals(propertyDto.getPropName(), propName)) {
                return propertyDto.getPropVal();
            }
        }

        if (isRequired) {
            throw new NotFoundRecordException("プロパティ_M", propName);
        }

        return null;
    }

}
