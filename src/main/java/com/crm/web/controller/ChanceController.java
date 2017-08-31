package com.crm.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crm.entity.SalChance;
import com.crm.service.IChanceService;

//import org.springframework.stereotype.Controller;

@Controller
public class ChanceController {
	@Resource
	private IChanceService chanceService;
	@RequestMapping("findAllMarket")
	public @ResponseBody List<SalChance> findAllMarket(){
		List<SalChance> list = chanceService.findAllMarket();
		System.out.print(list);
		return list;
	}
}
