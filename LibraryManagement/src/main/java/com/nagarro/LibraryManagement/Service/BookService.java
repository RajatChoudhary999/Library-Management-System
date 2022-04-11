package com.nagarro.LibraryManagement.Service;

import java.util.List;

import com.nagarro.LibraryManagement.Entitiy.Book;

public interface BookService  {
	
	List<Book> getAllBooks();
	
	boolean findBybookCode(Long bookCode);
	
	Book saveBook(Book book);
	
	Book getBookById(Long id);
	
	Book updateBook (Book book);
	
	void deleteBookById(Long id);

}
