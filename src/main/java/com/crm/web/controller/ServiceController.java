package com.crm.web.controller;



import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crm.entity.BasDict;
import com.crm.service.IBasDictService;




@Controller
@RequestMapping("/service")
public class ServiceController {
	@Resource
	IBasDictService basDictService;
	
	@RequestMapping("addService")
	public String addService(){
		
		return "service/newService";
	}


	@RequestMapping("findBasDict")
	public @ResponseBody List<BasDict> findBasDict(){
		List<BasDict> basDictList= basDictService.findService();
		for (BasDict basDict : basDictList) {
			System.out.println(basDict.getDictType());
		}
		
		return basDictList;
	}
	
}
