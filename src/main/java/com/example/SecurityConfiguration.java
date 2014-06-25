package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;

import com.example.core.services.impl.UserRepositoryImpl;

@EnableWebMvcSecurity
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	protected AuthenticationProvider authenticationProvider;

	@Autowired
	protected void configureGlobal(AuthenticationManagerBuilder auth)
			throws Exception {
		// hardcoded users for now
		auth.inMemoryAuthentication().withUser("superuser")
				.password("superuser").roles("ADMIN");
		auth.inMemoryAuthentication().withUser("user").password("user")
				.roles("USER");
		auth.authenticationProvider(authenticationProvider);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// url authorization rules here
		http.authorizeRequests().antMatchers("/**").hasRole("ADMIN")
				.anyRequest().anonymous().and().httpBasic();
	}
}