package com.telran.cvBank.dto.jobSeekerDto;

import com.telran.cvBank.dto.TitleDto;

public class TitleJobSeekerDto extends TitleDto {

	boolean isFirstNameVisible = true;
	boolean isLastNameVisible = true;
	
	public TitleJobSeekerDto(String firstName, String lastName, boolean isFirstNameVisible, boolean isLastNameVisible) {
		super(firstName, lastName);
		this.isFirstNameVisible = isFirstNameVisible;
		this.isLastNameVisible = isLastNameVisible;
	}
	

}
