package com.telran.cvBank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.telran.cvBank.entities.CompanyEntity;

public interface CompanyRepository extends JpaRepository<CompanyEntity, Long> {

}
