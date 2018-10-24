package com.telran.cvBank.dto.jobSeekerDto;

import com.telran.cvBank.dto.CvVeryShortDto;


import lombok.Getter;

@Getter
public class CvRegistry extends CvVeryShortDto{
	private String cvName;
	private Integer viewCount;
	
	public CvRegistry(String cvId, String cvName, Integer viewCount) {
		super(cvId);
		this.cvName = cvName;
		this.viewCount = viewCount;
	}
	
	
	

}
