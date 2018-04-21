package com.issueapi.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.issueapi.model.User;
import com.issueapi.service.UserService;

@RestController
@RequestMapping("/api")
public class UserRestController {

	@Autowired
	private UserService userService;

	@GetMapping("/user")
	public List<User> getAllUser() {
		System.out.println(userService.getAllUsers());
		return userService.getAllUsers();
	}

	@GetMapping("/user/{userId}")
	public User findUserById(@PathVariable Integer userId) {
		User user = userService.findUserById(userId);
		if (user == null) {
			return new User();
		}
		System.out.println(userService.findUserById(userId));
		return user;
	}

}
