package com.model;

import java.util.Arrays;

public class Mapping {
private String name;
private String mapping[];
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public String[] getMapping() {
	return mapping;
}
public void setMapping(String[] mapping) {
	this.mapping = mapping;
}
@Override
public String toString() {
	return "Mapping [name=" + name + ", mapping=" + Arrays.toString(mapping)
			+ "]";
}



}
