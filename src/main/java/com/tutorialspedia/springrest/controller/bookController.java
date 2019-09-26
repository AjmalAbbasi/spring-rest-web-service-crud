package com.tutorialspedia.springrest.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import com.tutorialspedia.springrest.model.Book;
import com.tutorialspedia.springrest.service.BookService;

@RestController

public class bookController {
	
	@Autowired
	BookService bookservice;
	
	@GetMapping(value="/books", produces= {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity <List <Book>> getAllBooks()
	{
		List <Book> books=bookservice.getBooks();
		HttpStatus ResponseHTTPStatus= (books.size() > 0) ? HttpStatus.OK: HttpStatus.NO_CONTENT;
		return new ResponseEntity<List<Book>>(books, ResponseHTTPStatus);
	}
	
	@GetMapping(value="/book/{bookId}",produces= {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity <Book> getBook(@PathVariable("bookId") String bookId)
	{
		Book b=bookservice.getBook(Long.parseLong(bookId));
		HttpStatus ResponseHTTPStatus= (b.getBookTitle().length() > 0) ? HttpStatus.OK: HttpStatus.NO_CONTENT;
		return new ResponseEntity <Book>(b, ResponseHTTPStatus);
	}
	
	@PostMapping(value = "/book/", consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<Void> AddBook(@RequestBody Book b,UriComponentsBuilder ucBuilder)
	{
		boolean result=bookservice.addBook(b);
       HttpStatus ResponseHTTPStatus= (result==true) ? HttpStatus.CREATED: HttpStatus.BAD_REQUEST;
       
          return new ResponseEntity<Void>(ResponseHTTPStatus);
         
	}
	
	@PutMapping(value="/book/", consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<Void> UpdateBook(@RequestBody Book b)
	{
		boolean result=bookservice.updateBook(b);
		
		 HttpStatus ResponseHTTPStatus= (result==true) ? HttpStatus.OK: HttpStatus.BAD_REQUEST;
	       
         return new ResponseEntity<Void>(ResponseHTTPStatus);
		
	}
	
	@DeleteMapping(value="/book/{bookId}")
	public ResponseEntity<Void> deleteBook(@PathVariable("bookId") long bookId)
	{
		boolean result=bookservice.deleteBook(bookId);
		HttpStatus ResponseHTTPStatus= (result==true) ? HttpStatus.OK: HttpStatus.FORBIDDEN;
	       
        return new ResponseEntity<Void>(ResponseHTTPStatus);
		
	}

}
