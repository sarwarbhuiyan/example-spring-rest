package com.example.core.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.neo4j.support.Neo4jTemplate;
import org.springframework.stereotype.Service;

import com.example.core.domain.Account;
import com.example.core.services.AccountService;
import com.example.events.AccountCreatedEvent;
import com.example.events.AccountDetailsEvent;
import com.example.events.CreateAccountEvent;
import com.example.events.RequestAccountEvent;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private Neo4jTemplate template;
	
	@Override
	public AccountCreatedEvent createAccount(
			CreateAccountEvent createAccountEvent) {
		//do other lookups, logic here. separating out into events and domain
		//classes helps in adding in other data or concerns in the operation
		//which are not the resource itself.
		Account account = template.save(createAccountEvent.getAccount());

		return new AccountCreatedEvent(account);
	}

	@Override
	public AccountDetailsEvent getAccount(RequestAccountEvent requestAccountEvent) {
		GraphRepository<Account> accountRepository = template.repositoryFor(Account.class);
		Account account = accountRepository.findOne(Long.getLong(requestAccountEvent.getId()));
		AccountDetailsEvent accountDetailsEvent = new AccountDetailsEvent(account);
		return accountDetailsEvent;
	}

}
