package com.example.maven_spring_shop.sevices;

import org.springframework.data.repository.CrudRepository;

import com.example.maven_spring_shop.models.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {

}