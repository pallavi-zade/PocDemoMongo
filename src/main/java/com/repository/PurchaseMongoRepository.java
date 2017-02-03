package com.repository;

import org.springframework.data.repository.CrudRepository;


import com.model.PurchaseInfo;

public interface PurchaseMongoRepository extends CrudRepository<PurchaseInfo, String> {

}
