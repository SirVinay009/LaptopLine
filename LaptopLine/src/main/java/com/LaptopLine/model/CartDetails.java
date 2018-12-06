package com.LaptopLine.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class CartDetails {

	@Id
	@GeneratedValue
	int cartitemids;
	int itemids;
	String itemnames;
	int price;
	int quantity;
	String username;
	String pstatus;
	
	public int getCartitemids() {
		return cartitemids;
	}
	public void setCartitemids(int cartitemids) {
		this.cartitemids = cartitemids;
	}
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPstatus() {
		return pstatus;
	}
	public void setPstatus(String pstatus) {
		this.pstatus = pstatus;
	}
	
	
	
	
}
