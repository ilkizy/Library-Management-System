package com.bilgeadam.controller;

import java.util.Scanner;

import com.bilgeadam.entity.Author;
import com.bilgeadam.entity.Book;
import com.bilgeadam.service.AuthorService;
import com.bilgeadam.service.BookService;

public class BookController {

	BookService bookService = new BookService();
	AuthorService authorService = new AuthorService();
	Scanner scanner = new Scanner(System.in);

	public Book createBook() {
		System.out.println("Kitap ad�n�z� girin");
		String name = scanner.nextLine();
		System.out.println("Yazar ad�n� girin");
		String firstname = scanner.nextLine();
		System.out.println("Yazar soyad�n� girin");
		String lastname = scanner.nextLine();

		Author author = new Author(firstname, lastname);
		authorService.save(author);
		Book book = new Book(name, author);
		return bookService.save(book);
	}
}
