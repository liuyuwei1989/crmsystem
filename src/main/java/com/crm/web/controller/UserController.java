package com.crm.web.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.entity.SysUser;
import com.crm.service.IUserService;

@Controller
@RequestMapping("user")
public class UserController {
	
	@Resource
	private IUserService userService;
	
	private String msg;
	
	@RequestMapping("doLogin")
	public  String doLogin(SysUser sysUser,HttpSession session ,String code){
		
		//获得本地验证码
		String vvcode=(String) session.getAttribute("vcode");
		//验证验证码是否输入正确
		
		if(code.equals(vvcode)){
			
		SysUser user=userService.login(sysUser);
		
		
		if(user!=null){
			
			return "/common/index";
			
		}else{
			msg="账号或密码错误";
			
			return "/login.jsp";
		}
			
			
			
		}
		
		msg="验证码错误";
		return "/login.jsp";
		
		
		
		
	}
	
	@RequestMapping("findAll")
	public String findAll(){
		
		
		
		
		
		
		return null;
	}

}
