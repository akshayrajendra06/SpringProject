package com.example.books.Entity;

import com.example.books.consta.Constan;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity

@Builder
@Table(name= Constan.TABLE_NAME_BOOKS)
public class Books {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String titles ;
	
	private String authors ;
	
	private String genres ;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitles() {
		return titles;
	}

	public void setTitles(String titles) {
		this.titles = titles;
	}

	public String getAuthors() {
		return authors;
	}

	public void setAuthors(String authors) {
		this.authors = authors;
	}

	public String getGenres() {
		return genres;
	}

	public void setGenres(String genres) {
		this.genres = genres;
	}

	public Books(long id, String titles, String authors, String genres) {
		super();
		this.id = id;
		this.titles = titles;
		this.authors = authors;
		this.genres = genres;
	}

	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}