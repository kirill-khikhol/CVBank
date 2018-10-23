package com.telran.cvBank.dto.jobSeekerDto;

import java.io.Serializable;
import java.util.Set;

import lombok.Getter;
@Getter
public class JobSeekerProfileDto extends JobSeekerDto{
	
	Set<JobSeekerCvDto> cvList;

	public JobSeekerProfileDto(String firstName, String lastName, String email, String phone,
			Set<JobSeekerCvDto> cvList) {
		super(firstName, lastName, email, phone);
		this.cvList = cvList;
	}
	
	
	

}
