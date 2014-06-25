package com.example.core.domain;

import org.springframework.data.neo4j.annotation.NodeEntity;

@NodeEntity
public class LookupListItem extends AbstractIdentity {

	private String value;

	private String displayValue;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getDisplayValue() {
		return displayValue;
	}

	public void setDisplayValue(String displayValue) {
		this.displayValue = displayValue;
	}

}
