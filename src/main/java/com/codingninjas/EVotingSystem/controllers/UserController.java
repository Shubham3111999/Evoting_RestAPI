package com.codingninjas.EVotingSystem.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codingninjas.EVotingSystem.entities.User;
import com.codingninjas.EVotingSystem.services.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	
	@PostMapping("/add/user")
	private User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	
	@GetMapping("/get/users")
	private List<User> getAllUsers(){
		return userService.getAllUsers();
	}
}
