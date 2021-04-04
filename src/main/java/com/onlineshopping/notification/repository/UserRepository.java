package com.onlineshopping.notification.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.onlineshopping.notification.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
