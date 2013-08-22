package com.malinowski.jee7.websocket.persistence.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.malinowski.jee7.websocket.persistence.UserDao;
import com.malinowski.jee7.websocket.persistence.entity.UserEntity;

/**
 * JPA implementation of {@link UserDao} service.
 * 
 * @author Marcin Malinowski
 */
@Stateless
public class JpaUserDao implements UserDao {
	
	@PersistenceContext
	private EntityManager em;

	/* (non-Javadoc)
	 * @see com.malinowski.jee7.websocket.persistence.UserDao#find(long)
	 */
	@Override
	public UserEntity find(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.malinowski.jee7.websocket.persistence.UserDao#create(com.malinowski.jee7.websocket.persistence.entity.UserEntity)
	 */
	@Override
	public void create(UserEntity entity) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.malinowski.jee7.websocket.persistence.UserDao#delete(long)
	 */
	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.malinowski.jee7.websocket.persistence.UserDao#find()
	 */
	@Override
	public List<UserEntity> find() {
		// TODO Auto-generated method stub
		return null;
	}
}
