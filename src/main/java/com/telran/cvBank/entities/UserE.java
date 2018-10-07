package com.telran.cvBank.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserE {
	@Id
	@GeneratedValue
	private Long id;
	private String login;
	private String password;
}
