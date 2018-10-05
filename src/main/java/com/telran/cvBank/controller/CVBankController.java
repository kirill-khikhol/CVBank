package com.telran.cvBank.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class CVBankController {
	
	@GetMapping
	public String hello() {
		return "<h1>Hello</h1>";
	}

}
