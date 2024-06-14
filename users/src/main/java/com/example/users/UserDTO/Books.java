package com.example.users.UserDTO;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class Books {
	
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