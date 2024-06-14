package com.example.users.Entity;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.users.UserDTO.Books;
import com.example.users.constant.consta;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Document(consta.User_Books_Details)
public class UserBooksDetails {

	
	@Id
	private String id;
	
	@DBRef
	private User userId;
	
	private Date purchesdate;

	private String numberOfbooksId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public Date getPurchesdate() {
		return purchesdate;
	}

	public void setPurchesdate(Date purchesdate) {
		this.purchesdate = purchesdate;
	}

	public String getNumberOfbooksId() {
		return numberOfbooksId;
	}

	public void setNumberOfbooksId(String numberOfbooksId) {
		this.numberOfbooksId = numberOfbooksId;
	}

	public UserBooksDetails(String id, User userId, Date purchesdate, String numberOfbooksId) {
		super();
		this.id = id;
		this.userId = userId;
		this.purchesdate = purchesdate;
		this.numberOfbooksId = numberOfbooksId;
	}

	public UserBooksDetails() {
		super();
	}

	@Override
	public String toString() {
		return "UserBooksDetails [id=" + id + ", userId=" + userId + ", purchesdate=" + purchesdate
				+ ", numberOfbooksId=" + numberOfbooksId + "]";
	}
	
	
	
}
