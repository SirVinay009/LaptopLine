package com.LaptopLine.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table
public class Item {

	@Id
	@GeneratedValue
	int itemids;
	String itemnames;
	String itemdescs;
	int price;
	int quantity;
	int categoryids;
	int distributorids;
	
	@Transient
	private MultipartFile partimage;

	public int getItemids() {
		return itemids;
	}

	public void setItemids(int itemids) {
		this.itemids = itemids;
	}

	public String getItemnames() {
		return itemnames;
	}

	public void setItemnames(String itemnames) {
		this.itemnames = itemnames;
	}

	public String getItemdescs() {
		return itemdescs;
	}

	public void setItemdescs(String itemdescs) {
		this.itemdescs = itemdescs;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getCategoryids() {
		return categoryids;
	}

	public void setCategoryids(int categoryids) {
		this.categoryids = categoryids;
	}
	
	public int getDistributorids() {
		return distributorids;
	}

	public void setDistributorids(int distributorids) {
		this.distributorids = distributorids;
	}

	public MultipartFile getPartimage() {
		return partimage;
	}

	public void setPartimage(MultipartFile partimage) {
		this.partimage = partimage;
	}

	
	
}
