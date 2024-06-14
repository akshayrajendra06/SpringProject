package com.example.books.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.books.DTO.BooksDTO;
import com.example.books.Entity.Books;
import com.example.books.Exception.ResourceNotFoundException;
import com.example.books.Repository.BooksRepo;
import com.example.books.consta.Constan;

@Service
public class BookService {

	@Autowired
    private  BooksRepo bookRepo ;

	
	public List<Books> addBooksInLibray(List<BooksDTO> books) {
		// TODO Auto-generated method stub
		for (BooksDTO addInDataBase : books) {
			Books book= new Books();
			book.setAuthors(addInDataBase.getAuthorsDTO());
			book.setGenres(addInDataBase.getGenresDTO());
			book.setTitles(addInDataBase.getTitlesDTO());
			bookRepo.save(book);
		}
		List<Books> bo =getBooksData();
		return bo;
	}

	
	public List<Books> getBooksData() {
		// TODO Auto-generated method stub
		return bookRepo.findAll();
	}

	
	public Books getBooksDataByTitle(String title) {
		// TODO Auto-generated method stub
	Books books= bookRepo.getByName(title);
	if(books == null )
		new ResourceNotFoundException(Constan.Books_Not_Found);
	return books;
	}
	
}
