package com.example.test;

public class Student {
	private  int studentId;
	private String studentname;
	private String  studentAdress;
	

	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(int studentId, String studentname, String studentAdress) {
		super();
		this.studentId = studentId;
		this.studentname = studentname;
		this.studentAdress = studentAdress;
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentAdress() {
		return studentAdress;
	}
	public void setStudentAdress(String studentAdress) {
		this.studentAdress = studentAdress;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentname=" + studentname + ", studentAdress=" + studentAdress
				+ "]";
	}

	

}
