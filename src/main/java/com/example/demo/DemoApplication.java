package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {

	private final int age = 18;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


}
