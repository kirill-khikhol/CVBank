package com.telran.cvBank.entities;

import java.io.Serializable;
import java.time.LocalDate;

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
public class ContactInfoEntity implements Serializable{
	@Id
	@GeneratedValue
	private long id;
	private String residece;
	private LocalDate birthday;
	private String phone;
	private String email;
	private String linkedIn;
}
