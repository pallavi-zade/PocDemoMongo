package com.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "ProductLevelMapping")
public class ProductLevelMapping {
	@Id
	private ObjectId id;
	
	private ObjectId productId;
	
	private ObjectId productTypeLevelId;

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
	 * @return the productId
	 */
	public ObjectId getProductId() {
		return productId;
	}

	/**
	 * @param productId the productId to set
	 */
	public void setProductId(ObjectId productId) {
		this.productId = productId;
	}

	/**
	 * @return the productTypeLevelId
	 */
	public ObjectId getProductTypeLevelId() {
		return productTypeLevelId;
	}

	/**
	 * @param productTypeLevelId the productTypeLevelId to set
	 */
	public void setProductTypeLevelId(ObjectId productTypeLevelId) {
		this.productTypeLevelId = productTypeLevelId;
	}


}
