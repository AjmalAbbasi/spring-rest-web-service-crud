package com.tutorialspedia.springrest.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.tutorialspedia.springrest.model.Book;
import com.tutorialspedia.springrest.util.BookRepository;
@Component
public class BookDAOImpl implements BookDAO {
	 static List<Book> books=null;
	static {
		 books=BookRepository.populateBookList();
	}

	public boolean addBook(Book b) {
		try {
			books.add(b);
		}
		catch(Exception e)
		{
			return false;
		}
		return true;
	}


	public boolean updateBook(Book b) {
		for (Book book: books)
		{
			if (book.getBookId()==b.getBookId())
			{
				book.setBookTitle(b.getBookTitle());
				book.setAvailable(b.isAvailable());
				book.setBookLang(b.getBookLang());
				book.setBookPrice(b.getBookPrice());
				return true;
			}
			
		}
		return false;
	}
public Book getBookById(long bookId)
{
	for (Book b: books)
	{
		if (b.getBookId()==bookId)
			{
				return b;
			}
		
	}
	return null;
}
	

	public List<Book> getBooks() {
		
		return books;
	}


	@Override
	public Book getBook(long bookId) {
		for (Book book: books)
		{
			if (book.getBookId()==bookId)
			{
				return book;
			}
		}
		return null;
	}


	@Override
	public boolean deleteBook(long bookId) {
		Book b=getBookById(bookId);
		
		return books.remove(b);
		
	}
	

}
