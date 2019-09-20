package com.adp.dao;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "CUSTOMERS")
public class Customers implements Serializable{
	
	
	@Id
	@Column(name = "CUSTOMER_ID")
	private Integer customerId = null;
	
	@Column(name = "CUSTOMER_NAME")
	private String customerName = null;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@Fetch(FetchMode.SUBSELECT)
	@JoinTable(
			
			name="CUSTOMER_NETWORK",
			joinColumns = {@JoinColumn(name= "CUSTOMER_FK_ID")},
			inverseJoinColumns = {@JoinColumn(name= "NETWORK_FK_ID")}
			
			
			)
	
	private Set<Network> networkSet=null;

	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customers(Integer customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Set<Network> getNetworkSet() {
		return networkSet;
	}

	public void setNetworkSet(Set<Network> networkSet) {
		this.networkSet = networkSet;
	}
	
	
	
	
	

}
