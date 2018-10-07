package com.telran.cvBank.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CompanyProfileDto implements Serializable {
	private String companyName;
	private String webSite;
	private AddressDto address;
	private ApplicantDto applicant;
}
