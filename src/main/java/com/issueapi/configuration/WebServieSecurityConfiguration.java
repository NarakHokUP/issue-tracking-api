package com.issueapi.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

//enable web security
@Configuration
@EnableWebSecurity
public class WebServieSecurityConfiguration extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
			.withUser("admin").password("admin").roles("ADMIN")
			.and()
			.withUser("user").password("user").roles("USER");
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//redirect user to formLogin if user trying to access protected resource
		//http.formLogin();
		http.formLogin()
			.loginPage("/login");
		//make user can logout by type /logout after root url
		http.logout()
			.logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
		
		//Enable Basic Web Security authentication
		http.httpBasic();
		//disable token generate from server for client that don't have token like mobile for web service
		http.csrf().disable();
		//secure end point URL
		http.authorizeRequests()
			.antMatchers("/api/**").hasRole("ADMIN");
		// API not Store Session or anything that is STATELESS API
		http.sessionManagement()
			.sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	}
}
