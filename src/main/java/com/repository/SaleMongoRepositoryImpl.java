package com.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.model.SalesInfo;

@Repository
public class SaleMongoRepositoryImpl implements SaleMongoRepository {

	@Autowired
	MongoTemplate mongoTemplate;

	@Override
	public <S extends SalesInfo> S save(S entity) {
		mongoTemplate.save(entity);
		return null;
	}

	@Override
	public <S extends SalesInfo> Iterable<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SalesInfo findOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<SalesInfo> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<SalesInfo> findAll(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(SalesInfo entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Iterable<? extends SalesInfo> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

}
