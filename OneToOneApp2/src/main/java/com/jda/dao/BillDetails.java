package com.jda.dao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BILLDETAILS")
public class BillDetails implements Serializable{
	
	@Id
	@Column(name = "BILL_ID")
	private Integer billId=null;
	
	@Column(name = "BILL_DATE")
	private String billDate=null;
	
	@Column(name = "BILL_AMOUNT")
	private Float billAmount=null;

	public BillDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BillDetails(Integer billId, String billDate, Float billAmount) {
		super();
		this.billId = billId;
		this.billDate = billDate;
		this.billAmount = billAmount;
	}

	public Integer getBillId() {
		return billId;
	}

	public void setBillId(Integer billId) {
		this.billId = billId;
	}

	public String getBillDate() {
		return billDate;
	}

	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

	public Float getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(Float billAmount) {
		this.billAmount = billAmount;
	}

	
	
}
