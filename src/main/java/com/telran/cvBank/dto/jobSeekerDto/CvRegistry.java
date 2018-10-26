package com.telran.cvBank.dto.jobSeekerDto;
import com.telran.cvBank.dto.CvVeryShortDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CvRegistry extends CvVeryShortDto{
	
	private String cvName;
	private Integer viewCount;
}
