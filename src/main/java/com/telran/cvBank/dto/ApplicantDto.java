package com.telran.cvBank.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ApplicantDto implements Serializable {
	private String firstName;
	private String lastName;
	private String position;
	private String email;
	private String phone;

}
