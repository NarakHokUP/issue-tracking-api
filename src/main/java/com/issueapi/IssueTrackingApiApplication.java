package com.issueapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.issueapi.model.User;
import com.issueapi.repository.UserRepository;

@SpringBootApplication
public class IssueTrackingApiApplication{
//	implements ApplicationRunner {


	public static void main(String[] args) {
		SpringApplication.run(IssueTrackingApiApplication.class, args);
	}

	// @Autowired
	// UserRepository userRepository;
	//
	// @Override
	// public void run(ApplicationArguments arg0) throws Exception {
	//
	// User user = userRepository.loadUserByUsername("admin");
	// System.out.println(user);
	//
	// }
}
