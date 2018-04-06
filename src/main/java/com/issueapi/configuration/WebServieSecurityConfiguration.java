package com.issueapi.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

//enable web security
@Configuration
@EnableWebSecurity
public class WebServieSecurityConfiguration extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
			.withUser("admin").password("admin").roles("ADMIN");
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//Enable Basic Web Security authentication
		http.httpBasic();
		//disable token generate from server for client that don't have token like mobile for web service
		http.csrf().disable();
		//secure endpoint URL
		http.authorizeRequests()
			.antMatchers("/api/**").hasRole("ADMIN");
		// API not Store Session or anything that is STATELESS API
		http.sessionManagement()
			.sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	}
}
