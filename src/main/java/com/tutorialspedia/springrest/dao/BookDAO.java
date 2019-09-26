package com.tutorialspedia.springrest.dao;

import java.util.List;

import com.tutorialspedia.springrest.model.Book;

public interface BookDAO {
	boolean addBook(Book b);
	boolean updateBook(Book b);
	boolean deleteBook(long bookId);
	Book getBook(long bookId);
	List<Book> getBooks();
}
