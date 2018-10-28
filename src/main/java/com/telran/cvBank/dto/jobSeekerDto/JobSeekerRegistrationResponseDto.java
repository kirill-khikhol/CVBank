package com.telran.cvBank.dto.jobSeekerDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class JobSeekerRegistrationResponseDto extends JobSeekerDto{
	
	private String token;
}
