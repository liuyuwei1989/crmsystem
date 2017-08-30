package com.crm.service;

import java.util.List;

import com.crm.entity.SysUser;

public interface IUserService {
	
	/**
	 * 登录
	 */
	public SysUser login(SysUser sysUser);
	
	/**
	 * 查询所有用户
	 */
	public List findAll();
		
		
		
		
	

}
