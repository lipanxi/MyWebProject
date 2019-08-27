package com.lipanxi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.lipanxi.dao.TestDao;
import com.lipanxi.dto.User;
import com.lipanxi.service.TestService;


@Service("testService")
public class TestServiseImpl implements TestService {

	
	@Autowired
	@Qualifier("testDao")
	private TestDao testDao;
	
	public User getUser() {
		return testDao.getUser();
	}

}
