package com.malinowski.jee7.websocket.model;

import java.io.Serializable;

/**
 * A class representing a single user.
 * 
 * @author Marcin Malinowski
 */
public class User implements Serializable {

	/**
	 * Serial ID.
	 */
	private static final long serialVersionUID = 2075681592585995900L;

	/**
	 * Unique user identifier.
	 */
	private long userId;

	/**
	 * User's first name.
	 */
	private String firstName;

	/**
	 * User's last name.
	 */
	private String lastName;

	/**
	 * Constructor.
	 */
	public User() {
		// default constructor, used during serialization process.
	}

	/**
	 * Constructor.
	 * 
	 * @param userId
	 *            Unique user identifier.
	 * @param firstName
	 *            User's first name.
	 * @param lastName
	 *            User's last name.
	 */
	public User(long userId, String firstName, String lastName) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	// getters & setters

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (userId ^ (userId >>> 32));
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (userId != other.userId)
			return false;
		return true;
	}

}
