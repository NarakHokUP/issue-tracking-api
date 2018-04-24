package com.issueapi.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@PostMapping("/user")
	public boolean createUser(@RequestBody User user){
		System.out.println("API get user from Client B4 Create"+user);
		boolean b=userService.createUser(user);
		if(b==false){
			return false;
		}
		System.out.println(b +" Created "+user);
		return b;
	}
	@PutMapping("/user")
	public boolean updateUserByUserId(@RequestBody User user){
		System.out.println("API get user from Client B4 Update"+user);
		boolean b=userService.updateUserByUserId(user);
		if(b==false){
			return false;
		}
		System.out.println(b +" Updated "+user);
		return b;
	}
	@DeleteMapping("/user/remove")
	public boolean deleteUserByUserId(@RequestParam("userId") Integer userId){
		boolean b=userService.deleteUserByUserId(userId);
		if(b==false){
			return false;
		}
		System.out.println(b +" API Controller Deleted "+userId);
		return b;
	}
}
