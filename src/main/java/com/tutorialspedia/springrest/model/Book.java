package com.tutorialspedia.springrest.model;

public class Book {
	long bookId;
	String bookTitle;
	Double bookPrice;
	String bookLang;
	boolean isAvailable;
	public Book()
	{
		
	}
	
	public Book(long bookId, String bookTitle, double d, String bookLang, boolean isAvailable) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.bookPrice = d;
		this.bookLang = bookLang;
		this.isAvailable = isAvailable;
	}
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public Double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getBookLang() {
		return bookLang;
	}
	public void setBookLang(String bookLang) {
		this.bookLang = bookLang;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookTitle=" + bookTitle + ", bookPrice=" + bookPrice + ", bookLang="
				+ bookLang + ", isAvailable=" + isAvailable + "]";
	}
	
	

}
