package com.telran.cvBank.dto.jobSeekerDto;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor

public class JobSeekerProfileDto extends JobSeekerDto{
	
	List<JobSeekerCvDto> cvList;
}
