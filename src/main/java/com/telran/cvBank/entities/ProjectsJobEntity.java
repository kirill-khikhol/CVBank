package com.telran.cvBank.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProjectsJobEntity {
	@Id
	@GeneratedValue
	private long id;
	private String company;
	private String position;
	private int backEndFrontEndRatio;
	private LocalDate startDate;
	private LocalDate endDate;
	private String projectDescription;
}
