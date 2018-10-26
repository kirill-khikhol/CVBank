package com.telran.cvBank.service;
import com.telran.cvBank.dto.ProveSkillsResultDto;
import com.telran.cvBank.dto.jobSeekerDto.CatalogWrapperDto;
import com.telran.cvBank.dto.jobSeekerDto.CvRegistryListDto;
import com.telran.cvBank.dto.jobSeekerDto.JobSeekerCvList;
import com.telran.cvBank.dto.jobSeekerDto.JobSeekerCvWrapperDto;
import com.telran.cvBank.dto.jobSeekerDto.JobSeekerDto;
import com.telran.cvBank.dto.jobSeekerDto.JobSeekerOriginCvDto;
import com.telran.cvBank.dto.jobSeekerDto.JobSeekerProfileWrapperDto;
import com.telran.cvBank.dto.jobSeekerDto.JobSeekerRegistrationRequestDto;
import com.telran.cvBank.dto.jobSeekerDto.JobSeekerRegistrationResponseDto;
import com.telran.cvBank.dto.jobSeekerDto.JobSeekerWrapperDto;

public interface IJobSeekerService {
	
	JobSeekerRegistrationResponseDto registration(JobSeekerRegistrationRequestDto jobSeeker);
	JobSeekerProfileWrapperDto loginJobSeeker();
	CvRegistryListDto showCvRegistry();
	CatalogWrapperDto getCatalogs();
	JobSeekerCvList getCvList(Integer itemsOnPage, Integer currentPage);
	JobSeekerCvWrapperDto getCv(String cvId);
	JobSeekerCvWrapperDto saveCv(JobSeekerOriginCvDto cv);
	JobSeekerCvWrapperDto removeCv(String cvId);
	void enableCv(String cvId, boolean isVisible);
	JobSeekerWrapperDto editJobSeekerProfile(JobSeekerDto jobSeeker);
	ProveSkillsResultDto proveSkillsResult();
	void proveSkill(String skillName);
	void proveCvResult();
}
