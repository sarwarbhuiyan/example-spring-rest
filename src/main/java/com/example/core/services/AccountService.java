package com.example.core.services;

import com.example.events.AccountCreatedEvent;
import com.example.events.AccountDetailsEvent;
import com.example.events.CreateAccountEvent;
import com.example.events.RequestAccountEvent;

public interface AccountService {

	public AccountCreatedEvent createAccount(
			CreateAccountEvent createAccountEvent);

	public AccountDetailsEvent getAccount(
			RequestAccountEvent accountRequestEvent);
}
