package com.example.core.domain;

import org.springframework.data.neo4j.annotation.NodeEntity;

@NodeEntity
public class BillingInfo extends AbstractIdentity {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
