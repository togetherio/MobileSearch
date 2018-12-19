package com.fengbo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fengbo.bean.Mobile;
import com.fengbo.mapper.MobileMapper;
import com.fengbo.service.MobileService;

@Service
public class MobileServiceImpl implements MobileService {
	
	@Resource
	private MobileMapper mobilemapper;

	@Override
	public Mobile getInfo(String mobilenumber) {
		if(mobilenumber.length() > 7) {
			mobilenumber = mobilenumber.substring(0, 7);
		}
		Mobile mobile = mobilemapper.getInfo(mobilenumber);
		return mobile;
	}

}
