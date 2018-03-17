package com.sriram.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.sriram.model.Guest;
import com.sriram.model.Login;

public class UserDaoImpl implements UserDao{
	@Autowired
	private SessionFactory sessionFactory;
	
	public Guest validateLogin(Login log) {
		// TODO Auto-generated method stub
		String s="from Guest where username='"+log.getUsername()+"' and password='"+log.getPassword()+"'";
		
		Query query =sessionFactory.getCurrentSession().createQuery(s);
		
		List list=query.list();
		return (Guest) (list.size()>0 ? list.get(0): null);
	}

}
