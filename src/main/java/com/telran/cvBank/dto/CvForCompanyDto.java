package com.telran.cvBank.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CvForCompanyDto implements CvDto {
	private String cvId;
	private String cvName;
	private TitleDto title;
	private ExperienceDto experience;
	private ContactInfoDto contactInfo;
	private DescriptionDto description;
	private List<EducationDto> education;
	private List<SkillDto> skills;
	private List<ProjectJobsDto> projectJobs;
	private List<String> achivements;
	private List<String> certifications;
	private List<String> languages;
	private List<String> footerLinks;
	private List<String> footerInfo;
	private Boolean isProved;

}
