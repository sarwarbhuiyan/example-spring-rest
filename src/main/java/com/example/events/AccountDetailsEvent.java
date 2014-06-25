package com.example.events;

import com.example.core.domain.Account;

public class AccountDetailsEvent {

	private Account account;
	
	public AccountDetailsEvent(Account account){
		this.account = account;
	}
	
	public boolean isEntityFound(){
		return this.account != null;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
}
