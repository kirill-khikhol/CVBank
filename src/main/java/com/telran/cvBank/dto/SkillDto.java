package com.telran.cvBank.dto;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@Getter
public class SkillDto implements Serializable {

	private String skillName;
	private Boolean isProved;

}
