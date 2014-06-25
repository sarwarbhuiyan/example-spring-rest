package com.example.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.core.domain.Account;
import com.example.core.services.AccountService;
import com.example.events.AccountCreatedEvent;
import com.example.events.CreateAccountEvent;

/**
 * Example command controller
 * 
 * @author sbhuiyan
 *
 */
@Controller
@RequestMapping("/accounts")
public class AccountCommandsController {

	@Autowired
	private AccountService accountService;

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Account> createOrder(@RequestBody Account account,
			UriComponentsBuilder builder) {



		return null;
	}
}
