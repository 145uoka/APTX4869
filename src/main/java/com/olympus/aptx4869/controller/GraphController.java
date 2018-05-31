package com.olympus.aptx4869.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.dbflute.cbean.result.ListResultBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.olympus.aptx4869.dbflute.exbhv.MoneyReceptionBhv;
import com.olympus.aptx4869.dbflute.exbhv.pmbean.SumAmountPmb;
import com.olympus.aptx4869.dbflute.exentity.customize.SumAmount;
import com.olympus.aptx4869.dto.AmountDto;
import com.olympus.aptx4869.dto.UserDto;
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
	 *
	 * @return グラフ画面
	 * @throws JsonProcessingException
	 */
	@RequestMapping(value = "/graph/{paramUserId}", method = {RequestMethod.GET})
	public String graph(Model model, @PathVariable String paramUserId) throws JsonProcessingException{
		int userId = Integer.parseInt(paramUserId);
		UserDto userDto = graphService.findSettlementDate(userId);
		int settlementDate = userDto.getSettlementDate();
		// 現在日付
		LocalDate today = LocalDate.now();
		LocalDate  ToDate = LocalDate.of(today.getYear(), today.getMonthValue(), settlementDate);
		LocalDate  FromDate = ToDate.minusMonths(2).plusDays(1);

		SumAmountPmb pmb = new SumAmountPmb();
		pmb.setUserId(userId);
		pmb.setMoneyReceptionFromDate(FromDate);
		pmb.setMoneyReceptionToDate(ToDate);
		pmb.setMoneyReceptionFlag(false);
		ListResultBean<SumAmount> amountList = moneyReceptionBhv.outsideSql().selectList(pmb);

		List<AmountDto> amountDtoList = new ArrayList<AmountDto>();
		int amountMoney = 0;


		for (int i = 0; i < amountList.size(); i++) {
			AmountDto amountDto = new AmountDto();
			amountDto.setGenreName(amountList.get(i).getGenreName());
			amountDto.setSum(amountList.get(i).getSum());
			amountDtoList.add(amountDto);
			amountMoney += amountDtoList.get(i).getSum();
		}

		ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(amountDtoList);

        logger.debug(json);

        model.addAttribute("json", json);
        model.addAttribute("amountMoney", amountMoney);
		model.addAttribute("amountDtoList", amountDtoList);


		return "graph";
	}
}
