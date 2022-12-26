package com.bilgeadam.main;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import com.bilgeadam.controller.UserController;
import com.bilgeadam.entity.User;
import com.bilgeadam.entity.UserType;
import com.bilgeadam.service.UserService;

public class Menu {
	Scanner scanner = new Scanner(System.in);

	UserService userService = new UserService();
	UserController userController = new UserController();

	public void mainMenu() {
		int input = 2;
		do {
			System.out.println("1-Giriş");
			System.out.println("2-Çıkış");
			System.out.println("Lütfen işlem seçiniz");

			input = Integer.parseInt(scanner.nextLine());

			switch (input) {
			case 1:
				login2();
				break;

			default:
				break;
			}

		} while (input != 2);

	}

	private void login() {
		String username = scanner.nextLine();
		String password = scanner.nextLine();

		User user;
		List<User> users = userService.finByCollumnAndValue("username", username);
		if (users.size() > 0) {
			user = users.get(0);
			if (user.getPassword().equals(password)) {

				System.out.println("Kullanıcı bulundu");
				System.out.println(user);

			} else {
				System.out.println("Kullanıcı bulunamadı");
			}
		}

		else {

			System.out.println("Kullanıcı bulunamadı");
		}
	}

	private void login2() {
		String username = scanner.nextLine();
		String password = scanner.nextLine();
		Optional<User> user = userController.findbyUsernameAndPassword(username, password);
		if (user.isPresent()) {
			System.out.println(user);
			if (user.get().getUserType().equals(UserType.OGRENCİ)) {
				StudentMenu();
			} else {
				EmployeeMenu();
			}
		}

	}

	public void EmployeeMenu() {
		int input = 0;
		do {
			System.out.println("1-Kitap Ekle");
			System.out.println("2-Kitapları Listele");
			System.out.println("3-Kitap Sil");
			System.out.println("4-Kitap Güncelle");
			System.out.println("5-Yazar Ekle");
			System.out.println("6-Yazar Sil");
			System.out.println("7-Yazar Güncelle");
			System.out.println("8-Yazarları Listele");
			System.out.println("0-Çıkış");
			System.out.println("Lütfen işlem seçiniz");

			input = Integer.parseInt(scanner.nextLine());

			switch (input) {
			case 1:
				login2();
				break;

			default:
				break;
			}

		} while (input != 0);
	}

	public void StudentMenu() {
		int input = 0;
		do {
			System.out.println("1-Kitap Ödünç al");
			System.out.println("2-Kitap Teslim et");
			System.out.println("3-Daha önce ödünç aldığım kitaplar");
			System.out.println("2-Kitap Teslim et");
			System.out.println("0-Çıkış");
			System.out.println("Lütfen işlem seçiniz");

			input = Integer.parseInt(scanner.nextLine());

			switch (input) {
			case 1:
				login2();
				break;

			default:
				break;
			}

		} while (input != 0);
	}

	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.mainMenu();
	}

}
