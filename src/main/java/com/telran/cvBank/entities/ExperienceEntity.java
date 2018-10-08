package com.telran.cvBank.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ExperienceEntity {
	@OneToMany
	private List<LocalExperienceEntity> localExperience;
	private double totalExperience;
}
