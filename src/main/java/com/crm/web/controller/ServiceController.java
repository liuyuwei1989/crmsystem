package com.crm.web.controller;



import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crm.entity.BasDict;
import com.crm.entity.CstCustomer;
import com.crm.service.IBasDictService;
import com.crm.service.ICstCustomerService;
import com.crm.service.ICstService;
import com.crm.service.IUserService;




@Controller
@RequestMapping("/service")
public class ServiceController {
	@Resource
	IBasDictService basDictService;
	@Resource
	ICstService cstService;
	@Resource
	ICstCustomerService cstCustomerService;
	
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
	@RequestMapping(value="likeByName", method=RequestMethod.POST)
	public @ResponseBody List<CstCustomer> likeByName(String svrCustName){
		String svrCustNames ="%"+svrCustName+"%";
		List<CstCustomer> cstList = cstCustomerService.likeByName(svrCustNames);
	
		for (CstCustomer cstCustomer : cstList) {
			System.out.println(cstCustomer.getCustName());
		}
		return cstList;
	}

}
