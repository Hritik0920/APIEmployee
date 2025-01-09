package com.Employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ApiEmployeeApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(ApiEmployeeApplication.class, args);
		System.out.println("Appliction running");
	}

}
