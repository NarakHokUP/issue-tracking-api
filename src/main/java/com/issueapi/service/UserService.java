package com.issueapi.service;

import java.util.List;

import com.issueapi.model.User;

public interface UserService {
	public List<User> getAllUsers();

	public User findUserById(Integer userId);

	public boolean createUser(User user);

	public boolean removeUser(Integer userId);

	public boolean updateUser(User user);

}
