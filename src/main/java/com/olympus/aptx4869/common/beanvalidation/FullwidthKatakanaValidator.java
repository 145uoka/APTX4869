/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olympus.aptx4869.common.beanvalidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang3.StringUtils;

import com.olympus.aptx4869.common.util.ValidateUtil;

/**
 * 全角カタカナチェック
 * @author kitabayashi_y
 */
public class FullwidthKatakanaValidator implements ConstraintValidator<FullwidthKatakana, CharSequence> {

	@Override
	public void initialize(FullwidthKatakana annotation) {
	}

	@Override
	public boolean isValid(CharSequence charSequence, ConstraintValidatorContext constraintValidatorContext) {
		if (StringUtils.isEmpty(charSequence)) {
			return true;
		}

		return ValidateUtil.isFullwidthKatakana(charSequence);
	}
}
