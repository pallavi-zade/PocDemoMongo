package com.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="InventaryInfo")
public class InventaryInfo { 
    @Id
	ObjectId id;
    ObjectId projectDetailId;
    int quntity;
	public ObjectId getId() {
		return id;
	}
	public ObjectId getProjectDetailId() {
		return projectDetailId;
	}
	public int getQuntity() {
		return quntity;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public void setProjectDetailId(ObjectId projectDetailId) {
		this.projectDetailId =  projectDetailId;
	}
	public void setQuntity(int quntity) {
		this.quntity = quntity;
	}
    
}
