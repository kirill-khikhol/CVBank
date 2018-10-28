package com.telran.cvBank.dto;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor

public class TitleDto implements Serializable{
	private String firstName;
	private String lastName;
}
