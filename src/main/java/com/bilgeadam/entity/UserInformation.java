package com.bilgeadam.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class UserInformation {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	private String name;
	private String surName;

	@OneToOne()
	@JoinColumn(name = "user_id", referencedColumnName = "id", unique = true)
	private User user;

	public UserInformation() {
		super();
	}

	public UserInformation(String name, String surName) {
		super();
		this.name = name;
		this.surName = surName;

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "UserInformation [id=" + id + ", name=" + name + ", surName=" + surName
				+ ", user=" + user + "]";
	}

}
