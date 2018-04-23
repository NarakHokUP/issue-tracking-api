package com.issueapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.issueapi.model.Role;
import com.issueapi.model.User;
import com.issueapi.repository.UserRepository;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getAllUsers() {

		return userRepository.findAll();
	}

	@Transactional
	@Override
	public boolean createUser(User user) {
		boolean status = userRepository.saveUser(user);
		if (status) {
			for (Role role : user.getRoles()) {
				userRepository.saveUserRole(user.getUserId(), role.getRoleid());
			}
			System.out.println("-> Added Successfully!");
		} else {
			System.out.println("-> Added Fail!");
			return false;
		}
		return status;

	}

	@Override
	public boolean removeUser(Integer userId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User findUserById(Integer userId) {
		return userRepository.findUserById(userId);
	}

}
