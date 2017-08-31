package com.crm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.entity.SalChance;
import com.crm.mapper.SalChanceMapper;
import com.crm.service.IChanceService;
@Service
public class ChanceService implements IChanceService{
	@Resource
	private SalChanceMapper salChanceMapper;
	@Override
	public List<SalChance> findAllMarket() {
		System.out.println("findService");
		 List<SalChance> list = salChanceMapper.findAllMarket();
		 System.out.println(list);
		return list;
	}
	
}
