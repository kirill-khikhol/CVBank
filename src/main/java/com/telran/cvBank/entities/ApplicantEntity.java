package com.telran.cvBank.entities;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ApplicantEntity {
	private String firstName;
	private String lastName;
	private String position;
	private String email;
	private String phone;
}
