package com.telran.cvBank.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

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

@Service
public class CompanyMockServise implements ICompanyService {

	@Override
	public CompanyRegistrationDto registration(CompanyProfileDto company) {
		String token = company.getApplicant().getEmail() + ":" + "password";
		return new CompanyRegistrationDto(token, company);
	}

	@Override
	public CompanyProfileWrapperDto login() {
		return new CompanyProfileWrapperDto(new CompanyProfileDto("inetex", "inetex.co.il",
				new AddressDto("israel", "rechovot", "some St", "777", "1234567", "0501234567"),
				new ApplicantDto("Vasya", "Pupkin", "chief", "pv@mail.com", "0512345678")));
	}

	@Override
	public SearchProfilesDto getSearchProfiles() {
		List<SkillDto> skills = new ArrayList();
		skills.add(new SkillDto("java", true));
		List<String> region = new ArrayList();
		region.add("Center");
		region.add("South");
		List<SearchProfileWrapperDto> searchProfiles = new ArrayList();
		searchProfiles.add(new SearchProfileWrapperDto(new SearchProfileDto("java search profile",
				new FiltersDto("java developer", "medicine", region, skills, 12000, 21000, "Tel Aviv", "Israel"))));

		return new SearchProfilesDto(searchProfiles);
	}

	@Override
	public SearchProfileWrapperDto editSearchProfile(String searchProfileName, SearchProfileDto searchProfile) {
		return new SearchProfileWrapperDto(searchProfile);
	}

	@Override
	public SearchProfileWrapperDto deleteSearchProfile(String searchProfileName) {
		List<SkillDto> skills = new ArrayList();
		skills.add(new SkillDto("java", true));
		List<String> region = new ArrayList();
		region.add("Center");
		region.add("South");
		SearchProfileDto searchProfile = new SearchProfileDto(searchProfileName,
				new FiltersDto("java developer", "medicine", region, skills, 12000, 21000, "Tel Aviv", "Israel"));
		return new SearchProfileWrapperDto(searchProfile);
	}

	@Override
	public CvListDto searchCVs(Integer itemsOnPage, Integer currentPage, FiltersDto filters) {
		Integer itemsTotal = 103;
		List<CvWrapperDto> cvList = new ArrayList<>();
		TitleDto title = new TitleDto("Petr", "Petrov");
		List<LocalExperienceDto> localExperience = new ArrayList<>();
		localExperience.add(new LocalExperienceDto("developer", 5.5));
		ExperienceDto experience = new ExperienceDto(localExperience, 5.5);
		ContactInfoDto contactInfo = new ContactInfoDto("jarusalem", "01.01.1980", "0501234567", "petr@petrov.com",
				"https://www.linkedin.com/in/petr-petrov-123456789/");
		List<String> preferableArea = new ArrayList<>();
		preferableArea.add("IoT");
		preferableArea.add("banking");
		DescriptionDto description = new DescriptionDto("I am java developer", preferableArea, "team leader", 20000l,
				50000l);
		List<EducationDto> education = new ArrayList<>();
		education.add(new EducationDto("technion", "m.s.", "2007", "Haifa, Israel", "details here"));
		List<SkillDto> skills = new ArrayList<>();
		skills.add(new SkillDto("java", true));
		skills.add(new SkillDto("javaScript", false));
		List<ProjectJobsDto> projectJobs = new ArrayList<>();
		Date startDate = new Date(100l);
		Date endDate = new Date(100000000l);
		List<String> achivements = new ArrayList<>();
		achivements.add("very fast");
		List<String> certifications = new ArrayList<>();
		certifications.add("google certificate");
		List<String> languages = new ArrayList<>();
		languages.add("english");
		languages.add("hebrew");
		languages.add("russian");
		List<String> footerLinks = new ArrayList<>();
		footerLinks.add("foter link 1");
		footerLinks.add("foter link 2");
		List<String> footerInfo = new ArrayList<>();
		footerInfo.add("footer info 1");
		footerInfo.add("footer info 2");
		projectJobs.add(new ProjectJobsDto("myCompany", "java developer", 90, startDate, endDate,
				"good project for good people"));
		cvList.add(new CvWrapperDto(new CvForCompanyDto("100500", "Java developer cv", title, experience, contactInfo,
				description, education, skills, projectJobs, achivements, certifications, languages, footerLinks,
				footerInfo, true)));

		return new CvListDto(currentPage, itemsOnPage, itemsTotal, cvList);
	}

	@Override
	public String openOrExpandCvsDetails(String cvId) {
		return "openOrExpandCvsDetails ok" + System.lineSeparator() + "cvId = " + cvId;
	}

	@Override
	public CvVeryShortDto saveCvToList(String cvId) {
		return new CvVeryShortDto(cvId);
	}

	@Override
	public CvVeryShortDto removeCvFromList(String cvId) {
		return new CvVeryShortDto(cvId);
	}

