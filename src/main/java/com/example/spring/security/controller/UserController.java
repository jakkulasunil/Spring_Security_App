package com.example.spring.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.security.model.User;
import com.example.spring.security.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		return userService.createUser(user);
	}

	@PostMapping("/addUsers")
	public List<User> addUsers(@RequestBody List<User> users) {
		return userService.createUsers(users);
	}

	@GetMapping("/getUsers")
	public List<User> getUsers() {
		return (List<User>) userService.getUsers();
	}

	@GetMapping("/users/{id}")
	public User findById(@PathVariable int id) {

		return userService.findById(id);
	}

	@DeleteMapping("/users/{id}")
	public String deleteUserById(@PathVariable int id) {
		return userService.deleteUser(id);
	}

	@PutMapping("/update")
	public User updateUser(@RequestBody User user) {
		return userService.updateUser(user);

	}
}
