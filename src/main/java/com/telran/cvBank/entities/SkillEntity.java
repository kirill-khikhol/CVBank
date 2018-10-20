package com.telran.cvBank.entities;

import java.io.Serializable;

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
public class SkillEntity implements Serializable{
	@Id
	@GeneratedValue
	private long id;
	private String skillName;
	private Boolean isProved;
}
