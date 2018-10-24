package com.telran.cvBank.dto.jobSeekerDto;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import com.telran.cvBank.dto.DescriptionDto;
import com.telran.cvBank.dto.ExperienceDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
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
	private List<EducationJobSeekerDto> education;
	private List<SkillJobSeekerDto> skills;
	private List<ProjectJobSeekerDto> projects;
	private List<String> achiviements;
	private List<String> certifications;
	private List<String> languages;
	private List<String> footerLinks;
	private boolean isFooterLinkVisible;
	private List<String> footerInfo;
	private boolean isFooterInfoVisible;
	private boolean isActive;
	private String cvStyle;

}
