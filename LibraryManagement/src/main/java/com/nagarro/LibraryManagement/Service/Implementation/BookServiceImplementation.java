package com.nagarro.LibraryManagement.Service.Implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nagarro.LibraryManagement.Entitiy.Book;
import com.nagarro.LibraryManagement.Repository.BookRepository;
import com.nagarro.LibraryManagement.Service.BookService;


@Service
public class BookServiceImplementation implements BookService{

	private BookRepository bookRepository;
	
	
	public BookServiceImplementation(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}


	@Override
	public List<Book> getAllBooks() {
		return bookRepository.findAll(); //returns list of student
	}


	@Override
	public Book saveBook(Book book) {
		return bookRepository.save(book);//Saves newly Created Book
	}


	@Override
	public Book getBookById(Long id) {
		return bookRepository.findById(id).get();
	}


	@Override
	public Book updateBook(Book book) {
		return bookRepository.save(book);
	}


	@Override
	public void deleteBookById(Long id) {
		bookRepository.deleteById(id);
		
	}


	@Override
	public boolean findBybookCode(Long bookCode) {
		
		return bookRepository.existsById(bookCode);
	}


	


	


	
	
	
}
