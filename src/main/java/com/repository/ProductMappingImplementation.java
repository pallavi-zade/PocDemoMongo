package com.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.model.ProductLevelMapping;

@Repository
public class ProductMappingImplementation implements ProductMapping{
	@Autowired
	MongoTemplate mongoTemplate;

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(ProductLevelMapping arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends ProductLevelMapping> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<ProductLevelMapping> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<ProductLevelMapping> findAll(Iterable<String> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductLevelMapping findOne(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends ProductLevelMapping> S save(S productLevelMapping) {
		mongoTemplate.save(productLevelMapping);
		return null;
	}

	@Override
	public <S extends ProductLevelMapping> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
