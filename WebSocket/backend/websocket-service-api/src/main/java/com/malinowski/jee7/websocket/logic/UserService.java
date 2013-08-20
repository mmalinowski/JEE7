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
	 * JMS topic.
	 */
	String NOTIFICATION_TOPIC = "/jms/websocket/notifications";

	/**
	 * Returns list of all existing users.
	 * 
	 * @return list of all existing users.
	 */
	List<User> findAll();

	/**
	 * Creates a new user in the database. When a user is created, a notification is published on {@code #NOTIFICATION_TOPIC}.
	 * 
	 * @param user
	 *            a user to be created. An id will be generated automatically.
	 */
	void create(User user);

	/**
	 * Updates an existing user in the database. When a user is updated, a notification is published on {@code #NOTIFICATION_TOPIC}.
	 * 
	 * @param user
	 *            a user to be updated.
	 */
	void update(User user);

	/**
	 * Deletes a user from the database. When a user is deleted, a notification is published on {@code #NOTIFICATION_TOPIC}.
	 * 
	 * @param user
	 *            a user to be deleted.
	 */
	void delete(User user);
}
