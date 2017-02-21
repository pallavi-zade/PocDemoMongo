package com.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
  
import com.model.Product;
import com.model.ProductTypeLevel;
 
@Repository
public class ProductSearchRepository implements ProductMongoRepository {

	@Autowired
	MongoTemplate mongoTemplate;

	public Collection<Product> searchCars(String text) {
		return mongoTemplate.find(Query.query(new Criteria().orOperator(Criteria.where("description").regex(text, "i"),
				Criteria.where("make").regex(text, "i"), Criteria.where("model").regex(text, "i"))), Product.class);
	}

	@Override
	public <S extends Product> S save(S entity) {
		mongoTemplate.save(entity);
		return null;
	}
	

	@Override
	public <S extends Product> Iterable<S> save(Iterable<S> entities) {
		for (S entity : entities) {
			mongoTemplate.save(entity);
		}
		return null;
	}

	@Override
	public Product findOne(String id) {
		// TODO Auto-generated method stub
		return mongoTemplate.findById(id, Product.class);
	}

	@Override
	public boolean exists(String id) {
		// TODO Auto-generated method stub
		//return mongoTemplate.exists(query, entityClass);
		return false;
	}

	@Override
	public Iterable<Product> findAll() {
		// TODO Auto-generated method stub
		return mongoTemplate.findAll(Product.class);
	}

	@Override
	public Iterable<Product> findAll(Iterable<String> ids) {
		// TODO Auto-generated method stub
		List<Product>carList=new ArrayList<>();
		for (String string : ids) {
		carList.add(	mongoTemplate.findById(string, Product.class));
		}
		return carList;
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
	public void delete(Product entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Iterable<? extends Product> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public Product returnProductForMapping(String name) {
		Query query = new Query();
		query.addCriteria(Criteria.where("name").regex(name));
		return mongoTemplate.findOne(query, Product.class);
	}

}
