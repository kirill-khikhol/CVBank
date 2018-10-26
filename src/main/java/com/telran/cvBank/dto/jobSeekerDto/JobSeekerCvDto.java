package com.telran.cvBank.dto.jobSeekerDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class JobSeekerCvDto extends JobSeekerOriginCvDto{
	private Integer viewCount;
}
