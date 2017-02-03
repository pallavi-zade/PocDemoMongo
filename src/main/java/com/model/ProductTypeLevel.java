package com.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ProductTypeLevel")
public class ProductTypeLevel {
	
	@Id
	private ObjectId id;
	
	private int level;
	private String name;
	
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "ProductTypeLevel [id=" + id + ", level=" + level + ", Name=" + name + "]";
	}
	
}
