package com.kdu.assigment1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Assignment1Application {

	public static void main(String[] args) {
		SpringApplication.run(Assignment1Application.class, args);
	}
	@RestController
	class HelloController {
		@GetMapping("/")
		public String index() {
			return "Hey there, Sanskar FOund! :)";
		}
	}
}
