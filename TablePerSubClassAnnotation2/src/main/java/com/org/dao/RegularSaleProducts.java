package com.org.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "REGULARSALE")
@PrimaryKeyJoinColumn(name = "PRO_FK_ID")
public class RegularSaleProducts extends ProductBean{
	
	@Column(name = "PRICE")
	private Float productPrice=null;
	
	@Column(name = "STOCK")
	private Integer stock=null;

	public RegularSaleProducts(Integer productId, String productName, Float productPrice, Integer stock) {
		setProductId(productId);
		setProductName(productName);
		this.productPrice = productPrice;
		this.stock = stock;
	}

	public Float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Float productPrice) {
		this.productPrice = productPrice;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "RegularSaleProducts [productPrice=" + productPrice + ", stock=" + stock + "]";
	}
	
	
	
	
	
	
	

}
