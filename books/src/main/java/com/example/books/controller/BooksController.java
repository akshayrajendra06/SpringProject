package com.example.books.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.books.DTO.BooksDTO;
import com.example.books.Entity.Books;
import com.example.books.consta.Constan;
import com.example.books.services.BookService;

@RestController
@RequestMapping(Constan.BASE_URL_Books)
public class BooksController {

	@Autowired
	private BookService bookService;
	
	@PostMapping(value = Constan.Enter_Books )
	public ResponseEntity<List<Books>>  enterBooks(@RequestBody List<BooksDTO> books  ) {
		return ResponseEntity.status(HttpStatus.CREATED).body(bookService.addBooksInLibray(books));
	}
	

	@GetMapping(value = Constan.Get_Book_By_Title)
	public ResponseEntity<Books> getBooksDataByTitle(@PathVariable String titles ) throws Exception {

		return ResponseEntity.status(HttpStatus.CREATED).body( bookService.getBooksDataByTitle(titles));
	}
	
	@GetMapping(value = Constan.Get_ALL_BOOKS )
	public ResponseEntity<List<Books>> getBooksData() {
		
		return  ResponseEntity.ok(bookService.getBooksData());
	}
}
