package com.bilgeadam.service;

import com.bilgeadam.entity.Student;
import com.bilgeadam.repository.StudentRepository;
import com.bilgeadam.utiliy.MyFactoryRepository;
import com.bilgeadam.utiliy.MyFactoryService;

public class StudentService extends MyFactoryService<MyFactoryRepository, Student, Long> {

	public StudentService() {
		super(new StudentRepository());
	}

}
