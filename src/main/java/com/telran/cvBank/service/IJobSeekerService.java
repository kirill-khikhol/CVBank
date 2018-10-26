package com.telran.cvBank.service;
import com.telran.cvBank.dto.jobSeekerDto.CatalogWrapperDto;
import com.telran.cvBank.dto.jobSeekerDto.CvRegistryListDto;
import com.telran.cvBank.dto.jobSeekerDto.JobSeekerCvList;
import com.telran.cvBank.dto.jobSeekerDto.JobSeekerCvWrapperDto;
import com.telran.cvBank.dto.jobSeekerDto.JobSeekerOriginCvDto;
import com.telran.cvBank.dto.jobSeekerDto.JobSeekerProfileWrapperDto;
import com.telran.cvBank.dto.jobSeekerDto.JobSeekerRegistrationRequestDto;
import com.telran.cvBank.dto.jobSeekerDto.JobSeekerRegistrationResponseDto;

public interface IJobSeekerService {
	
	JobSeekerRegistrationResponseDto registration(JobSeekerRegistrationRequestDto jobSeeker);
	JobSeekerProfileWrapperDto loginJobSeeker();
	CvRegistryListDto showCvRegistry();
	CatalogWrapperDto getCatalogs();
	JobSeekerCvList getCvList(Integer itemsOnPage, Integer currentPage);
	JobSeekerCvWrapperDto getCv(String cvId);
	JobSeekerCvWrapperDto saveCv(JobSeekerOriginCvDto cv);
}
