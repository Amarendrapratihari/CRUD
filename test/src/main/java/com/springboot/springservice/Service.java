package com.springboot.springservice;

import java.util.ArrayList;

import java.util.List;

import com.springboot.springmodel.User;

@org.springframework.stereotype.Service
public class Service {
	
	
	List<User> list = new ArrayList<>();
	
	
	public Service() {
	list.add(new User("abc","abc","ABC@gmail.com"));
	list.add(new User("xyz","xyz","XYZ@gmail.com"));
	}
	//get all users
	
	public List<User> getallUsers(){
		return this.list;
	}
	// get single user
	
	public User getUser(String userName) {
		return this.list.stream().filter((User)->User.getUserName().equals(userName)).findAny().orElse(null);
		
	}
	
	//Add new users
	public User addUser(User user) {
		this.list.add(user);
		return user;
		
		
	}
	
	
	}


