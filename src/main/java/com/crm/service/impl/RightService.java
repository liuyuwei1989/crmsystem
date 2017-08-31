package com.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.crm.mapper.SysRightMapper;
import com.crm.service.IRightService;
@Service
@Controller
public class RightService  implements IRightService{

	@Resource
	private SysRightMapper sysRightMapper;
	@Override
	public List find() {
		// TODO Auto-generated method stub
		return sysRightMapper.selectAll();
	}

}
