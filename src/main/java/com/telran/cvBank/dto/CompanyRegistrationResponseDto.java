package com.telran.cvBank.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CompanyRegistrationResponseDto implements Serializable {
	private String token;
	private CompanyRegistrationRequestDto company;

}
