package com.telran.cvBank.dto;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor

public class EducationDto implements Serializable{
	
	private String schoolInstitutionName;
	private String degree;
	private LocalDate graduationYear;
	private String location;
	private String details;
}
