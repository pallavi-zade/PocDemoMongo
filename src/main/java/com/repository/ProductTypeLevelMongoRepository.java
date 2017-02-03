package com.repository;

import org.springframework.data.repository.CrudRepository;



import com.model.Product;
import com.model.ProductTypeLevel;

public interface ProductTypeLevelMongoRepository extends CrudRepository<ProductTypeLevel, String> {

	ProductTypeLevel returnProductLevelForMapping(String name);
}
