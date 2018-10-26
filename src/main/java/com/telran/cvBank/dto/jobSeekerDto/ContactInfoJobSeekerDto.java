package com.telran.cvBank.dto.jobSeekerDto;
import com.telran.cvBank.dto.ContactInfoDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ContactInfoJobSeekerDto extends ContactInfoDto {
	
	boolean isResidenceVisible = true;
	boolean isBirthdayVisible = true;
	boolean isPhoneVisible = true;
	boolean isEmailVisible = true;
	boolean isLinkedInVisible = true;
}
