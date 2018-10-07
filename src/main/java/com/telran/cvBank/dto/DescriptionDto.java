package com.telran.cvBank.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class DescriptionDto {
	private String about;
	private List<String> preferableArea;
	private String position;
	private Long salaryFrom;
	private Long salaryTo;

}
