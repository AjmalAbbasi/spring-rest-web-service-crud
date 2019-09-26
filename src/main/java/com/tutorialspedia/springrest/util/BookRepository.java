package com.tutorialspedia.springrest.util;

import java.util.ArrayList;
import java.util.List;
import com.tutorialspedia.springrest.model.Book;

public class BookRepository {
public static List<com.tutorialspedia.springrest.model.Book> books;
	
	public static List<Book> populateBookList()
	{
		books=new ArrayList<>();
		
		books.add(new Book(1,"Hello Java",44L, "URDU",true));
		books.add(new Book(2,"TutorialsPedia Tutorials",100L, "ENGLISH",true));
		books.add(new Book(3,"Arab Dunya",70L, "ARABIC",false));
		books.add(new Book(4,"French Fries",30L, "FRENCH",true));
		books.add(new Book(5,"My Life",20.5, "ENGLISH",true));
		return books;
	}
	 
}
