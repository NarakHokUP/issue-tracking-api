package com.issueapi.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.issueapi.model.User;
import com.issueapi.service.UserService;

@RestController
public class UserRestController {

	@Autowired
	private UserService userService;

	@GetMapping("/user")
	public List<User> getAllRoles() {
		System.out.println(userService.getAllUsers());
		return userService.getAllUsers();
	}

}
