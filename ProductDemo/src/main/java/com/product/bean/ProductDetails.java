package com.product.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class ProductDetails {
	
	@Id
	@GeneratedValue
	private int productId;
	private String productName;
	private String productDiscription;
	@OneToOne
	private ProductCost productCost;
	
	
	public ProductCost getProductCost() {
		return productCost;
	}
	public void setProductCost(ProductCost productCost) {
		this.productCost = productCost;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDiscription() {
		return productDiscription;
	}
	public void setProductDiscription(String productDiscription) {
		this.productDiscription = productDiscription;
	}
	

}
