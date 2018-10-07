package com.telran.cvBank.dto;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class FiltersDto implements Serializable {

	private String position;
	private String profArea;
	private List<String> region;
	private List<SkillDto> skills;
	private Integer salaryFrom;
	private Integer salaryTo;
	private String city;
	private String citizenship;

}
