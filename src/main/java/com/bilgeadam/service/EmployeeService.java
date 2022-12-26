package com.bilgeadam.service;

import com.bilgeadam.entity.Employee;
import com.bilgeadam.repository.EmployeeRepository;
import com.bilgeadam.utiliy.MyFactoryRepository;
import com.bilgeadam.utiliy.MyFactoryService;

public class EmployeeService extends MyFactoryService<MyFactoryRepository, Employee, Long> {

	public EmployeeService() {
		super(new EmployeeRepository());

	}

}
