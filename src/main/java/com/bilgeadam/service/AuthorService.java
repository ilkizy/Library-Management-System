package com.bilgeadam.service;

import com.bilgeadam.entity.Author;
import com.bilgeadam.repository.AuthorRepository;
import com.bilgeadam.utiliy.MyFactoryRepository;
import com.bilgeadam.utiliy.MyFactoryService;

public class AuthorService extends MyFactoryService<MyFactoryRepository, Author, Long> {

	public AuthorService() {
		super(new AuthorRepository());
		// TODO Auto-generated constructor stub
	}

}
