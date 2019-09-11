package com.org.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "NONREGULARSALE")
@PrimaryKeyJoinColumn(name = "PRO_FK_ID")
public class NonRegularSaleProducts extends ProductBean{

	@Column(name = "DISCOUNTPRICE")
	private Float discountPrice=null;
	
	@Column(name = "OFFERVALID")
	private String offerValid=null;

	public NonRegularSaleProducts(Integer productId, String productName, Float discountPrice, String offerValid) {
		setProductId(productId);
		setProductName(productName);
		this.discountPrice = discountPrice;
		this.offerValid = offerValid;
	}

	public Float getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(Float discountPrice) {
		this.discountPrice = discountPrice;
	}

	public String getOfferValid() {
		return offerValid;
	}

	public void setOfferValid(String offerValid) {
		this.offerValid = offerValid;
	}

	@Override
	public String toString() {
		return "NonRegularSaleProducts [discountPrice=" + discountPrice + ", offerValid=" + offerValid + "]";
	}
	
	
	
	
}
