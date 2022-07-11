package com.example.spring.security.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping("/users")
	public List<String> getUserDetails(){
		
		return Arrays.asList("sunil","Kumar","Jakkula");
	}

}
