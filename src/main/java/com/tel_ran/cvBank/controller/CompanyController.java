package com.tel_ran.cvBank.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class CompanyController {
	
	@GetMapping
	public String hello() {
		return "Hello";
	}

}
