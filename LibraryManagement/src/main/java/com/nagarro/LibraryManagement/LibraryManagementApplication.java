package com.nagarro.LibraryManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nagarro.LibraryManagement.Entitiy.Book;
import com.nagarro.LibraryManagement.Repository.BookRepository;

@SpringBootApplication
public class LibraryManagementApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(LibraryManagementApplication.class, args);
	}
	
	
	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
//		Book book1 = new Book("501", "Hamlet", "Shakespear");
//		bookRepository.save(book1);
//		
//		
//		
//		Book book2 = new Book("502", "Chankya", "Old");
//		bookRepository.save(book2);
//		
//		Book book3 = new Book("501", "Hamlet", "Shakespear");
//		bookRepository.save(book3);
	}

}
