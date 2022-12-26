package com.bilgeadam.controller;

import java.util.Scanner;

import com.bilgeadam.entity.User;
import com.bilgeadam.entity.UserInformation;
import com.bilgeadam.service.UserInformationService;
import com.bilgeadam.service.UserService;

public class UserInformationController {

	UserInformationService userInformationService;
	Scanner scanner = new Scanner(System.in);

	UserService userService;

	public UserInformationController() {
		// TODO Auto-generated constructor stub
		this.userInformationService = new UserInformationService();
		this.userService = new UserService();
	}

	public UserInformation createUserInformation(User user) {
		System.out.println("Lütfen  isminizi giriniz");
		String name = scanner.nextLine();
		System.out.println("Lütfen soyadýnýzý giriniz");
		String lastName = scanner.nextLine();

		UserInformation userInformation = new UserInformation(name, lastName);
		userInformation.setUser(userService.findById(user.getId()).get());
		return userInformationService.save(userInformation);

	}

	public UserInformation createUserInformation() {
		System.out.println("Lütfen  isminizi giriniz");
		String name = scanner.nextLine();
		System.out.println("Lütfen soyadýnýzý giriniz");
		String lastName = scanner.nextLine();

		UserInformation userInformation = new UserInformation(name, lastName);
		return userInformation;

	}
}
