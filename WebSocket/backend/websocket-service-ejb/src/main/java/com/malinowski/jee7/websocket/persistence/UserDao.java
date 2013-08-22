package com.malinowski.jee7.websocket.persistence;

import java.util.List;

import javax.ejb.Local;

import com.malinowski.jee7.websocket.persistence.entity.UserEntity;

/**
 * Interface defining database operations on {@link UserEntity} entity.
 * 
 * @author Marcin Malinowski
 */
@Local
public interface UserDao {
	/**
	 * Returns a user with a given identifier or {@code null} if does not exist.
	 * 
	 * @param id
	 *            user identifier to be retrieved
	 * @return a user with given identifier or {@code null} if does not exist.
	 */
	UserEntity find(long id);

	/**
	 * Creates new user in the database. The ID will be generated automatically and updated in the provided object.
	 * 
	 * @param entity
	 *            a user to be created
	 */
	void create(UserEntity entity);

	/**
	 * Deletes a user with a given identifier from the database.
	 * 
	 * @param id
	 *            a identifier of a user to be deleted
	 */
	void delete(long id);

	/**
	 * Returns all {@link UserEntity} objects from the database.
	 * 
	 * @return list of all {@link UserEntity} objects stored in the database.
	 */
	List<UserEntity> find();
}
