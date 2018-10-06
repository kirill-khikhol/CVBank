package com.telran.cvBank.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.telran.cvBank.api.CompanyRequestType;
import com.telran.cvBank.dto.AddressDto;
import com.telran.cvBank.dto.ApplicantDto;
import com.telran.cvBank.dto.CompanyProfileDto;
import com.telran.cvBank.dto.CompanyProfileWrapperDto;
import com.telran.cvBank.dto.CompanyRegistrationDto;
import com.telran.cvBank.dto.ContactInfoDto;
import com.telran.cvBank.dto.CvForCompanyDto;
import com.telran.cvBank.dto.CvListDto;
import com.telran.cvBank.dto.CvListFromFolderDto;
import com.telran.cvBank.dto.CvVeryShortDto;
import com.telran.cvBank.dto.CvWrapperDto;
import com.telran.cvBank.dto.DescriptionDto;
import com.telran.cvBank.dto.EducationDto;
import com.telran.cvBank.dto.ExperienceDto;
import com.telran.cvBank.dto.FiltersDto;
import com.telran.cvBank.dto.FolderDto;
import com.telran.cvBank.dto.FolderWrapperDto;
import com.telran.cvBank.dto.LocalExperienceDto;
import com.telran.cvBank.dto.MyFoldersDto;
import com.telran.cvBank.dto.ProjectJobsDto;
import com.telran.cvBank.dto.ProveSkillsResultDto;
import com.telran.cvBank.dto.SearchProfileDto;
import com.telran.cvBank.dto.SearchProfileWrapperDto;
import com.telran.cvBank.dto.SearchProfilesDto;
import com.telran.cvBank.dto.SkillDto;
import com.telran.cvBank.dto.TitleDto;
import com.telran.cvBank.service.ICompanyService;

@RestController
public class CompanyController implements CompanyRequestType {
	@Autowired
	ICompanyService companyService;

	@GetMapping
	public String hello() {
		return "hello";
	}

	@RequestMapping(value = REGISTRATION, method = RequestMethod.POST)
	public CompanyRegistrationDto registration(@RequestBody CompanyProfileDto company) {
		return companyService.registration(company);
	}

	@RequestMapping(value = LOGIN, method = RequestMethod.GET)
	public CompanyProfileWrapperDto login() {
		return companyService.login();
	}

	@RequestMapping(value = SEARCH_PROFILES, method = RequestMethod.GET)
	public SearchProfilesDto getSearchProfiles() {
		return companyService.getSearchProfiles();
	}

	@RequestMapping(value = SEARCH_PROFILE, method = RequestMethod.PUT)
	public SearchProfileWrapperDto editSearchProfile(
			@RequestParam(value = "searchProfileName") String searchProfileName,
			@RequestBody SearchProfileDto searchProfile) {
		return companyService.editSearchProfile(searchProfileName, searchProfile);
	}

	@RequestMapping(value = SEARCH_PROFILE, method = RequestMethod.DELETE)
	public SearchProfileWrapperDto deleteSearchProfile(
			@RequestParam(value = "searchProfileName") String searchProfileName) {
		return companyService.deleteSearchProfile(searchProfileName);
	}

	@RequestMapping(value = CVS, method = RequestMethod.POST)
	public CvListDto searchCVs(@RequestParam(value = "itemsOnPage") Integer itemsOnPage,
			@RequestParam(value = "currentPage") Integer currentPage, @RequestBody FiltersDto filters) {
		return companyService.searchCVs(itemsOnPage, currentPage, filters);
	}

	@RequestMapping(value = CV, method = RequestMethod.PUT)
	public String openOrExpandCvsDetails(@RequestParam(value = "cvId") String cvId) {
		return companyService.openOrExpandCvsDetails(cvId);
	}

	@RequestMapping(value = CV_TO_LIST, method = RequestMethod.POST)
	public CvVeryShortDto saveCvToList(@RequestParam(value = "cvId") String cvId) {
		return companyService.saveCvToList(cvId);
	}

	@RequestMapping(value = CV_TO_LIST, method = RequestMethod.DELETE)
	public CvVeryShortDto removeCvFromList(@RequestParam(value = "cvId") String cvId) {
		return companyService.removeCvFromList(cvId);
	}

	@RequestMapping(value = SAVED_CVS, method = RequestMethod.POST)
	public CvListDto getSavedCvs(@RequestParam(value = "itemsOnPage") Integer itemsOnPage,
			@RequestParam(value = "currentPage") Integer currentPage, @RequestBody FiltersDto filters) {
		return companyService.getSavedCvs(itemsOnPage, currentPage, filters);
	}

	@RequestMapping(value = PROVE_SKILLS_RESULT, method = RequestMethod.GET)
	public ProveSkillsResultDto showProveSkillsResult(@RequestParam(value = "cvId") String cvId) {
		return companyService.showProveSkillsResult(cvId);
	}

	@RequestMapping(value = PROFILE, method = RequestMethod.GET)
	public CompanyProfileWrapperDto getCompanyProfile() {
		return companyService.getCompanyProfile();
	}

	@RequestMapping(value = PROFILE, method = RequestMethod.PUT)
	public CompanyProfileWrapperDto editCompanyProfile(@RequestBody CompanyProfileDto company) {
		return companyService.editCompanyProfile(company);
	}

	@RequestMapping(value = MY_FOLDERS, method = RequestMethod.GET)
	public MyFoldersDto getMyFolders() {
		return companyService.getMyFolders();
	}

	@RequestMapping(value = FOLDER, method = RequestMethod.GET)
	public CvListFromFolderDto getFolder(@RequestParam(value = "folderName") String folderName,
			@RequestParam(value = "itemsOnPage") Integer itemsOnPage,
			@RequestParam(value = "currentPage") Integer currentPage) {
		return companyService.getFolder(folderName, itemsOnPage, currentPage);
	}

	@RequestMapping(value = FOLDER, method = RequestMethod.POST)
	public FolderWrapperDto editFolder(@RequestParam(value = "folderName") String folderName,
			@RequestParam(value = "newFolderName") String newFolderName) {
		return companyService.editFolder(folderName, newFolderName);
	}

	@RequestMapping(value = FOLDER, method = RequestMethod.DELETE)
	public FolderWrapperDto deleteFolder(@RequestParam(value = "folderName") String folderName) {
		return companyService.deleteFolder(folderName);
	}

	@RequestMapping(value = CV_TO_FOLDER, method = RequestMethod.POST)
	public CvVeryShortDto saveCvToFolder(@RequestParam(value = "cvId") String cvId,
			@RequestParam(value = "folderName") String folderName) {
		return companyService.saveCvToFolder(cvId, folderName);
	}

	@RequestMapping(value = CV_TO_FOLDER, method = RequestMethod.DELETE)
	public CvVeryShortDto removeCvFromFolder(@RequestParam(value = "cvId") String cvId,
			@RequestParam(value = "folderName") String folderName) {
		return companyService.removeCvFromFolder(cvId, folderName);
	}
}
