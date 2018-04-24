/*package com.issueapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.issueapi.model.User;
import com.issueapi.repository.UserRepository;
@Service
public class UserDetailServiceImp implements UserDetailsService {

	
	@Autowired
	private UserRepository userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {	
		User user = userRepo.loadUserByUsername(username);
		System.out.println(user);
		return user;
	}
	
}
*/