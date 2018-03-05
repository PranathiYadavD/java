package com.product.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class ProductCost {
	@Id
	@GeneratedValue
	private int productBarcode;
	private int productCost;
	private int productQuantity;
	public int getProductBarcode() {
		return productBarcode;
	}
	public void setProductBarcode(int productBarcode) {
		this.productBarcode = productBarcode;
	}
	public int getProductCost() {
		return productCost;
	}
	public void setProductCost(int productCost) {
		this.productCost = productCost;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	
	
}
