package com.telran.cvBank.dto.jobSeekerDto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class JobSeekerDto implements Serializable{
	
	private String firstName;
	private String lastName;
	private String email;
	private String phone;

}
