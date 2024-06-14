package com.example.users.UserDTO;

import com.example.users.Entity.User;
import com.example.users.constant.consta;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
//@ToString
public class UserDTO {

	
	@NotEmpty
	@Size(min = 2, message = consta.User_Name_message)
	private String userName;
	
	@NotNull(message = consta.User_Number_NotNull_message)
	@Min(value = 10, message =consta.User_Number_Min_message )
	@Max(value = 12, message = consta.User_Number_Max_message)
	private Long userNumber;
	
	@NotEmpty
	@Email
    @Size(min =6,max=20,message =consta.User_Name_Email_message)
	private String userGmailId;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Long getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(Long userNumber) {
		this.userNumber = userNumber;
	}

	public String getUserGmailId() {
		return userGmailId;
	}

	public void setUserGmailId(String userGmailId) {
		this.userGmailId = userGmailId;
	}

	public UserDTO(@NotEmpty @Size(min = 2, message = "user name should have at least 2 characters") String userName,
			@NotNull(message = "User number cannot be null") @Min(value = 10, message = "User number must be greater than or equal to 10") @Max(value = 12, message = "User number must be less than or equal to 12") Long userNumber,
			@NotEmpty @Email @Size(min = 6, max = 20, message = "emaild id must be valid") String userGmailId) {
		super();
		this.userName = userName;
		this.userNumber = userNumber;
		this.userGmailId = userGmailId;
	}

	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
