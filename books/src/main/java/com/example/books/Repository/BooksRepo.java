package com.example.books.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;

import com.example.books.Entity.Books;
import com.example.books.consta.Constan;

public interface BooksRepo extends JpaRepository<Books, Long> {
	@Query(Constan.Query_By_Book)
	Books getByName(String bookName);

}