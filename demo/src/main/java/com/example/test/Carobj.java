package com.example.test;

import java.lang.reflect.Array;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Carobj {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Car cr = new Car("Audi", 6789990, 36, "Amu");
		Car cr1 = new Car("BMW", 4579990, 38, "UUU");
		Car cr2 = new Car("Maruti",257000, 56, "VVV");
	
	System.out.println(cr);
	System.out.println(cr1);
	System.out.println(cr2);
		
	}

}
