package com.crm.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/page")
public class PageController {
	@RequestMapping("/{web}/{webSource}")
	public ModelAndView index(@PathVariable("web") String web,@PathVariable("webSource") String webSource){
		System.out.println("123123");
		return new ModelAndView(web +"/"+webSource);
	}
}
