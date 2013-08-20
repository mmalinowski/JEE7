package com.malinowski.jee7.websocket.logic;

import java.util.List;

import javax.ejb.Remote;

import com.malinowski.jee7.websocket.model.User;

/**
 * Service provides CRUD operations on {@link User} bean.
 * 
 * @author Marcin Malinowski
 */
@Remote
public interface UserService {

	/**
	 * 
	 * @return
	 */
	List<User> findAll();

	void create(User user);

	void update(User user);

	void delete(User user);
}
