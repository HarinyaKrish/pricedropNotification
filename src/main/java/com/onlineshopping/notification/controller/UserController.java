package com.onlineshopping.notification.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlineshopping.notification.model.User;
import com.onlineshopping.notification.service.UserService;

@RestController
@RequestMapping("/notification")
public class UserController {

	@Autowired
	private UserService userservice;

	@GetMapping("/users")
	public List<User> showUsers() {
		return userservice.showUsers();
	}

	@PostMapping("/saveusers")
	public ResponseEntity<String> insertUser(@Valid @RequestBody User user) {
		Boolean status;

		status = userservice.saveUsers(user);
		if (status == true)
			return ResponseEntity.ok("User is valid");
		else
			return ResponseEntity.ok("User is not valid");

	}

}
