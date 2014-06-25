package com.example.core.services;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

public interface Neo4jUserDetailsService extends AuthenticationProvider {
	@Override
	public Authentication authenticate(Authentication auth)
			throws AuthenticationException;

}
