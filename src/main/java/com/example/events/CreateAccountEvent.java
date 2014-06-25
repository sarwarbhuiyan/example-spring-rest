package com.example.events;

import com.example.core.domain.Account;

public class CreateAccountEvent {

	private Account account;
	
	public CreateAccountEvent(Account account) {
		this.account = account;
	}
	
	public Account getAccount(){
		return this.account;
	}
}
