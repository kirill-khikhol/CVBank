package com.telran.cvBank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telran.cvBank.entities.ApplicantEntity;

public interface JobSeekerRepository extends JpaRepository<ApplicantEntity, Long> {

}
