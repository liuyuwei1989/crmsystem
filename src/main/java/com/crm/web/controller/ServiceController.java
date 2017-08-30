package com.crm.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/service")
public class ServiceController {
	@RequestMapping("addService")
	public String addService(){
		System.out.println("123123");
		return "service/newService";
	}
}
