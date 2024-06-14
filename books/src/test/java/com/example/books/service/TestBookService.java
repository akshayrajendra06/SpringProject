package com.example.books.service;

import java.util.Arrays;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.books.DTO.BooksDTO;
import com.example.books.Entity.Books;
import com.example.books.Repository.BooksRepo;
import com.example.books.services.BookService;

@ExtendWith(MockitoExtension.class)
public class TestBookService {

	    @Mock
	    private BooksRepo bookRepo;

	    @InjectMocks
	    private BookService bookService;

	    @BeforeEach
	    public void setUp() {
	        // This method will be run before each test.
	    }

	    @Test
	    public void testAddBooksInLibrary() {
	    	
	        BooksDTO book1DTO = new BooksDTO("Author1", "Genre1", "Title1");
	        BooksDTO book2DTO = new BooksDTO("Author2", "Genre2", "Title2");
	        
	        List<BooksDTO> booksDTOList = Arrays.asList(book1DTO, book2DTO);

	        // Assuming getBooksData() returns a list of books
	        Books book1 = new Books(1 ,"Author1", "Genre1", "Title1");
	        Books book2 = new Books(2,"Author2", "Genre2", "Title2");

	        when(bookRepo.save(any(Books.class))).thenAnswer(invocation -> invocation.getArgument(0));
	        
	        when(libraryService.getBooksData()).thenReturn(Arrays.asList(book1, book2));

	        List<Books> result = libraryService.addBooksInLibrary(booksDTOList);

	        // Verify that the save method was called twice
	        verify(bookRepo, times(2)).save(any(Books.class));
	        
	        // Verify that the getBooksData method was called once
	        verify(libraryService, times(1)).getBooksData();

	        // Check that the returned list is as expected
	        assertEquals(2, result.size());
	        assertEquals("Author1", result.get(0).getAuthors());
	        assertEquals("Title1", result.get(0).getTitles());
	        assertEquals("Genre1", result.get(0).getGenres());
	        assertEquals("Author2", result.get(1).getAuthors());
	        assertEquals("Title2", result.get(1).getTitles());
	        assertEquals("Genre2", result.get(1).getGenres());
	        
	        
	    }
}
