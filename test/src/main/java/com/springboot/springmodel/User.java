package com.springboot.springmodel;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

@Entity
public class User {
	@Id
	String userName;
	String Password;
	String Email;
	
	public User(){
		
	}
	
	public User(String userName, String password, String email) {
		
		this.userName = userName;
		this.Password = password;
		this.Email = email;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}



	
	

}

