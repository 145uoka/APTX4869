package com.olympus.aptx4869.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.olympus.aptx4869.dbflute.exbhv.MoneyReceptionBhv;
import com.olympus.aptx4869.dto.AmountDto;
import com.olympus.aptx4869.dto.LoginUserDto;
import com.olympus.aptx4869.dto.UserPropertyDto;
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
	 */
	@RequestMapping(value = "/graph", method = {RequestMethod.GET})
	public String graph(Model model) throws JsonProcessingException{
		int userId = loginUserDto.getUserId();
		//ユーザープロパティテーブルから締め日取出し
		UserPropertyDto userPropertyDto = graphService.findSettlementDate(userId);
		int settlementDate = userPropertyDto.getSettlementDate();
		int amountMoney = 0;
		Boolean flag = false;
		//指定月の支出データ
		List<AmountDto> amountDtoList = graphService.getAmound(userId, settlementDate, flag);
		for (int i = 0; i < amountDtoList.size(); i++) {
			amountMoney += amountDtoList.get(i).getSum();
		}
		ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(amountDtoList);
        model.addAttribute("json", json);
        model.addAttribute("amountMoney", amountMoney);
		model.addAttribute("amountDtoList", amountDtoList);


		return "graph";
	}
}
