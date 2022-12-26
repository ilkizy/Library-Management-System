package com.bilgeadam.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbluser")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long id;
	private String userName;
	private String password;
	@Enumerated(EnumType.STRING)
	private UserType userType;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(unique = true, referencedColumnName = "id", name = "userinformation_id")
	private UserInformation userInformation;

	public User() {
		super();
	}

	public User(String userName, String password, UserInformation userInformation) {
		super();
		this.userName = userName;
		this.password = password;
		this.userInformation = userInformation;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserInformation getUserInformation() {
		return userInformation;
	}

	public void setUserInformation(UserInformation userInformation) {
		this.userInformation = userInformation;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", userInformation="
				+ userInformation + "]";
	}

}
