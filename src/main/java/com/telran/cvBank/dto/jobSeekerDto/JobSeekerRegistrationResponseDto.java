package com.telran.cvBank.dto.jobSeekerDto;

import lombok.Getter;

@Getter
public class JobSeekerRegistrationResponseDto extends JobSeekerDto{
	
	private String token;
	
	public JobSeekerRegistrationResponseDto(String firstName, String lastName, String email, String phone, String token) {
		super(firstName, lastName, email, phone);
		this.token = token;
	}

	
	
	

}
