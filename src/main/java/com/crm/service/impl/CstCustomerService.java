package com.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.entity.CstCustomer;
import com.crm.mapper.CstCustomerMapper;
import com.crm.service.ICstCustomerService;
@Service
public class CstCustomerService implements ICstCustomerService {
	@Resource
	CstCustomerMapper cstCustomerMapper;
	@Override
	public List<CstCustomer> likeByName(String name) {
		
		return cstCustomerMapper.likeByName(name);
	}

}
