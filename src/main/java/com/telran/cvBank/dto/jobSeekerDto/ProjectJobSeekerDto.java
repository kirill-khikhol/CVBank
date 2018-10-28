package com.telran.cvBank.dto.jobSeekerDto;
import com.telran.cvBank.dto.ProjectJobsDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProjectJobSeekerDto extends ProjectJobsDto {
	
	boolean isCompanyVisible;
}
