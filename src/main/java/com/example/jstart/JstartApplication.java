package com.example.jstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JstartApplication {

	public static void main(String[] args) {

		System.out.println("Hello Anuj, this is just print statement to check its build");
		SpringApplication.run(JstartApplication.class, args);
	}

}
