package com.sriram.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sriram.dao.UserDao;
import com.sriram.model.Guest;
import com.sriram.model.Login;

@Service("userServiceImpl")
@Transactional(readOnly = true)
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private UserDao dao;
	public Guest validateLogin(Login log) {
		// TODO Auto-generated method stub
		return dao.validateLogin(log);
	}

}
