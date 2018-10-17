package com.telran.cvBank.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.telran.cvBank.dto.ApplicantDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ApplicantEntity {
	@Id
	@GeneratedValue
	private long id;
	private String firstName;
	private String lastName;
	private String position;
	private String email;
	private String phone;

	public ApplicantEntity(ApplicantDto applicant) {
		this.firstName = applicant.getFirstName();
		this.lastName = applicant.getLastName();
		this.position = applicant.getPosition();
		this.email = applicant.getEmail();
		this.phone = applicant.getPhone();
	}
}
