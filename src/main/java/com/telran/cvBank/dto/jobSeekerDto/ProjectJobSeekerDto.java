package com.telran.cvBank.dto.jobSeekerDto;

import java.time.LocalDate;

import com.telran.cvBank.dto.ProjectJobsDto;

import lombok.Getter;
@Getter
public class ProjectJobSeekerDto extends ProjectJobsDto {
	
	boolean isCompanyVisible;

	public ProjectJobSeekerDto(String company, String position, Integer backEndFrontEndRatio, LocalDate startDate,
			LocalDate endDate, String projectDescription, boolean isCompanyVisible) {
		super(company, position, backEndFrontEndRatio, startDate, endDate, projectDescription);
		this.isCompanyVisible = isCompanyVisible;
	}
	
	

}
