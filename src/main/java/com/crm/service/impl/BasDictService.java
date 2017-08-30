package com.crm.service.impl;

import java.util.ArrayList;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.entity.BasDict;
import com.crm.mapper.BasDictMapper;
import com.crm.service.IBasDictService;


@Service
public class BasDictService implements IBasDictService {
	
	BasDictMapper basDictMapper;
	@Resource
	public void setBasDictMapper(BasDictMapper basDictMapper) {
		this.basDictMapper = basDictMapper;
	}

	@Override
	public List<BasDict> findService() {
		List<BasDict> list = basDictMapper.selectAll();
		List<BasDict> BasDictList = new ArrayList<BasDict>();
		for (BasDict basDict : list) {
			if (basDict.getDictType().equals("服务类型")) {
				BasDictList.add(basDict);
			}
		}
		return BasDictList;
	}

}
