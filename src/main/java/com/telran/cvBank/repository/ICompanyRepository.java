package com.telran.cvBank.repository;

import org.springframework.data.repository.CrudRepository;

import com.telran.cvBank.entities.UserEntity;

public interface ICompanyRepository extends CrudRepository<UserEntity, Long> {

}
