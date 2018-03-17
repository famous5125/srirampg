package com.sriram.dao;

import com.sriram.model.Guest;
import com.sriram.model.Login;

public interface UserDao {
	
	Guest validateLogin(Login log);

}
