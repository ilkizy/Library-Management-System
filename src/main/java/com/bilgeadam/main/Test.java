package com.bilgeadam.main;

import com.bilgeadam.entity.Employee;
import com.bilgeadam.entity.Student;
import com.bilgeadam.entity.UserInformation;
import com.bilgeadam.service.EmployeeService;
import com.bilgeadam.service.StudentService;
import com.bilgeadam.service.UserService;

public class Test {

	public static void main(String[] args) {

		UserService userService = new UserService();
		StudentService studentService = new StudentService();
		EmployeeService employeeService = new EmployeeService();

//
//		User user = new User("ilkizy", "123456", null);
//		User user1 = new User("bcabuk", "123456", null);
		UserInformation userInformation = new UserInformation("Ýlkiz", "Çabuk");
		UserInformation userInformation1 = new UserInformation("Buðra", "Çabuk");
//
//		userService.save(user);
//		userService.save(user1);
//		userInformationService.save(userInformation);
//		userInformationService.save(userInformation1);
//
		Employee user = new Employee("xxx", "123456");
		Student user1 = new Student("yyy", "777777");
//

		userInformation.setUser(user);
		userInformation.setUser(user1);
		userService.save(user);
		userService.save(user1);

		System.out.println(userService.findAll().size());
		System.out.println(studentService.findAll().size());
	}
}
