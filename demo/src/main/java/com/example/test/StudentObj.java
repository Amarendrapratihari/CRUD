package com.example.test;


	import org.springframework.boot.SpringApplication;
	import org.springframework.boot.autoconfigure.SpringBootApplication;

	@SpringBootApplication
	public class StudentObj {

		public static void main(String[] args) {
			SpringApplication.run(DemoApplication.class, args);
			
			Student st = new Student(100, "Amarendra", "Bangalore");
			/*
			 * st.setStudentId(01); st.setStudentname("rohit");
			 * st.setStudentAdress("Bangalore");
			 */
			System.out.println(st);
			
		}

	}


