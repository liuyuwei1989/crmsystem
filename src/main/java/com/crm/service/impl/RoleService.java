package com.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.crm.entity.SysRole;
import com.crm.mapper.SysRoleMapper;
import com.crm.service.IRoleService;
@Service
@Controller
public class RoleService implements IRoleService {

	@Resource
	private SysRoleMapper sysRoleMapper;
	
	
	@Override
	public List<SysRole> find() {
		// TODO Auto-generated method stub
		return sysRoleMapper.select();
	}

}
