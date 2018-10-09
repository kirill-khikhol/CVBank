package com.telran.cvBank.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CompanyRegistrationRequestDto {
	private String companyName;
	private String webSite;
	private AddressDto address;
	private ApplicantDto applicant;
	private String password;
}
