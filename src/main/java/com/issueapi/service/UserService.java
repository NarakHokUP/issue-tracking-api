package com.issueapi.service;

import java.util.List;

import com.issueapi.model.User;

public interface UserService {
	public List<User> getAllUsers();

	public User searchById(Integer id);

	public boolean createUser(User user);

	public boolean removeUser(Integer id);

	public boolean updateUser(User user);

}
