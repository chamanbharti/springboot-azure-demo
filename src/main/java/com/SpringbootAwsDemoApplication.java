package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootAwsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAwsDemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String sayHello() {
		return "Welcome to dockerization world! Your app deployed successfully in Azure Platform!!";
	}
}
