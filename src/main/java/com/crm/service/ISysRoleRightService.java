package com.crm.service;

import java.util.ArrayList;
import java.util.List;

import com.crm.entity.SysRoleRight;

public interface ISysRoleRightService {
	
	//更新权限
	public void updateRights(Integer id, List<String> rightList);
	
	

}
