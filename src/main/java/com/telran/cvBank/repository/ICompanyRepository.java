package com.telran.cvBank.repository;

import org.springframework.data.repository.CrudRepository;
import com.telran.cvBank.entities.CompanyEntity;

public interface ICompanyRepository extends CrudRepository<CompanyEntity, Long> {

}
