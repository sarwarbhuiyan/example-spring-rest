package com.example.core.domain;

import java.util.Set;

import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

@NodeEntity
public class SecurityGroup extends AbstractIdentity {

	private String name;
	
	@RelatedTo(type="MEMBER")
	private Set<User> members;
	
	@RelatedTo(type="ROLE")
	private Set<Role> roles;
	
    /**
	 * @return the members
	 */
	public Set<User> getMembers() {
		return members;
	}

	/**
	 * @param members the members to set
	 */
	public void setMembers(Set<User> members) {
		this.members = members;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String getName() { return this.name; }

}
