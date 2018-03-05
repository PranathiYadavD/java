package com.product.service;

import com.product.bean.ProductDetails;
import com.productd.DAO.ProductDetailsDAO;

public class ProductDetailsServiceLayer {
	private ProductDetailsDAO daobean;
	
	
	public void setProDAO(ProductDetailsDAO daobean) {
		this.daobean = daobean;
	}
	public void getProductDetails(ProductDetails product){
		daobean.getProductDetails();
		
	}
	public void saveProductDetails(ProductDetails product){
		daobean.saveProductDetails(product);		
	}
	public void updateProductDetails(ProductDetails product){
		daobean.updateProductDetails(product);
		
	}
	public void deleteProductDetails(ProductDetails product){
		daobean.deleteProductDetails(product);
		
	}

}
