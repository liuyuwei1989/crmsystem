package com.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.mapper.CstServiceMapper;
import com.crm.service.ICstService;
@Service
public class CstService implements ICstService {
	
	CstServiceMapper cstServiceMapper;
	@Resource
	public void setCstServiceMapper(CstServiceMapper cstServiceMapper) {
		this.cstServiceMapper = cstServiceMapper;
	}



}
