package com.olympus.aptx4869.service;

import java.util.ArrayList;
import java.util.List;

import org.dbflute.cbean.result.ListResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.olympus.aptx4869.dbflute.exbhv.GenreBhv;
import com.olympus.aptx4869.dbflute.exentity.Genre;
import com.olympus.aptx4869.dto.LabelValueDto;

/**
 * ジャンルテーブルのサービスクラス。
 *
 * @author hasegawa_m
 *
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class GenreService {

	@Autowired
	GenreBhv genreBhv;

	/**
	 * ジャンルプルダウンを生成する。
     *
     * @param hasBrank 判定
	 * @param firstmessage 最初の文言
	 * @return dtoのリスト
	 */
	public List<LabelValueDto> createSelectGenreList(boolean hasBrank, String firstmessage) {
		List<LabelValueDto> dtoList = new ArrayList<LabelValueDto>();
		LabelValueDto dto;

		if (hasBrank) {
			//プルダウンの最初のメッセージをセット。
			dto = new LabelValueDto();
			dto.setValue("");
			dto.setLabel(firstmessage);
			dtoList.add(dto);
		}

		ListResultBean<Genre> findGenreList = genreBhv.selectList(cb -> {
			//deleteflagがfalseであるレコードをSELECT。
			cb.query().setDeleteFlag_Equal(false);
		});
		for (Genre genre : findGenreList) {
			//SELECT結果をすべて取り出し、ラベルと値をセット。
			dto = new LabelValueDto();
			dto.setLabel(genre.getGenreName());
			dto.setValue(genre.getGenreId());
			dtoList.add(dto);
		}
		return dtoList;
	}


}
