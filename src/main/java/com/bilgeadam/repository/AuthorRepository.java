package com.bilgeadam.repository;

import com.bilgeadam.entity.Author;
import com.bilgeadam.utiliy.MyFactoryRepository;

public class AuthorRepository extends MyFactoryRepository<Author, Long> {

	public AuthorRepository() {
		super(new Author());

	}

}
