package com.example.test;

public class HelloWord {
	private String message;

	public void setMessage(String message) {
		this.message  = message;
	}

	public String getMessage() {
	 return message;
	}

	@Override
	public String toString() {
		return "HelloWord [message=" + message + "]";
	}

	
	
}
