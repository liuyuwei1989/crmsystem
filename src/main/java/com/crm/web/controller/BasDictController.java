package com.crm.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.entity.BasDict;
import com.crm.service.IBasDictService;

@Controller
@RequestMapping("/basDict")
public class BasDictController {
	
	IBasDictService basDictService;
	@Resource
	public void setBasDictService(IBasDictService basDictService) {
		this.basDictService = basDictService;
	}

	@RequestMapping("findBasDict")
	public String findBasDict(){
		List<BasDict> basDictList= basDictService.findService();
		for (BasDict basDict : basDictList) {
			System.out.println(basDict.getDictType());
		}
		
		return "service/newService";
	}
}
