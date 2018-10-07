package com.telran.cvBank.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class SearchProfileDto implements Serializable {
	@Getter
	private String searchProfileName;
	@Getter
	private FiltersDto filters;

}
