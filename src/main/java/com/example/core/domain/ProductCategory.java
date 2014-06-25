package com.example.core.domain;

import java.util.Set;

import org.springframework.data.neo4j.annotation.Indexed;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;
import org.springframework.data.neo4j.support.index.IndexType;

@NodeEntity
public class ProductCategory extends AbstractIdentity {

	@Indexed
	private String name;
	@RelatedTo
	private Set<ProductCategory> subCategories;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<ProductCategory> getSubCategories() {
		return subCategories;
	}

	public void setSubCategories(Set<ProductCategory> subCategories) {
		this.subCategories = subCategories;
	}


}
