package com.telran.cvBank.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
public class CompanyEntity extends UserEntity {

	public CompanyEntity(Long id, String login, String password, String companyName, String website,
			AddressEntity address, ApplicantEntity applicant, List<FolderEntity> myFolders, List<CvEntity> myCvList) {
		super(id, login, password);
		this.companyName = companyName;
		this.website = website;
		this.address = address;
		this.applicant = applicant;
		this.myFolders = myFolders;
		this.myCvList = myCvList;
	}

	private String companyName;
	private String website;
	@OneToOne
	private AddressEntity address;
	@OneToOne
	private ApplicantEntity applicant;
	@OneToMany
	private List<FolderEntity> myFolders;
	@ManyToMany
	private List<CvEntity> myCvList;

}
