package com.telran.cvBank.dto;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ProjectJobsDto {
	private String company;
	private String position;
	private Integer backEndFrontEndRatio;
	private LocalDate startDate;
	private LocalDate endDate;
	private String projectDescription;

}
