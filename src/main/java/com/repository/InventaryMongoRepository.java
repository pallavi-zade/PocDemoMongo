package com.repository;

import org.springframework.data.repository.CrudRepository;

import com.model.InventaryInfo;

public  interface InventaryMongoRepository extends CrudRepository<InventaryInfo, String> {

}
 