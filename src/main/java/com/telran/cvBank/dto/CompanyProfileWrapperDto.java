package com.telran.cvBank.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CompanyProfileWrapperDto implements Serializable {
	private CompanyProfileDto company;

}
