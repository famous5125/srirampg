package com.sriram.service;

import com.sriram.model.Guest;
import com.sriram.model.Login;

public interface LoginService {
	Guest validateLogin(Login log);
}
