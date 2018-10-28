package com.telran.cvBank.dto.jobSeekerDto;
import com.telran.cvBank.dto.EducationDto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor

public class EducationJobSeekerDto extends EducationDto {
	
	boolean isEducationVisible = true;
}
