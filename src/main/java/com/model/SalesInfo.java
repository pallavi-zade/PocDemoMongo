package com.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Sales_Info")
public class SalesInfo {
	@Id
	ObjectId id;
	ObjectId productMappingId;
	ObjectId purchaseInfoId;
	ObjectId paymentInfoId;
	ObjectId custInfoId;
	/**
	 * @return the id
	 */
	public ObjectId getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(ObjectId id) {
		this.id = id;
	}
	/**
	 * @return the productMappingId
	 */
	public ObjectId getProductMappingId() {
		return productMappingId;
	}
	/**
	 * @param productMappingId the productMappingId to set
	 */
	public void setProductMappingId(ObjectId productMappingId) {
		this.productMappingId = productMappingId;
	}
	/**
	 * @return the purchaseInfoId
	 */
	public ObjectId getPurchaseInfoId() {
		return purchaseInfoId;
	}
	/**
	 * @param purchaseInfoId the purchaseInfoId to set
	 */
	public void setPurchaseInfoId(ObjectId purchaseInfoId) {
		this.purchaseInfoId = purchaseInfoId;
	}
	/**
	 * @return the paymentInfoId
	 */
	public ObjectId getPaymentInfoId() {
		return paymentInfoId;
	}
	/**
	 * @param paymentInfoId the paymentInfoId to set
	 */
	public void setPaymentInfoId(ObjectId paymentInfoId) {
		this.paymentInfoId = paymentInfoId;
	}
	/**
	 * @return the custInfoId
	 */
	public ObjectId getCustInfoId() {
		return custInfoId;
	}
	/**
	 * @param custInfoId the custInfoId to set
	 */
	public void setCustInfoId(ObjectId custInfoId) {
		this.custInfoId = custInfoId;
	}
	
	

}
