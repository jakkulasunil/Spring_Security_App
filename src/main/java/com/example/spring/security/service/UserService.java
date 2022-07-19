package com.example.spring.security.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.security.model.User;
import com.example.spring.security.repo.UserRepository;

@Service
public class UserService {

	@Autowired
	private	UserRepository userRepository;

	public User createUser(User user) {
		return userRepository.save(user);
	}

	public List<User> createUsers(List<User> users) {
		return (List<User>) userRepository.saveAll(users);
	}
	
	public User updateUser(User user) {
		User existingUser = userRepository.findById(user.getId()).orElse(null);
		existingUser.setPhoneNumber(user.getPhoneNumber());
		existingUser.setAge(user.getAge());
		existingUser.setEmail(user.getEmail());
		existingUser.setUserName(user.getUserName());
		existingUser.setAddress(user.getAddress());
		return userRepository.save(existingUser);

	}
	
	public String deleteUser(int id) {
		userRepository.deleteById(id);
		return "Deleted Id Successfully..!!";
	}

	
	public Collection<User> getUsers() {
		return (Collection<User>) userRepository.findAll();
	}
	
	public User findById(int id) {
		return userRepository.findById(id).orElse(null);
	}
	
	

}
