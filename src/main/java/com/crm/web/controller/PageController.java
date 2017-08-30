package com.crm.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
/**
 * 用于页面链接
 * @author hasee
 */
@Controller
@RequestMapping("/page")
public class PageController {
	@RequestMapping("/{webDic}/{webFile}")
	public ModelAndView goToWebpage(@PathVariable("webDic") String webDic,@PathVariable("webFile") String webFile){
		return new ModelAndView(webDic +"/"+webFile);
	}
}
