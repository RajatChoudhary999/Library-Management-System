package com.nagarro.LibraryManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.LibraryManagement.Entitiy.Book;

public interface BookRepository extends  JpaRepository<Book, Long>{

	
}
