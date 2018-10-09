package com.telran.cvBank.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserEntity {
	@Id
	@GeneratedValue
	private long id;
	private String login;
	private String password;

	public UserEntity(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}
}
