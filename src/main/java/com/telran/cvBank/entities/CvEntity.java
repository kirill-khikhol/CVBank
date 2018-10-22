package com.telran.cvBank.entities;

import java.io.Serializable;
import java.util.List;

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
public class CvEntity implements Serializable{
	@Id
	@GeneratedValue
	private long cvId;
	private TitleEntity title;
	private ExperienceEntity experience;
	private ContactInfoEntity contactInfo;
	private DescriptionEntity description;
	private List<EducationEntity> education;
	private List<SkillEntity> skills;
	private List<ProjectsJobEntity> projectsJob;
	private List<String> achivements;
	private List<String> certifications;
	private List<String> languages;
	private List<String> footerLinks;
	private List<String> footerInfo;
	private boolean isActive;

}
