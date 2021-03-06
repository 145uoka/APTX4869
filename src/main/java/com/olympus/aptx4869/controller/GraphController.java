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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.olympus.aptx4869.constants.SystemCodeConstants.MoneyReceptionFlag;
import com.olympus.aptx4869.constants.SystemCodeConstants.SettlementDate;
import com.olympus.aptx4869.dbflute.exbhv.MoneyReceptionBhv;
import com.olympus.aptx4869.dto.AmountDto;
import com.olympus.aptx4869.dto.GraphDto;
import com.olympus.aptx4869.dto.LoginUserDto;
import com.olympus.aptx4869.dto.UserPropertyDto;
import com.olympus.aptx4869.exception.NotLoginException;
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
	@Autowired
	LoginUserDto loginUserDto;

	Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 *グラフ画面表示メソッド
	 * @param model 画面
	 * @param paramUserId 画面ユーザーID
	 * @return グラフ画面
	 * @throws JsonProcessingException jsonエラー
	 * @throws NotLoginException
	 */
	@RequestMapping(value = "/graph", method = {RequestMethod.GET})
	public String graph(GraphForm form, BindingResult bindingResult, Model model) throws JsonProcessingException, NotLoginException{
		if(loginUserDto.getUserId() == null){
			throw new NotLoginException();
		}

		int userId = loginUserDto.getUserId();

		//ユーザープロパティテーブルから締め日取出し
		UserPropertyDto userPropertyDto = graphService.findSettlementDate(userId);
		SettlementDate settlementDate = SettlementDate.getByValue(userPropertyDto.getSettlementDate());

		boolean moneyReceptionFlag = MoneyReceptionFlag.EXPENSE.getValue();

		//指定月の支出データ
		LocalDate toDate = LocalDate.now();
		int year = toDate.getYear();
		int month = toDate.getMonthValue();
		if(toDate.getDayOfMonth() > settlementDate.getValue()){
			month += 1;
		}

		if (StringUtils.isNotEmpty(form.getYear())) {
			year = Integer.parseInt(form.getYear());
		}

		if (StringUtils.isNotEmpty(form.getMonth())) {
			month = Integer.parseInt(form.getMonth());
		}

		List<AmountDto> amountDtoList = graphService.getAmound(userId, year, month, settlementDate, moneyReceptionFlag);

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
