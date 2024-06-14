package com.example.users.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.users.Entity.User;

public interface UserRepo extends MongoRepository<User, String> {

	User getById(String Id);

	

}
