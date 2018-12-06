package com.LaptopLine.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Category {

	@Id
	@GeneratedValue
	int categoryids;
	String categorynames;
	String categorydescs;
	public int getCategoryids() {
		return categoryids;
	}
	public void setCategoryids(int categoryids) {
		this.categoryids = categoryids;
	}
	public String getCategorynames() {
		return categorynames;
	}
	public void setCategorynames(String categorynames) {
		this.categorynames = categorynames;
	}
	public String getCategorydescs() {
		return categorydescs;
	}
	public void setCategorydescs(String categorydescs) {
		this.categorydescs = categorydescs;
	}
	
	
	
}
