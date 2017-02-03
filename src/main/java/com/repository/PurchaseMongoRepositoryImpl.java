package com.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.model.PurchaseInfo;

@Repository
public class PurchaseMongoRepositoryImpl implements PurchaseMongoRepository {

	@Autowired
	MongoTemplate mongoTemplate;

	@Override
	public <S extends PurchaseInfo> S save(S entity) {
		mongoTemplate.save(entity);
		return null;
	}

	@Override
	public <S extends PurchaseInfo> Iterable<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PurchaseInfo findOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<PurchaseInfo> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<PurchaseInfo> findAll(Iterable<String> ids) {
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
	public void delete(PurchaseInfo entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Iterable<? extends PurchaseInfo> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

}
