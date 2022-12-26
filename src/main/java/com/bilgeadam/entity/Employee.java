package com.bilgeadam.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Employee extends User {

	@Enumerated(EnumType.STRING)
	UserType userType = UserType.PERSONEL;

	public Employee() {
		super();
		setUserType(UserType.PERSONEL);
	}

	public Employee(String userName, String password) {
		super(userName, password);
		setUserType(UserType.PERSONEL);
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "Employee [getId()=" + getId() + ", getUserName()=" + getUserName()
				+ ", getPassword()=" + getPassword() + "]";
	}
}
