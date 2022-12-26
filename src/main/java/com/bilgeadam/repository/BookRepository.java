package com.bilgeadam.repository;

import com.bilgeadam.entity.Book;
import com.bilgeadam.utiliy.MyFactoryRepository;

public class BookRepository extends MyFactoryRepository<Book, Long> {

	public BookRepository() {
		super(new Book());

	}

}
