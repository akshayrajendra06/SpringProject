package com.example.books.DTO;

import com.example.books.Entity.Books;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BooksDTO {

	
	@NotEmpty
    private String titlesDTO ;
	@NotEmpty
	private String authorsDTO ;
	@NotEmpty
	private String genresDTO ;
}
