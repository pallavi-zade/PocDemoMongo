package com.repository;

import org.springframework.data.repository.CrudRepository;

import com.model.CustomerInfo;

public interface CustomerMongoRepository extends CrudRepository<CustomerInfo, String>{

}
