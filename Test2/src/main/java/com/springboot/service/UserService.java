package com.springboot.service;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.Model.UserModel;
import com.springboot.repository.UserRepository;

@Service 
public class UserService {

	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
		
	}
	
	public UserModel registerUser(String login, String password,String email) {
		if(login!= null || password!= null) {
			return null;
		}else {
			UserModel userModel = new UserModel();
			userModel.setLogin(login);
			userModel.setPassword(password);
			userModel.setEmail(email);
			return userRepository.save(userModel);
		}
		
	}
	
	
	public UserModel autentication(String login , String password) {
		return userRepository.findByLoginAndPassword(login, password).orElse(null);
	}

}
