package com.example.users.FeignClient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.users.UserDTO.Books;
import com.example.users.constant.consta;

@FeignClient(name = consta.Books , url = consta.Books_Base_URL)
public interface UserFromBooks {

	@GetMapping(value = consta.Get_ALL_BOOKS )
	public List<Books> getBooksData() ;
		
}
