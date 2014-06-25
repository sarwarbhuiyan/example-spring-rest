package com.example.core.domain;

import java.util.Set;

import org.springframework.data.neo4j.annotation.Indexed;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

import com.example.core.domain.AbstractIdentity;

/**
 * Model object for the account (billing entity) which has
 * the relationship with the root application
 * 	
 * @author sbhuiyan
 *
 */
@NodeEntity
public class Account extends AbstractIdentity {

	@Indexed
	private String name;
	
	@RelatedTo(type="OWNER")
	private User owner;
	
	@RelatedTo(type="SERVICE_INSTANCE")
	private Set<ServiceInstance> serviceInstances;
		
	@RelatedTo(type="BILLING_INFO")
	private BillingInfo billingInfo;

	public User getOwner() {
		return owner;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	public Set<ServiceInstance> getServiceInstances() {
		return serviceInstances;
	}

	public void setServiceInstances(Set<ServiceInstance> serviceInstances) {
		this.serviceInstances = serviceInstances;
	}

	public BillingInfo getBillingInfo() {
		return billingInfo;
	}

	public void setBillingInfo(BillingInfo billingInfo) {
		this.billingInfo = billingInfo;
	}
}
