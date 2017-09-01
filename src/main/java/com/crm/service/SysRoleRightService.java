package com.crm.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.crm.entity.SysRoleRight;
import com.crm.mapper.SysRoleRightMapper;

@Service
public class SysRoleRightService implements ISysRoleRightService {

	@Resource
	private SysRoleRightMapper sysRoleRightMapper;
	
	
	
	//更新权限
	@Override
	public void updateRights(Integer id, List<String> rightList) {
		// TODO Auto-generated method stub
		
		sysRoleRightMapper.deleteRole(BigDecimal.valueOf(Double.parseDouble(id.toString())));
		
	for (int i = 0; i < rightList.size(); i++) {
			
			SysRoleRight sysRoleRight=new SysRoleRight();
			sysRoleRight.setRfRoleId(BigDecimal.valueOf(Double.parseDouble(id.toString())));
			
			sysRoleRight.setRfRightCode(rightList.get(i).toString());
			sysRoleRightMapper.insertRole(sysRoleRight);
			
			
		}
	}
	
	
	
	
	

}
