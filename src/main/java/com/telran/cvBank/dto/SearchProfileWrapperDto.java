package com.telran.cvBank.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class SearchProfileWrapperDto implements Serializable {
	@Getter
	private SearchProfileDto searchProfile;

}
