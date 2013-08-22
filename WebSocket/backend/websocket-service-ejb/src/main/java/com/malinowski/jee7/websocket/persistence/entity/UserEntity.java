package com.malinowski.jee7.websocket.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 * Entity class representing a single User.
 * 
 * @author Marcin Malinowski
 */
@Entity
@NamedQueries({ 
	@NamedQuery(name = UserEntity.FIND_ALL_QUERY, query = "SELECT u FROM UserEntity u") 
})
public class UserEntity {
	
	/**
	 * Find all users query name.
	 */
	public static final String FIND_ALL_QUERY = "UserEntity.findAll";
	
	/**
	 * User Id.
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private long userId;
	
	/**
	 * User's first name.
	 */
	@Column(length=32)
	private String firstName;
	
	/**
	 * User's last name.
	 */
	@Column(length=32)
	private String lastName;

	// getters and stters
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
