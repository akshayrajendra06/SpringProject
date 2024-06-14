package com.example.users.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.users.Entity.UserBooksDetails;

public interface UserDetailsRepo extends MongoRepository<UserBooksDetails, String> {

}
