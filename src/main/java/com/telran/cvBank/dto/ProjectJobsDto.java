package com.telran.cvBank.dto;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor

public class ProjectJobsDto implements Serializable{
	private String company;
	private String position;
	private Integer backEndFrontEndRatio;
	private LocalDate startDate;
	private LocalDate endDate;
	private String projectDescription;

}
