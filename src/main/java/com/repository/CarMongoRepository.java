package com.repository;

import org.springframework.data.repository.CrudRepository;

import com.model.Product;
import com.model.ProductTypeLevel;



public interface CarMongoRepository extends CrudRepository<Product, String>{
	Product returnProductForMapping(String name);
}