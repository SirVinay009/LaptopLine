package com.LaptopLine.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MyPurchase")
public class PurchaseDetails {

	@Id
	@GeneratedValue
	int purchaseid;
	String username;
	Date orderdate;
	int totalshoppingamount;
	String pmode;
	public int getPurchaseid() {
		return purchaseid;
	}
	public void setPurchaseid(int purchaseid) {
		this.purchaseid = purchaseid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}
	public int getTotalshoppingamount() {
		return totalshoppingamount;
	}
	public void setTotalshoppingamount(int totalshoppingamount) {
		this.totalshoppingamount = totalshoppingamount;
	}
	public String getPmode() {
		return pmode;
	}
	public void setPmode(String pmode) {
		this.pmode = pmode;
	}
	
	
}
