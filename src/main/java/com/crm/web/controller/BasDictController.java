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
	@Resource
	IBasDictService basDictService;
	@RequestMapping("findBasDict")
	public List<BasDict> findBasDict(){
		List<BasDict> basDictList= basDictService.findService();
		return basDictList;
	}
}
