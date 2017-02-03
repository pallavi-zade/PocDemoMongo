package com.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="Customer_Info")
public class CustomerInfo {
	@Id
    ObjectId id;
	String customerName;
	String gender;
	Integer age;
	String location;
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
	 * @return the customerName
	 */
	String getCustomerName() {
		return customerName;
	}
	/**
	 * @param customerName the customerName to set
	 */
	void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	/**
	 * @return the gender
	 */
	String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the age
	 */
	Integer getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	void setAge(Integer age) {
		this.age = age;
	}
	/**
	 * @return the location
	 */
	String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	void setLocation(String location) {
		this.location = location;
	}
	
	
}
