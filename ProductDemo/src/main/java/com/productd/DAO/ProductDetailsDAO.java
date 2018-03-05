package com.productd.DAO;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.product.bean.ProductDetails;

public class ProductDetailsDAO {
	
	private HibernateTemplate hibernatetemplate;
	 
	public void setHibernatetemplate(HibernateTemplate hibernatetemplate) {
		this.hibernatetemplate = hibernatetemplate;
	}
	
	public void getProductDetails(){
		
	}
	public void saveProductDetails(ProductDetails product){
		hibernatetemplate.save(product);
		
	}
	public void updateProductDetails(ProductDetails product){
		hibernatetemplate.update(product);
	}
	public void deleteProductDetails(ProductDetails product){
		hibernatetemplate.delete(product);
	}

}
