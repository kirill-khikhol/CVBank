package com.telran.cvBank.dto;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class EducationDto {
	private String schoolInstitutionName;
	private String degree;
	private LocalDate graduationYear;
	private String location;
	private String details;

}
