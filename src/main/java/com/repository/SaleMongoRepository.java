package com.repository;

import org.springframework.data.repository.CrudRepository;

import com.model.SalesInfo;

public interface SaleMongoRepository extends CrudRepository<SalesInfo, String> {

}
