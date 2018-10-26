package com.telran.cvBank.dto.jobSeekerDto;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

import com.telran.cvBank.dto.DescriptionDto;
import com.telran.cvBank.dto.ExperienceDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class JobSeekerOriginCvDto implements Serializable{
	private String cvId;
	private String cvName;
	private Integer viewCount;
	private TitleJobSeekerDto title;
	private boolean isTitleVisible = true;
	private ExperienceDto experience;
	private ContactInfoJobSeekerDto contactInfo;
	private boolean isContactInfoVisible = true;
	private DescriptionDto description;
	private List<EducationJobSeekerDto> education;
	private List<SkillJobSeekerDto> skills;
	private List<ProjectJobSeekerDto> projectJobs;
	private List<String> achiviements;
	private List<String> certifications;
	private List<String> languages;
	private List<String> footerLinks;
	private boolean isFooterLinkVisible = true;
	private List<String> footerInfo;
	private boolean isFooterInfoVisible = true;
	private boolean isActive = true;
	private String cvStyle;
}
