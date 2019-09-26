package com.tutorialspedia.springrest.service;

import java.util.List;

import com.tutorialspedia.springrest.model.Book;

public interface BookService {

	boolean addBook(com.tutorialspedia.springrest.model.Book b);
	boolean updateBook(Book b);
	boolean deleteBook(long bookId);
	Book getBook(long bookId);
	List<Book> getBooks();
	
}
