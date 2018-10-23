package com.telran.cvBank.dto.jobSeekerDto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
public class JobSeekerRegistrationRequestDto extends JobSeekerDto{

	private String password;
	
	public JobSeekerRegistrationRequestDto(String firstName, String lastName, String email, String phone, String password) {
		super(firstName, lastName, email, phone);
		this.password = password;
	}

	

}
