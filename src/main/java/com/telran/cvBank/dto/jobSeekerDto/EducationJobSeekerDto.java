package com.telran.cvBank.dto.jobSeekerDto;

import java.time.LocalDate;

import com.telran.cvBank.dto.EducationDto;

import lombok.Getter;
@Getter
public class EducationJobSeekerDto extends EducationDto {
	
	boolean isEducationVisible;

	public EducationJobSeekerDto(String schoolInstitutionName, String degree, LocalDate graduationYear, String location,
			String details, boolean isEducationVisible) {
		super(schoolInstitutionName, degree, graduationYear, location, details);
		this.isEducationVisible = isEducationVisible;
	}
}
