package com.example.core.domain;

import java.util.Set;

import org.springframework.data.neo4j.annotation.NodeEntity;

@NodeEntity
public class Role extends AbstractIdentity {

	private String name;
	
	private Set<Permission> permissions;
	
	private Set<Object> objects; 

	public Set<Object> getObjects() {
		return objects;
	}

	public void setObjects(Set<Object> objects) {
		this.objects = objects;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(Set<Permission> permissions) {
		this.permissions = permissions;
	}
	
	
}
