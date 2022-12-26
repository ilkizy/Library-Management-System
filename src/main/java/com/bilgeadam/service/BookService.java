package com.bilgeadam.service;

import com.bilgeadam.entity.Book;
import com.bilgeadam.repository.BookRepository;
import com.bilgeadam.utiliy.MyFactoryRepository;
import com.bilgeadam.utiliy.MyFactoryService;

public class BookService extends MyFactoryService<MyFactoryRepository, Book, Long> {

	public BookService() {
		super(new BookRepository());
		// TODO Auto-generated constructor stub
	}

}
