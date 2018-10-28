package com.telran.cvBank.dto.jobSeekerDto;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class JobSeekerWrapperDto implements Serializable {
	
	private JobSeekerDto jobSeeker;
}
