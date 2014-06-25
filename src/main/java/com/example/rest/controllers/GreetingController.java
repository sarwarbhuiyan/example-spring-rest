package com.example.rest.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.core.domain.Greeting;

@RestController
public class GreetingController {

	@RequestMapping("/greeting")
	public @ResponseBody Greeting greeting(@RequestParam(value="name", required=false, defaultValue="Sarwar") String name){
		return new Greeting(1, "HELLO, "+name);
	}
}
