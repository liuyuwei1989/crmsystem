package com.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crm.entity.SysUser;
import com.crm.mapper.SysUserMapper;
import com.crm.service.IUserService;

@Transactional
@Service
public class UserService implements IUserService {

	@Resource
	private SysUserMapper sysUserMapper;
	
	@Override
	public SysUser login(SysUser sysUser) {
		// TODO Auto-generated method stub
		
		
		
		return sysUserMapper.selectByConditions(sysUser);
	}

	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
