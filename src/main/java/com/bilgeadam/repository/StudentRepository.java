package com.bilgeadam.repository;

import com.bilgeadam.entity.Student;
import com.bilgeadam.utiliy.MyFactoryRepository;

public class StudentRepository extends MyFactoryRepository<Student, Long> {

	public StudentRepository() {
		super(new Student());

	}

}
