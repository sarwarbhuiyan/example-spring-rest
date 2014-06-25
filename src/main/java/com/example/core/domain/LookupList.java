package com.example.core.domain;

import java.util.Set;

import org.neo4j.graphdb.Direction;
import org.springframework.data.neo4j.annotation.Indexed;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;
import org.springframework.data.neo4j.support.index.IndexType;

@NodeEntity
public class LookupList extends AbstractIdentity {
	
	@Indexed
	private String name;
	
	@RelatedTo(direction=Direction.OUTGOING, type="LOOKUP_ITEM")
	private Set<LookupListItem> items;

	public Set<LookupListItem> getItems() {
		return items;
	}

	public void setItems(Set<LookupListItem> items) {
		this.items = items;
	}
	
	
}
