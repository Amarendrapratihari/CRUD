package com.springboot.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.Model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Integer> {
	
	
	
	Optional<UserModel>findByLoginAndPassword(String login, String password);

}
