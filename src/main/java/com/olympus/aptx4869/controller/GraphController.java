package com.olympus.aptx4869.controller;

import java.time.LocalDate;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.olympus.aptx4869.constants.SystemCodeConstants.SettlementDate;
import com.olympus.aptx4869.dbflute.exbhv.MoneyReceptionBhv;
import com.olympus.aptx4869.dto.AmountDto;
import com.olympus.aptx4869.dto.GraphDto;
import com.olympus.aptx4869.dto.UserDto;
import com.olympus.aptx4869.form.GraphForm;
import com.olympus.aptx4869.service.GraphService;

/**
 * グラフ画面のコントローラー
 * @author tokuno_a
 *
 */
@Controller
public class GraphController {
	@Autowired
	GraphService graphService;
	@Autowired
	MoneyReceptionBhv moneyReceptionBhv;

	 Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 *グラフ画面表示メソッド
	 * @param model 画面
	 * @param paramUserId 画面ユーザーID
	 * @return グラフ画面
	 * @throws JsonProcessingException jsonエラー
	 */
	@RequestMapping(value = "/graph/{paramUserId}", method = {RequestMethod.GET})
	public String graph(@PathVariable String paramUserId, GraphForm form, BindingResult bindingResult, Model model)
	        throws JsonProcessingException{

		int userId = Integer.parseInt(paramUserId);
		//ユーザーMテーブルから締め日取出し
		UserDto userDto = graphService.findSettlementDate(userId);

		SettlementDate settlementDate = SettlementDate.getByValue(userDto.getSettlementDate());

		if (settlementDate == null) {
		    // 未設定の場合は月末とする
		    settlementDate = SettlementDate.LAST_OF_MONTH;
		}

		Boolean flag = false;

		//指定月の支出データ
		LocalDate toDate = LocalDate.now();
		int year = toDate.getYear();
		int month = toDate.getMonthValue();

		if (StringUtils.isNotEmpty(form.getYear())) {
		    year = Integer.parseInt(form.getYear());
		}

		if (StringUtils.isNotEmpty(form.getMonth())) {
		    month = Integer.parseInt(form.getMonth());
        }
		List<AmountDto> amountDtoList = graphService.getAmound(userId, year, month, settlementDate, flag);

		int amountSummary = 0;
		for (int i = 0; i < amountDtoList.size(); i++) {
			amountSummary += amountDtoList.get(i).getSum();
		}

		GraphDto graphDto = new GraphDto();
		graphDto.setYear(year);
		graphDto.setMonth(month);
		graphDto.setAmountSummary(amountSummary);
		graphDto.setAmountDtoList(amountDtoList);

		ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(amountDtoList);
        model.addAttribute("json", json);
        model.addAttribute("graphDto", graphDto);

		return "graph";
	}
}
