package com.nagarro.LibraryManagement.Entitiy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "book_code", nullable = false)
	private Long bookCode;
	
	@Column(name = "book_name", nullable = false)
	private String bookName;
	
	@Column(name = "book_author", nullable = false)
	private String bookAuthor;
	
	
	public Book() {
		
	}
	
	public Book(Long bookCode, String bookName, String bookAuthor) {
		super();
		this.bookCode = bookCode;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getBookCode() {
		return bookCode;
	}
	public void setBookCode(Long bookCode) {
		this.bookCode = bookCode;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	
	
	
	
}
