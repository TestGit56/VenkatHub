package com.jda.dao;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER")
public class Customer  implements Serializable{
	
	@Id
	@Column(name = "CUSTOMER_ID")
	private Integer customerId=null;
	
	@Column(name = "CUSTOMER_NAME")
	private String customerName=null;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "BILL_FK_ID")
	private BillDetails billdetails=null;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(Integer customerId, String customerName) {
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

	public BillDetails getBilldetails() {
		return billdetails;
	}

	public void setBilldetails(BillDetails billdetails) {
		this.billdetails = billdetails;
	}
	
	
	

}
