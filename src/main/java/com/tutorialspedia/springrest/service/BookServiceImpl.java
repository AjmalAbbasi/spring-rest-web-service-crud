package com.tutorialspedia.springrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorialspedia.springrest.dao.BookDAO;
import com.tutorialspedia.springrest.model.Book;

@Service("bookservice")
public class BookServiceImpl implements BookService {

	@Autowired
	BookDAO bookdao;
	public boolean addBook(Book b) {
		return bookdao.addBook(b);
	}

	public boolean updateBook(Book b) {
		 return bookdao.updateBook(b);
		
	}

	public boolean deleteBook(long bookId) {
		
		return bookdao.deleteBook(bookId);
	}

	public List<Book> getBooks() {
	
		return bookdao.getBooks();
	}

	@Override
	public Book getBook(long bookId) {
		return bookdao.getBook(bookId);
		
	}

}
