package com.springboot.springcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.springmodel.User;
import com.springboot.springservice.Service;

@RestController
@RequestMapping("/user")
public class Controller {
	
	@Autowired
	private Service service;
	
   //all users
	@GetMapping("/")
	public List<User> getAllUser()
	{
		return this.service.getallUsers();
		
		
	}
	
	//return single user
	@GetMapping("/{userName}")
	public User getUser(@PathVariable("userName") String userName) {
		return this.service.getUser(userName);
	}
	
	@PostMapping("/")
	public User add(@RequestBody User user) {
		return this.service.addUser(user);
	}
}

