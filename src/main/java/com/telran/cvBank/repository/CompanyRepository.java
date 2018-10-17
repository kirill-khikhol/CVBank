package com.telran.cvBank.repository;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.telran.cvBank.entities.CompanyEntity;
import com.telran.cvBank.entities.UserEntity;

@Repository
public class CompanyRepository implements ICompanyRepository {

	@Override
	public <S extends CompanyEntity> S save(S entity) {
		System.out.println(entity.getLogin());
		return null;
	}

	@Override
	public <S extends CompanyEntity> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<CompanyEntity> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<CompanyEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<CompanyEntity> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(CompanyEntity entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(Iterable<? extends CompanyEntity> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}
//	@PersistenceContext(unitName = "springHibernate")
//	EntityManager em;
//
//	@Override
//	@Transactional
//	public <S extends UserEntity> S save(S entity) {
//		em.persist(entity);
//
//		return (S) em.find(entity.getClass(), entity.getId());
//	}

}
