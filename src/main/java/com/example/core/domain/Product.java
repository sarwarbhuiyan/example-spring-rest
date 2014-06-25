package com.example.core.domain;

import java.util.Map;

import org.neo4j.graphdb.Direction;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

@NodeEntity
public class Product extends AbstractIdentity {
	
	//will need to be stored as properties using DynamicAttributes or something in Neo4j
	private Map<String,Object> attributes;
	
	@RelatedTo(direction=Direction.OUTGOING)
	private ProductTemplate product;
	
	public Map<String, Object> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, Object> attributes) {
		this.attributes = attributes;
	}

	/**
	 * @return the product
	 */
	public ProductTemplate getProduct() {
		return product;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(ProductTemplate product) {
		this.product = product;
	}


}
