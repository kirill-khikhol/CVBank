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

public class JobSeekerService implements IJobSeekerService {

	@Override
	public JobSeekerRegistrationResponseDto registration(JobSeekerRegistrationRequestDto jobSeeker) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JobSeekerProfileWrapperDto loginJobSeeker() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CvRegistryListDto showCvRegistry() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CatalogWrapperDto getCatalogs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JobSeekerCvList getCvList(Integer itemsOnPage, Integer currentPage) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JobSeekerCvWrapperDto getCv(String cvId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JobSeekerCvWrapperDto saveCv(JobSeekerOriginCvDto cv) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JobSeekerCvWrapperDto removeCv(String cvId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void enableCv(String cvId, boolean isVisible) {
		// TODO Auto-generated method stub

	}

	@Override
	public JobSeekerWrapperDto editJobSeekerProfile(JobSeekerDto jobSeeker) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProveSkillsResultDto proveSkillsResult() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void proveSkill(String skillName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void proveCvResult() {
		// TODO Auto-generated method stub

	}

}
