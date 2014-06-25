package com.example.core.domain;

import org.springframework.data.neo4j.annotation.Indexed;

public class Permission extends AbstractIdentity {

	@Indexed
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
