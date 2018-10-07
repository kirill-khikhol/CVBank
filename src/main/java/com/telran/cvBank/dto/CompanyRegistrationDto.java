package com.telran.cvBank.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CompanyRegistrationDto implements Serializable {
	private String token;
	private CompanyProfileDto company;

}
