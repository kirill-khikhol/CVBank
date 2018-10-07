package com.telran.cvBank.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ContactInfoDto {
	private String residence;
	private LocalDate birthday;
	private String phone;
	private String email;
	private String linkedIn;

}
