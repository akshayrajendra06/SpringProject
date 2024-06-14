package com.example.users.service;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.users.Entity.User;
import com.example.users.Entity.UserBooksDetails;
import com.example.users.Exception.ResourceNotFoundException;
import com.example.users.FeignClient.UserFromBooks;
import com.example.users.Repo.UserDetailsRepo;
import com.example.users.Repo.UserRepo;
import com.example.users.UserDTO.Books;
import com.example.users.UserDTO.UserDTO;
import com.example.users.constant.consta;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo ;
	
	@Autowired
	private UserFromBooks userFromBooks;
	
	@Autowired
	private UserDetailsRepo userDetailsRepo;
	
	
	
	public User saveUser(UserDTO userDTO) throws ParseException {
		User user= new User();
		
		user.setUserName(userDTO.getUserName());
		user.setUserNumber(userDTO.getUserNumber().toString());
		user.setUserGmailId(userDTO.getUserGmailId());
	 User user2=	 userRepo.save(user);
		return  user2; 
	
}


	public <T> T buyBook(String userId, String bookName) {
		// TODO Auto-generated method stub
		
		User user= userRepo.getById(userId);
		 if (user==null) throw new ResourceNotFoundException(consta.Errro_Please_Check_user +userId);
		
		 List<Books> list = userFromBooks.getBooksData();
		 
		Books book = list.stream().filter(bo -> bo.getTitles().equals(bookName))
				.findFirst().orElse(null);
		 if (book==null) throw new ResourceNotFoundException(consta.Errro_Please_Check_book +bookName);
			
		 
		 List<UserBooksDetails> booksDetails=	 
				 userDetailsRepo.findAll();
//			
			UserBooksDetails booksDetails2=  booksDetails.stream().filter(book2->
									book2.getUserId().equals(user) )
									.findFirst().orElse(null);
			
		 
		 String booksUserget ="";
			if (booksDetails2 != null  ) {
				String str = booksDetails2.getNumberOfbooksId().replace("[","" );
				StringTokenizer stringTokenizer = new StringTokenizer(str.replace("]", ""),",");
				
				String str2 = str.replace("]", "");
				
				while (stringTokenizer.hasMoreElements()) {
					String object =  (String) stringTokenizer.nextElement();
					
					if(object.equals(book.getId()))
						return (T) consta.buy_same_book;
					
					booksUserget = booksUserget.concat(object+" ,");
				}
			}else {
				booksDetails2 =new UserBooksDetails();
				 booksDetails2.setUserId(user);
			}
			booksDetails2.setPurchesdate(new Date());
			
		 booksDetails2.setNumberOfbooksId("["+booksUserget.concat(book.getId()+"]"));
		
		 
		 
		
		return (T) userDetailsRepo.save(booksDetails2);
	}


	
	
}

