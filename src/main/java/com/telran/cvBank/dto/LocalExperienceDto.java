package com.telran.cvBank.dto;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor

public class LocalExperienceDto implements Serializable{
	private String position;
	private Double years;
}
