package com.crm.web.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crm.entity.CstCustomer;

@Controller
@RequestMapping("/cust")
public class CustomerController {

	public @ResponseBody List<CstCustomer> showAll(){
		return null;
	}
}
