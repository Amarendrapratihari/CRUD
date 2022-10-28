package com.student.model;

import java.util.HashSet;
import java.util.Set;

import javax.management.relation.Role;





public class AdminStudent{
	private Long studentId;
	private String studentReg;
	private String password;
	
	private Set<Role> roles = new HashSet<>();
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public String getStudentReg() {
		return studentReg;
	}
	public void setStudentReg(String studentReg) {
		this.studentReg = studentReg;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
