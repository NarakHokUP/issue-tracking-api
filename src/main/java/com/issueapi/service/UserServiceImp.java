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
		System.out.println("API Service from Controller get  New User b4 save " + user);
		boolean status = userRepository.saveUser(user);
		System.out.println("API Service New User after save and getUserId() from DB= " + user);
		if (status) {
			for (Role role : user.getRoles()) {
				userRepository.saveUserRole(user.getUserId(), role.getRoleid());
			}
			System.out.println(status + "-> Added Successfully!");
		} else {
			System.out.println(status + "-> Added Fail!");
			return false;
		}
		return status;

	}

	@Transactional
	@Override
	public boolean deleteUserByUserId(Integer userId) {
		System.out.println("Deleting User Id= " + userId);
		boolean ustatus = userRepository.deleteUserByUserId(userId);
		boolean urstatus = false;
		if (ustatus) {
			urstatus = userRepository.deleteUserRoleByUserId(userId);
			System.out.println(ustatus + "-> Deleted User Successfully!");
			System.out.println(urstatus + "-> Deleted User Role Successfully!");
		} else {
			System.out.println(ustatus + "-> Deleted User Fail!");
			System.out.println(urstatus + "-> Deleted  User Role Fail!");
			return false;
		}
		return ustatus;

	}

	@Transactional
	@Override
	public boolean updateUserByUserId(User user) {
		boolean status = userRepository.updateUserByUserId(user);
		System.out.println(status + "-> Updating User!" + user);
		boolean dstatus = false, cstatus;
		if (status) {
			dstatus = userRepository.deleteUserRoleByUserId(user.getUserId());
			System.out.println(
					dstatus + "-> Deleted Old User Role User Id= " + user.getUserId() + " Roles: " + user.getRoles());
			for (Role role : user.getRoles()) {
				cstatus = userRepository.saveUserRole(user.getUserId(), role.getRoleid());
				System.out.println(
						cstatus + "-> Created User Role User Id=" + user.getUserId() + " Role Id= " + role.getRoleid());
			}
			System.out.println(status + "-> Updated User with Roles Successfully!");
		} else {
			System.out.println(status + "-> Updated Fail!");
			return false;
		}

		return status;
	}

	@Override
	public User findUserById(Integer userId) {
		return userRepository.findUserById(userId);
	}

	@Override
	public User loadUserByUsername(String username) {
		User user = userRepository.loadUserByUsername(username);
		System.out.println("API loadUser -> " + user);
		return user;
	}

}
