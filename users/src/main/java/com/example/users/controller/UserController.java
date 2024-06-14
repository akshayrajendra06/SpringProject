package com.example.users.controller;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.users.Entity.User;
import com.example.users.UserDTO.UserDTO;
import com.example.users.constant.consta;
import com.example.users.service.UserService;


@RestController
@RequestMapping(consta.Base_URL)
public class UserController {
	
	@Autowired
	private UserService userService;
	
	//create
	@PostMapping
	public User createUser(@RequestBody UserDTO userDTO) throws ParseException{
		return	userService.saveUser(userDTO);
	}
	
	@PostMapping(value = consta.UserBuyBook)
	public ResponseEntity<Object> booksDetails(@RequestParam(value = consta.UserId) String userId,@RequestParam(value = consta.BookName)String bookName)  throws Exception {

		return ResponseEntity.ok(userService.buyBook(userId,bookName));
	}
	

}
