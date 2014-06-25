package com.example.core.domain;

import java.util.Set;

import org.springframework.data.neo4j.annotation.Indexed;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;
import org.springframework.data.neo4j.support.index.IndexType;

@NodeEntity
public class ProductTemplate extends AbstractIdentity {

	@Indexed
	private String name;
	
	@RelatedTo(type="MANDATORY_ATTRIBUTE")
	private Set<ObjectAttribute> attributes;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<ObjectAttribute> getAttributes() {
		return attributes;
	}

	public void setAttributes(Set<ObjectAttribute> attributes) {
		this.attributes = attributes;
	}
	
	
}
