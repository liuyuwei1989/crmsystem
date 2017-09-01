package com.crm.service;

import java.util.List;

import com.crm.entity.CstCustomer;

public interface ICstCustomerService {
	/**
	 * 
	 * 模糊查询客户
	 */
	public List<CstCustomer> likeByName(String name);
}
