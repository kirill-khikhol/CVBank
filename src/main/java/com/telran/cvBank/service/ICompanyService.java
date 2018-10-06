package com.telran.cvBank.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.telran.cvBank.dto.CompanyProfileDto;
import com.telran.cvBank.dto.CompanyProfileWrapperDto;
import com.telran.cvBank.dto.CompanyRegistrationDto;
import com.telran.cvBank.dto.CvListDto;
import com.telran.cvBank.dto.CvListFromFolderDto;
import com.telran.cvBank.dto.CvVeryShortDto;
import com.telran.cvBank.dto.FiltersDto;
import com.telran.cvBank.dto.FolderWrapperDto;
import com.telran.cvBank.dto.MyFoldersDto;
import com.telran.cvBank.dto.ProveSkillsResultDto;
import com.telran.cvBank.dto.SearchProfileDto;
import com.telran.cvBank.dto.SearchProfileWrapperDto;
import com.telran.cvBank.dto.SearchProfilesDto;

@Service
public interface ICompanyService {
	CompanyRegistrationDto registration(CompanyProfileDto company);

	CompanyProfileWrapperDto login();

	SearchProfilesDto getSearchProfiles();

	SearchProfileWrapperDto editSearchProfile(String searchProfileName, SearchProfileDto searchProfile);

	SearchProfileWrapperDto deleteSearchProfile(String searchProfileName);

	CvListDto searchCVs(Integer itemsOnPage, Integer currentPage, FiltersDto filters);

	String openOrExpandCvsDetails(String cvId);

	CvVeryShortDto saveCvToList(String cvId);

	CvVeryShortDto removeCvFromList(String cvId);

	CvListDto getSavedCvs(Integer itemsOnPage, Integer currentPage, FiltersDto filters);

	ProveSkillsResultDto showProveSkillsResult(String cvId);

	CompanyProfileWrapperDto getCompanyProfile();

	CompanyProfileWrapperDto editCompanyProfile(CompanyProfileDto company);

	MyFoldersDto getMyFolders();

	CvListFromFolderDto getFolder(String folderName, Integer itemsOnPage, Integer currentPage);

	FolderWrapperDto editFolder(String folderName, String newFolderName);

	FolderWrapperDto deleteFolder(String folderName);

	CvVeryShortDto saveCvToFolder(String cvId, String folderName);

	CvVeryShortDto removeCvFromFolder(String cvId, String folderName);
}
