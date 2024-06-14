package com.example.books.Exception;

import com.example.books.consta.Constan;

public class ResourceNotFoundException  extends RuntimeException{

	public ResourceNotFoundException(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}

	public ResourceNotFoundException() {
		super(Constan.Exception_constructor);
	}
}
