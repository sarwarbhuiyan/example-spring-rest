package com.example.events;

import com.example.core.domain.Account;

public class AccountCreatedEvent {

	private Account account;
	
	public AccountCreatedEvent(Account accountt){
		this.account = account;
	}
	
	
	public Account getAccount(){
		return this.account;
	}
	
}
