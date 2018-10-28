package com.telran.cvBank.dto.jobSeekerDto;
import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CvRegistryListDto implements Serializable{
	
	private List<CvRegistry> cvList;
}

