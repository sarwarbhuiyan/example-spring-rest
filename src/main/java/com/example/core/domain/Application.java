package com.example.core.domain;

import java.util.Map;

import org.springframework.data.neo4j.annotation.Indexed;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

@NodeEntity
public class Application extends AbstractIdentity {

	@Indexed
	private String name;
	
	//will need to be stored as properties using DynamicAttributes or something in Neo4j
	private Map<String,Object> attributes;
	
	@RelatedTo(type="INSTANCE_OF")
	private ApplicationTemplate template;

	public Map<String, Object> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, Object> attributes) {
		this.attributes = attributes;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ApplicationTemplate getTemplate() {
		return template;
	}

	public void setTemplate(ApplicationTemplate template) {
		this.template = template;
	}
	
}
