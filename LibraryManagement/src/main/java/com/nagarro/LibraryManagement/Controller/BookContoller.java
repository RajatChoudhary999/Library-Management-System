package com.nagarro.LibraryManagement.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nagarro.LibraryManagement.Entitiy.Book;
import com.nagarro.LibraryManagement.Service.BookService;

@Controller
public class BookContoller {
	
	private BookService bookService;

	public BookContoller(BookService bookService) {
		super();
		this.bookService = bookService;
	}
	
	@GetMapping("/")
	public String login() {
		return "login";
	}
	
	@PostMapping("/")
	public String loginverifcation(@RequestParam(name="username") String name, @RequestParam(name="password") String password) {
		
		if(name.equalsIgnoreCase("rajat04") && password.equalsIgnoreCase("admin123")) {
			return "books";
		}else {
			return "redirect:/";
		}
		
	}
	
	//To handle list of books and return model and view
	@GetMapping("/books")
	public String listsBooks(Model model) {
		model.addAttribute("books", bookService.getAllBooks());
		return "books";//return a view which we have created in templates folder
	}
	
	@GetMapping("/books/new")
	public String createBookForm(Model model) {
		
		//To hold new book data
		Book book = new Book();
		model.addAttribute("book", book);
		
		return "create_book";
		
	}
	
	@PostMapping("/books")
	public String saveBook(@ModelAttribute("book") Book book, @RequestParam(name="bookCode") Long bookCode) {
//		System.out.println(bookCode);
		boolean bookExists =  bookService.findBybookCode(bookCode);
		System.out.println(bookExists);
		
		if(bookExists == false) {
			
			return "redirect:/create_book";
		}
		
		bookService.saveBook(book);
		return "redirect:/books";
	}
	
	@GetMapping("/books/edit/{id}")
	public String editBookForm(@PathVariable Long id, Model model) {
		model.addAttribute("book", bookService.getBookById(id));
		return "edit_book";
	}
	
	@PostMapping("/books/{id}")
	public String updateBook(@PathVariable Long id, @ModelAttribute("book") Book book, Model model) {
		
		//getting student from database by id
		Book exisitingBook =  bookService.getBookById(id);
		exisitingBook.setId(id);
		exisitingBook.setBookCode(book.getBookCode());
		exisitingBook.setBookName(book.getBookName());
		exisitingBook.setBookAuthor(book.getBookAuthor());
		
		//saving updated book details
		bookService.updateBook(exisitingBook);
		return "redirect:/books";
	}
	
	//to handle delete Book request
	
	@GetMapping("/books/{id}")
	public String deleteBook(@PathVariable Long id) {
		bookService.deleteBookById(id);
		return "redirect:/books";
	}
}
