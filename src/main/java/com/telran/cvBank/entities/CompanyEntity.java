package com.telran.cvBank.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.telran.cvBank.dto.CompanyRegistrationRequestDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class CompanyEntity extends UserEntity implements Serializable {

	private String companyName;
	private String website;
	@OneToOne(cascade = CascadeType.ALL)
	private AddressEntity address;
	@OneToOne(cascade = CascadeType.ALL)
	private ApplicantEntity applicant;
	@OneToMany
	private List<FolderEntity> myFolders;
	@ManyToMany
	private List<CvEntity> myCvList;

	public CompanyEntity(CompanyRegistrationRequestDto company) {
		super(company.getCompanyName(), company.getPassword());
		this.companyName = company.getCompanyName();
		this.website = company.getWebSite();
		this.address = new AddressEntity(company.getAddress());
		this.applicant = new ApplicantEntity(company.getApplicant());
//		this.myFolders = myFolders;
//		this.myCvList = myCvList;
	}

	public CompanyEntity(String login, String password, String companyName, String website, AddressEntity address,
			ApplicantEntity applicant, List<FolderEntity> myFolders, List<CvEntity> myCvList) {
		super(login, password);
		this.companyName = companyName;
		this.website = website;
		this.address = address;
		this.applicant = applicant;
		this.myFolders = myFolders;
		this.myCvList = myCvList;
	}
//	public CompanyEntity(Long id, String login, String password, String companyName, String website,
//			AddressEntity address, ApplicantEntity applicant, List<FolderEntity> myFolders, List<CvEntity> myCvList) {
//		super(id, login, password);
//		this.companyName = companyName;
//		this.website = website;
//		this.address = address;
//		this.applicant = applicant;
//		this.myFolders = myFolders;
//		this.myCvList = myCvList;
//	}
}
