package com.telran.cvBank.dto;
import java.io.Serializable;
import java.util.List;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor

public class DescriptionDto implements Serializable{
	private String about;
	private List<String> preferableArea;
	private String position;
	private Long salaryFrom;
	private Long salaryTo;
}
