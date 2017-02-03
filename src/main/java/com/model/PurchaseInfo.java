package com.model;

import java.sql.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Purchase_Info")
public class PurchaseInfo {

	@Id
	ObjectId id;
	Date dateOfPurchase;
	String sourceOfPurchase;
	/**
	 * @return the id
	 */
	ObjectId getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	void setId(ObjectId id) {
		this.id = id;
	}
	/**
	 * @return the dateOfPurchase
	 */
	Date getDateOfPurchase() {
		return dateOfPurchase;
	}
	/**
	 * @param dateOfPurchase the dateOfPurchase to set
	 */
	void setDateOfPurchase(Date dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}
	/**
	 * @return the sourceOfPurchase
	 */
	String getSourceOfPurchase() {
		return sourceOfPurchase;
	}
	/**
	 * @param sourceOfPurchase the sourceOfPurchase to set
	 */
	void setSourceOfPurchase(String sourceOfPurchase) {
		this.sourceOfPurchase = sourceOfPurchase;
	}
	
}
