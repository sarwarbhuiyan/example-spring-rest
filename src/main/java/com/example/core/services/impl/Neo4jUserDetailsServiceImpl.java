package com.example.core.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.neo4j.template.Neo4jOperations;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import com.example.core.domain.User;
import com.example.core.services.Neo4jUserDetailsService;

@Service
public class Neo4jUserDetailsServiceImpl implements Neo4jUserDetailsService {

	@Autowired private Neo4jOperations template;
	
	@Override
	public boolean supports(Class<?> authentication) {
		 return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}

	@Override
	public Authentication authenticate(Authentication auth)
			throws AuthenticationException {
		GraphRepository<User> userRepository = template.repositoryFor(User.class);
		User user = userRepository.findBySchemaPropertyValue("username", auth.getPrincipal());
		Authentication result = null;
		if(user.getPassword().equals(auth.getCredentials())){
			List<GrantedAuthority> grantedAuths = new ArrayList<GrantedAuthority>();
			//TODO: giving user hardcoded role but will be replaced by reading groups from neo4j and calculating effective roles
			grantedAuths.add(new SimpleGrantedAuthority("ROLE_USER"));
			result = new UsernamePasswordAuthenticationToken(auth.getPrincipal(), auth.getCredentials(), grantedAuths);
		}
		else
		{
			return null;
		}
		return auth;
	}

}
