package com.telran.cvBank.dto.jobSeekerDto;
import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class JobSeekerCvList implements Serializable {
	
	private Integer currentPage;
	private Integer itemsOnPage;
	private Integer itemsTotal;
	List<JobSeekerCvWrapperDto> cvList;
}
