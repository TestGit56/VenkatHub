package com.org.dao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name= "PRODUCT")
@Inheritance(strategy = InheritanceType.JOINED)
public class ProductBean implements Serializable {
	
	@Id
	@Column(name = "PID")
	private Integer productId=null;
	
	@Column(name = "PNAME")
	private String productName=null;

	public ProductBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductBean(Integer productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Override
	public String toString() {
		return "ProductBean [productId=" + productId + ", productName=" + productName + "]";
	}
	
	
	
	
	

}
