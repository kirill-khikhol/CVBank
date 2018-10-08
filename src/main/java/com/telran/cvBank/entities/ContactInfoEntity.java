package com.telran.cvBank.entities;

import java.time.LocalDate;

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
public class ContactInfoEntity {
	private String residece;
	private LocalDate birthday;
	private String phone;
	private String email;
	private String linkedIn;
}
