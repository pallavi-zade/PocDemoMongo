package com.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.model.PaymentInfo;
import com.model.SalesInfo;

@Repository
public class PaymentMongoRepositoryImpl implements PaymentMongoRepository {
@Autowired
MongoTemplate mongoTemplate;

@Override
public <S extends PaymentInfo> S save(S entity) {
	mongoTemplate.save(entity);
	return null;
}

@Override
public <S extends PaymentInfo> Iterable<S> save(Iterable<S> entities) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public PaymentInfo findOne(String id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public boolean exists(String id) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public Iterable<PaymentInfo> findAll() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Iterable<PaymentInfo> findAll(Iterable<String> ids) {
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
public void delete(PaymentInfo entity) {
	// TODO Auto-generated method stub
	
}

@Override
public void delete(Iterable<? extends PaymentInfo> entities) {
	// TODO Auto-generated method stub
	
}

@Override
public void deleteAll() {
	// TODO Auto-generated method stub
	
}
	
	

}
