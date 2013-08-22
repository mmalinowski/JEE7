package com.malinowski.jee7.websocket.logic.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.malinowski.jee7.websocket.logic.UserService;
import com.malinowski.jee7.websocket.model.User;
import com.malinowski.jee7.websocket.persistence.UserDao;

@Stateless
public class UserServiceEjb implements UserService {

	@EJB
	private UserDao userDao; 
	
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}
}
