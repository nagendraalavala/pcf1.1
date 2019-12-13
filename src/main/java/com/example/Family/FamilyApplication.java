package com.example.Family;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class FamilyApplication {

	public static void main(String[] args) {
		SpringApplication.run(FamilyApplication.class, args);
	}


}
