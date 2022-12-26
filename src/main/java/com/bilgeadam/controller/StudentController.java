package com.bilgeadam.controller;

import java.util.Scanner;

import com.bilgeadam.entity.Student;
import com.bilgeadam.entity.UserInformation;
import com.bilgeadam.service.StudentService;

public class StudentController {

	StudentService studentService;
	Scanner scanner = new Scanner(System.in);
	UserInformationController userInformationController;

	public StudentController() {
		super();
		this.studentService = new StudentService();
		this.userInformationController = new UserInformationController();
	}

	public Student createStudent() {

		System.out.println("Kullanýcý adýnýzý girin");
		String username = scanner.nextLine();
		System.out.println("Þifrenizi girin");
		String password = scanner.nextLine();

		Student student = new Student(username, password);
		UserInformation userInformation = userInformationController.createUserInformation();
		student.setUserInformation(userInformation);
		userInformation.setUser(student);
		return studentService.save(student);
	}
}
