package com.nemana.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nemana.entity.Accounts;
import com.nemana.service.SimpleAppService;

@RestController
@RequestMapping("/simple")
public class SimpleDBController {
	
	@Autowired
	private SimpleAppService simpleAppService;
	
	@GetMapping
	public String sayHello() {
		return "Hello World from kiran";
	}
	
	@GetMapping("/all") 
	public List<Accounts> getAllAccounts(){
	
		return simpleAppService.getAllAccounts();
	}

}
