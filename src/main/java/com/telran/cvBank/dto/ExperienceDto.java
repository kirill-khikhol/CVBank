package com.telran.cvBank.dto;
import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor

public class ExperienceDto implements Serializable{
	private List<LocalExperienceDto> localExperience;
	private Double totalExperience;
}
