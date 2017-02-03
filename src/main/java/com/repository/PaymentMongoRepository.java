package com.repository;


import org.springframework.data.repository.CrudRepository;

import com.model.PaymentInfo;
import com.model.SalesInfo;;

public interface PaymentMongoRepository extends CrudRepository<PaymentInfo, String> {

}
