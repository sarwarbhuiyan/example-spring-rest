package com.example.events;

public class RequestAccountEvent {

	private String id;
	
	public RequestAccountEvent(String id){
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}
