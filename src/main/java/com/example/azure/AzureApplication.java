package com.example.azure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AzureApplication {
	@GetMapping("/test")
	public String demo(){
		return "welcome to dashboard from azure";
	}

	public static void main(String[] args) {
		SpringApplication.run(AzureApplication.class, args);
	}

}
