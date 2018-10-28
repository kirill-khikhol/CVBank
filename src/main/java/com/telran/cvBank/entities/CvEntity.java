package com.telran.cvBank.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CvEntity implements Serializable {
	@Id
	@GeneratedValue
	private long cvId;
	@OneToOne
	private TitleEntity title;
	@OneToOne
	private ExperienceEntity experience;
	@OneToOne
	private ContactInfoEntity contactInfo;
	@OneToOne
	private DescriptionEntity description;
	@OneToMany
	private List<EducationEntity> education;
	@OneToMany
	private List<SkillEntity> skills;
	@OneToMany
	private List<ProjectsJobEntity> projectsJob;
	@ElementCollection
	private List<String> achivements;
	@ElementCollection
	private List<String> certifications;
	@ElementCollection
	private List<String> languages;
	@ElementCollection
	private List<String> footerLinks;
	@ElementCollection
	private List<String> footerInfo;
	private boolean isActive;

}