	@Override
	public CvListDto getSavedCvs(Integer itemsOnPage, Integer currentPage, FiltersDto filters) {
		Integer itemsTotal = 103;
		List<CvWrapperDto> cvList = new ArrayList<>();
		TitleDto title = new TitleDto("Petr", "Petrov");
		List<LocalExperienceDto> localExperience = new ArrayList<>();
		localExperience.add(new LocalExperienceDto("developer", 5.5));
		ExperienceDto experience = new ExperienceDto(localExperience, 5.5);
		ContactInfoDto contactInfo = new ContactInfoDto("jarusalem", "01.01.1980", "0501234567", "petr@petrov.com",
				"https://www.linkedin.com/in/petr-petrov-123456789/");
		List<String> preferableArea = new ArrayList<>();
		preferableArea.add("IoT");
		preferableArea.add("banking");
		DescriptionDto description = new DescriptionDto("I am java developer", preferableArea, "team leader", 20000l,
				50000l);
		List<EducationDto> education = new ArrayList<>();
		education.add(new EducationDto("technion", "m.s.", "2007", "Haifa, Israel", "details here"));
		List<SkillDto> skills = new ArrayList<>();
		skills.add(new SkillDto("java", true));
		skills.add(new SkillDto("javaScript", false));
		List<ProjectJobsDto> projectJobs = new ArrayList<>();
		Date startDate = new Date(100l);
		Date endDate = new Date(100000000l);
		List<String> achivements = new ArrayList<>();
		achivements.add("very fast");
		List<String> certifications = new ArrayList<>();
		certifications.add("google certificate");
		List<String> languages = new ArrayList<>();
		languages.add("english");
		languages.add("hebrew");
		languages.add("russian");
		List<String> footerLinks = new ArrayList<>();
		footerLinks.add("foter link 1");
		footerLinks.add("foter link 2");
		List<String> footerInfo = new ArrayList<>();
		footerInfo.add("footer info 1");
		footerInfo.add("footer info 2");
		projectJobs.add(new ProjectJobsDto("myCompany", "java developer", 90, startDate, endDate,
				"good project for good people"));
		cvList.add(new CvWrapperDto(new CvForCompanyDto("100500", "Java developer cv", title, experience, contactInfo,
				description, education, skills, projectJobs, achivements, certifications, languages, footerLinks,
				footerInfo, true)));

		return new CvListDto(currentPage, itemsOnPage, itemsTotal, cvList);
	}

	@Override
	public ProveSkillsResultDto showProveSkillsResult(String cvId) {
		List<SkillDto> skills = new ArrayList();
		skills.add(new SkillDto("java", true));
		skills.add(new SkillDto("big data", false));

		return new ProveSkillsResultDto(skills);
	}

	@Override
	public CompanyProfileWrapperDto getCompanyProfile() {
		return new CompanyProfileWrapperDto(new CompanyProfileDto("inetex", "inetex.co.il",
				new AddressDto("israel", "rechovot", "some St", "777", "1234567", "0501234567"),
				new ApplicantDto("Vasya", "Pupkin", "chief", "pv@mail.com", "0512345678")));
	}

	@Override
	public CompanyProfileWrapperDto editCompanyProfile(CompanyProfileDto company) {
		return new CompanyProfileWrapperDto(company);
	}

	@Override
	public MyFoldersDto getMyFolders() {
		List<FolderWrapperDto> myFolders = new ArrayList<>();
		myFolders.add(new FolderWrapperDto(new FolderDto("java Devs")));
		return new MyFoldersDto(myFolders);
	}

	@Override
	public CvListFromFolderDto getFolder(String folderName, Integer itemsOnPage, Integer currentPage) {
		Integer itemsTotal = 103;
		List<CvWrapperDto> cvList = new ArrayList<>();
		TitleDto title = new TitleDto("Petr", "Petrov");
		List<LocalExperienceDto> localExperience = new ArrayList<>();
		localExperience.add(new LocalExperienceDto("developer", 5.5));
		ExperienceDto experience = new ExperienceDto(localExperience, 5.5);
		ContactInfoDto contactInfo = new ContactInfoDto("jarusalem", "01.01.1980", "0501234567", "petr@petrov.com",
				"https://www.linkedin.com/in/petr-petrov-123456789/");
		List<String> preferableArea = new ArrayList<>();
		preferableArea.add("IoT");
		preferableArea.add("banking");
		DescriptionDto description = new DescriptionDto("I am java developer", preferableArea, "team leader", 20000l,
				50000l);
		List<EducationDto> education = new ArrayList<>();
		education.add(new EducationDto("technion", "m.s.", "2007", "Haifa, Israel", "details here"));
		List<SkillDto> skills = new ArrayList<>();
		skills.add(new SkillDto("java", true));
		skills.add(new SkillDto("javaScript", false));
		List<ProjectJobsDto> projectJobs = new ArrayList<>();
		Date startDate = new Date(100l);
		Date endDate = new Date(100000000l);
		List<String> achivements = new ArrayList<>();
		achivements.add("very fast");
		List<String> certifications = new ArrayList<>();
		certifications.add("google certificate");
		List<String> languages = new ArrayList<>();
		languages.add("english");
		languages.add("hebrew");
		languages.add("russian");
		List<String> footerLinks = new ArrayList<>();
		footerLinks.add("foter link 1");
		footerLinks.add("foter link 2");
		List<String> footerInfo = new ArrayList<>();
		footerInfo.add("footer info 1");
		footerInfo.add("footer info 2");
		projectJobs.add(new ProjectJobsDto("myCompany", "java developer", 90, startDate, endDate,
				"good project for good people"));
		cvList.add(new CvWrapperDto(new CvForCompanyDto("100500", "Java developer cv", title, experience, contactInfo,
				description, education, skills, projectJobs, achivements, certifications, languages, footerLinks,
				footerInfo, true)));

		return new CvListFromFolderDto(currentPage, itemsOnPage, itemsTotal, cvList, folderName);
	}

	@Override
	public FolderWrapperDto editFolder(String folderName, String newFolderName) {
		return new FolderWrapperDto(new FolderDto(newFolderName));
	}

	@Override
	public FolderWrapperDto deleteFolder(String folderName) {
		return new FolderWrapperDto(new FolderDto(folderName));
	}

	@Override
	public CvVeryShortDto saveCvToFolder(String cvId, String folderName) {
		return new CvVeryShortDto(cvId);
	}

	@Override
	public CvVeryShortDto removeCvFromFolder(String cvId, String folderName) {
		return new CvVeryShortDto(cvId);
	}

}
