package com.example.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.core.domain.Account;
import com.example.core.services.AccountService;

/**
 * Example queries controller
 * @author sbhuiyan
 *
 */
@RestController
public class AccountQueriesController {
	
	@Autowired
	private AccountService accountService;

	@RequestMapping("/accounts")
	public @ResponseBody List<Account> getAllAccounts(){
		return null;
	}
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public ResponseEntity<Account> viewAccount(@PathVariable String id)
	{

		return null;
	}
}
