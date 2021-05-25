package com.nemana.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("acc")
public class JbossExternalDBContronoller {
	
	@GetMapping
	public String sayHello() 
	{
		return "Hello from kiran";
	}
	
	@GetMapping("/all")
	public List<Accounts> getAllAccounts() {
		return new ArrayList<Accounts>();
	}

}
