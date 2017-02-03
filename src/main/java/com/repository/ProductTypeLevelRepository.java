package com.repository;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.model.ProductTypeLevel;

@Repository
public class ProductTypeLevelRepository implements ProductTypeLevelMongoRepository {

	@Autowired
	MongoTemplate mongoTemplate;

	public Collection<ProductTypeLevel> searchCars(String text) {
		return mongoTemplate.find(
				Query.query(new Criteria().orOperator(Criteria.where("description").regex(text, "i"),
						Criteria.where("make").regex(text, "i"), Criteria.where("model").regex(text, "i"))),
				ProductTypeLevel.class);
	}

	@Override
	public <S extends ProductTypeLevel> S save(S entity) {
		mongoTemplate.save(entity);
		return null;
	}

	@Override
	public <S extends ProductTypeLevel> Iterable<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductTypeLevel findOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<ProductTypeLevel> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<ProductTypeLevel> findAll(Iterable<String> ids) {
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
	public void delete(ProductTypeLevel entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Iterable<? extends ProductTypeLevel> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public ProductTypeLevel returnProductLevelForMapping(String name) {
		Query query = new Query();
		query.addCriteria(Criteria.where("name").regex(name));
		return mongoTemplate.findOne(query, ProductTypeLevel.class);

	}

}
