package com.model;

public class ProLevel {

	private int level;
	private String name;
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
		return "ProLevel [level=" + level + ", name=" + name + "]";
	}
	
	
}
