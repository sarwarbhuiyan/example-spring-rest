package com.example.core.domain;

import java.util.Set;

import org.neo4j.graphdb.Direction;
import org.springframework.data.neo4j.annotation.Indexed;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

@NodeEntity
public class ServiceInstance extends AbstractIdentity {

	@Indexed(unique=true)
	private String name;
	
	@RelatedTo(type="PRODUCT_CATEGORY")
	private Set<ProductCategory> productCategories;
	
	@RelatedTo(type="PRODUCT_TEMPLATE")
	private Set<ProductTemplate> productTemplates;
	
	@RelatedTo(type="PRODUCT")
	private Set<Product> products;

	@RelatedTo(type="APPLICATION_TEMPLATE")
	private Set<ApplicationTemplate> applicationTemplates;
	
	@RelatedTo(type="APPLICATION")
	private Set<Application> applications;
 	
	@RelatedTo(type="LOOKUP_LIST")
	private Set<LookupList> lookupLists;
	
	@RelatedTo(type="SECURITY_GROUP")
	private Set<SecurityGroup> userGroups;
	
	@RelatedTo(type="USER")
	private Set<User> users;
	

	/**
	 * @return the userGroups
	 */
	public Set<SecurityGroup> getUserGroups() {
		return userGroups;
	}

	/**
	 * @param userGroups the userGroups to set
	 */
	public void setUserGroups(Set<SecurityGroup> userGroups) {
		this.userGroups = userGroups;
	}

	/**
	 * @return the users
	 */
	public Set<User> getUsers() {
		return users;
	}

	/**
	 * @param users the users to set
	 */
	public void setUsers(Set<User> users) {
		this.users = users;
	}

	/**
	 * @return the productCategories
	 */
	public Set<ProductCategory> getProductCategories() {
		return productCategories;
	}

	/**
	 * @param productCategories
	 *            the productCategories to set
	 */
	public void setProductCategories(Set<ProductCategory> productCategories) {
		this.productCategories = productCategories;
	}

	public Set<ProductTemplate> getProductTemplates() {
		return productTemplates;
	}

	public void setProductTemplates(Set<ProductTemplate> productTemplates) {
		this.productTemplates = productTemplates;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	public Set<ApplicationTemplate> getApplicationTemplates() {
		return applicationTemplates;
	}

	public void setApplicationTemplates(
			Set<ApplicationTemplate> applicationTemplates) {
		this.applicationTemplates = applicationTemplates;
	}

	public Set<Application> getApplications() {
		return applications;
	}

	public void setApplications(Set<Application> applications) {
		this.applications = applications;
	}

	/**
	 * @return the lookupLists
	 */
	public Set<LookupList> getLookupLists() {
		return lookupLists;
	}

	/**
	 * @param lookupLists
	 *            the lookupLists to set
	 */
	public void setLookupLists(Set<LookupList> lookupLists) {
		this.lookupLists = lookupLists;
	}

	public String getName() {
		return name;
	};

	public void setName(String name) {
		this.name = name;
	}
}
