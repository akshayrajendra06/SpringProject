package com.example.users.Entity;

import org.springframework.data.mongodb.core.mapping.Document;

import com.example.users.constant.consta;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Document(consta.TABLE_NAME_User)
public class User {

	@Id
	private String id;
	
	private String userName;
	
	private String userNumber;
	
	private String userGmailId;
	
}
