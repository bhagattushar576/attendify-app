package com.tka.attendify.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AttendifyProApplication {

	public static void main(String[] args) {
		SpringApplication.run(AttendifyProApplication.class, args);
		System.err.println("app started...");
	}
}
