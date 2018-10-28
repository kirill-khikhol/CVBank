package com.telran.cvBank.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class UserEntity implements Serializable {
	@Id
	@GeneratedValue
	private Long id;
	private String login;
	private String password;

	public UserEntity(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}
}
