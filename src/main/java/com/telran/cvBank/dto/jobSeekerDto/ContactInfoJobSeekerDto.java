package com.telran.cvBank.dto.jobSeekerDto;

import java.time.LocalDate;

import com.telran.cvBank.dto.ContactInfoDto;

import lombok.Getter;
@Getter
public class ContactInfoJobSeekerDto extends ContactInfoDto {
	
	boolean isResidenceVisible;
	boolean isBirthdayVisible;
	boolean isPhoneVisible;
	boolean isEmailVisible;
	boolean isLinkedInVisible;
	public ContactInfoJobSeekerDto(String residence, LocalDate birthday, String phone, String email, String linkedIn,
			boolean isResidenceVisible, boolean isBirthdayVisible, boolean isPhoneVisible, boolean isEmailVisible,
			boolean isLinkedInVisible) {
		super(residence, birthday, phone, email, linkedIn);
		this.isResidenceVisible = isResidenceVisible;
		this.isBirthdayVisible = isBirthdayVisible;
		this.isPhoneVisible = isPhoneVisible;
		this.isEmailVisible = isEmailVisible;
		this.isLinkedInVisible = isLinkedInVisible;
	}
	
	
	
	
	

}
