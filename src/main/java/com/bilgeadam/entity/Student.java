package com.bilgeadam.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;

@Entity
public class Student extends User {

	@Enumerated(EnumType.STRING)
	UserType userType = UserType.OGRENCÝ;

	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
	private List<Borrow> borrows = new ArrayList();

	public Student() {
		super();
		setUserType(UserType.OGRENCÝ);
	}

	public Student(String userName, String password) {
		super(userName, password);
		setUserType(UserType.OGRENCÝ);
	}

	@Override
	public String toString() {
		return "Student [getId()=" + getId() + ", getUserName()=" + getUserName() + ", getPassword()=" + getPassword()
				+ "]";
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public List<Borrow> getBorrows() {
		return borrows;
	}

	public void setBorrows(List<Borrow> borrows) {
		this.borrows = borrows;
	}

}
