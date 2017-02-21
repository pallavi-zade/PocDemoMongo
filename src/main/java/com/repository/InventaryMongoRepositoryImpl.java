package com.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.model.InventaryInfo;
@Repository
public class InventaryMongoRepositoryImpl implements InventaryMongoRepository {
    @Autowired
    MongoTemplate mongoTemplate;
     
	  
	@Override
	public <S extends InventaryInfo> S save(S objectToSave) {
		// TODO Auto-generated method stub
		mongoTemplate.save(objectToSave);
		return null;
	}

	@Override
	public <S extends InventaryInfo> Iterable<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InventaryInfo findOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<InventaryInfo> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<InventaryInfo> findAll(Iterable<String> ids) {
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
	public void delete(InventaryInfo entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends InventaryInfo> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

}
