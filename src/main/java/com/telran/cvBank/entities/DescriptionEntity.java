package com.telran.cvBank.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DescriptionEntity {
	private String about;
	private List<String> preferableArea;
	private String position;
	private long salaryFrom;
	private long salaryTo;
}