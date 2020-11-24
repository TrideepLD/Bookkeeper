package examples.pubhub.model;

import java.time.LocalDate;

public class Book {

	private String isbn13;			// International Standard Book Number, unique
	private String title;
	private String author;
	private LocalDate publishDate;	// Date of publish to the website
	
	private double price;
	
	private byte[] content;

	// Constructor used when no date is specified
	public Book(String isbn, String title, String author, byte[] content) {
		this.isbn13 = isbn;
		this.title = title;
		this.author = author;
		this.publishDate = LocalDate.now();
		this.content = content;
	}
	
	// Constructor used when a date is specified
	public Book(String isbn, String title, String author, byte[] content, LocalDate publishDate) {
		this.isbn13 = isbn;
		this.title = title;
		this.author = author;
		this.publishDate = publishDate;
		this.content = content;
	}
	
	// Default constructor
	public Book() {
		this.isbn13 = null;
		this.title = null;
		this.author = null;
		this.publishDate = LocalDate.now();
		this.content = null;
	}
	
	
	private String isbn;
	private String tit;
	private String aut;
	private String pD;
	private String p;
	private String cont;
	
	// Constructor for the start of a Table
	public Book(String isbn, String title, String author, String publishDate, String price, String content) {
		this.isbn = isbn;
		this.tit = title;
		this.aut = author;
		this.pD = publishDate;
		this.p = price;
		this.cont = content;
	}
	
	public void setisbn(String isbn) {
		this.isbn = isbn;
	}
	
	public void settit(String tit) {
		this.tit = tit;
	}
	
	public void setaut(String aut) {
		this.aut = aut;
	}
	
	public void setpD(String pD) {
		this.pD = pD;
	}
	
	public void setp(String p) {
		this.p = p;
	}
	
	public void setcont(String cont) {
		this.cont = cont;
	}
	
	public String getIsbn13() {
		return isbn13;
	}

	public void setIsbn13(String isbn13) {
		this.isbn13 = isbn13;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public LocalDate getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public byte[] getContent() {
		return content;
	}

	public void setContent(byte[] content) {
		this.content = content;
	}
	
	public void view() {
        System.out.println(isbn13 + title + author + price);
    }
	
}
