package com.LaptopLine.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Distributor {

	@Id
	@GeneratedValue
	int distributorsid;
	String distributorsnames;
	String distributorsaddresses;
	public int getDistributorsid() {
		return distributorsid;
	}
	public void setDistributorsid(int distributorsid) {
		this.distributorsid = distributorsid;
	}
	public String getDistributorsnames() {
		return distributorsnames;
	}
	public void setDistributorsnames(String distributorsnames) {
		this.distributorsnames = distributorsnames;
	}
	public String getDistributorsaddresses() {
		return distributorsaddresses;
	}
	public void setDistributorsaddresses(String distributorsaddresses) {
		this.distributorsaddresses = distributorsaddresses;
	}
	
		
}
