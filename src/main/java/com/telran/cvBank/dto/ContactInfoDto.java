package com.telran.cvBank.dto;
import java.io.Serializable;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor

public class ContactInfoDto implements Serializable{
	private String residence;
	private LocalDate birthday;
	private String phone;
	private String email;
	private String linkedIn;

}
