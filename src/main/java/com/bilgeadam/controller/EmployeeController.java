package com.bilgeadam.controller;

import java.util.Scanner;

import com.bilgeadam.entity.Employee;
import com.bilgeadam.entity.UserInformation;
import com.bilgeadam.service.EmployeeService;

public class EmployeeController {

	EmployeeService employeeService;
	Scanner scanner = new Scanner(System.in);
	UserInformationController userInformationController;

	public EmployeeController() {
		super();
		this.employeeService = new EmployeeService();
		this.userInformationController = new UserInformationController();
	}

	public Employee createEmployee() {

		System.out.println("Kullanýcý adýnýzý girin");
		String username = scanner.nextLine();
		System.out.println("Þifrenizi girin");
		String password = scanner.nextLine();

		Employee employee = new Employee(username, password);
		UserInformation userInformation = userInformationController.createUserInformation();
		employee.setUserInformation(userInformation);
		userInformation.setUser(employee);
		return employeeService.save(employee);
	}
}
