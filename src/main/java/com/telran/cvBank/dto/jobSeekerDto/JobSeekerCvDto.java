package com.telran.cvBank.dto.jobSeekerDto;

import java.io.Serializable;
import java.util.Set;

import com.telran.cvBank.dto.DescriptionDto;
import com.telran.cvBank.dto.ExperienceDto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class JobSeekerCvDto implements Serializable{
	private String cvId;
	private String cvName;
	private Integer viewCount;
	private TitleJobSeekerDto title;
	private boolean isTitleVisible;
	private ExperienceDto experience;
	private ContactInfoJobSeekerDto contactInfo;
	private boolean isContactInfoVisible;
	private DescriptionDto description;
	private EducationJobSeekerDto education;
	private Set<SkillJobSeekerDto> skills;
	private ProjectJobSeekerDto projects;
	private Set<String> achiviements;
	private Set<String> certifications;
	private Set<String> languages;
	private Set<String> footerLinks;
	private boolean isFooterLinkVisible;
	private Set<String> footerInfo;
	private boolean isFooterInfoVisible;
	private boolean isActive;
	private String cvStyle;

}
