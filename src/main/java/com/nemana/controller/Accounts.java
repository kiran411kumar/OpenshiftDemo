package com.nemana.controller;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
public class Accounts {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer accountId;
	private String name;
	private String street;
	private String city;
	private String state;
	private String postal;
	private String country;	
	
}
