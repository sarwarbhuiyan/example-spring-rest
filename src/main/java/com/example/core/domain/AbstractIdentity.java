package com.example.core.domain;

import org.springframework.data.neo4j.annotation.GraphId;

public abstract class AbstractIdentity {

	@GraphId
	private Long id;
	
	public Long getId() { return this.id; }
}
