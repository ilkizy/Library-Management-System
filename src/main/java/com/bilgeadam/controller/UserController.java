package com.bilgeadam.controller;

import java.util.Optional;
import java.util.Scanner;

import com.bilgeadam.entity.User;
import com.bilgeadam.service.UserService;

public class UserController {

	UserService userService;
	Scanner scanner = new Scanner(System.in);

	public UserController() {
		super();
		this.userService = new UserService();
	}

	public User createUser() {

		System.out.println("Kullanýcý adýnýzý girin");
		String username = scanner.nextLine();
		System.out.println("Þifrenizi girin");
		String password = scanner.nextLine();

		User user = new User(username, password);

		return userService.save(user);
	}

	public Optional<User> findbyUsernameAndPassword(String username, String password) {

		return userService.findbyUsernameAndPassword(username, password);

	}

}
