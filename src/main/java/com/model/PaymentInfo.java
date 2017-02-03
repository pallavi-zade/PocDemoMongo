package com.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="Payment_Info")
public class PaymentInfo {
	@Id
	ObjectId id;
	String paymentMethod;
	Float amount;
	String billNo;
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
	 * @return the paymentMethod
	 */
	String getPaymentMethod() {
		return paymentMethod;
	}
	/**
	 * @param paymentMethod the paymentMethod to set
	 */
	void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	/**
	 * @return the amount
	 */
	Float getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	void setAmount(Float amount) {
		this.amount = amount;
	}
	/**
	 * @return the billNo
	 */
	String getBillNo() {
		return billNo;
	}
	/**
	 * @param billNo the billNo to set
	 */
	void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	

}
