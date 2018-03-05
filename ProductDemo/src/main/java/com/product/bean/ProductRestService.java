package com.product.bean;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.springframework.dao.support.DaoSupport;

import com.product.service.ProductDetailsServiceLayer;

@Path("product")
public class ProductRestService {
	private ProductDetailsServiceLayer servicelayerbean;
	
	
	public void setServicelayerbean(ProductDetailsServiceLayer servicelayerbean) {
		this.servicelayerbean = servicelayerbean;
	}

	@Path("allproducts/{proId}/{proName}")
	@GET
	@Produces("application/json")
	public ProductDetails getProduct(@QueryParam("proId") int proId,@QueryParam("proName") String proName){
		ProductDetails product =new ProductDetails();
		product.setProductId(proId);
		product.setProductName(proName);
//		product.setProductDiscription(proDes);
//		
//		ProductCost productCost = new ProductCost();
//		productCost.setProductBarcode(proBc);
//		productCost.setProductCost(proCost);
//		productCost.setProductQuantity(proQua);
//		
//		product.getProductCost();
		return product;
	}
	
	@Path("save")
	@GET
	public void saveProduct(@QueryParam("proId") int proId,@QueryParam("proName") String proName, @QueryParam("proDes") String proDes, @QueryParam("proBc") int proBc, @QueryParam("proCost") int proCost, @QueryParam("proQua") int proQua){
		ProductDetails product =new ProductDetails();
		product.setProductId(proId);
		product.setProductName(proName);
		product.setProductDiscription(proDes);
		
		ProductCost productCost = new ProductCost();
		productCost.setProductBarcode(proBc);
		productCost.setProductCost(proCost);
		productCost.setProductQuantity(proQua);
		
		product.getProductCost();
		servicelayerbean.saveProductDetails(product);
		
	}
	@Path("update")
	@GET
	public void update(@QueryParam("proId") int proId,@QueryParam("proName") String proName, @QueryParam("proDes") String proDes, @QueryParam("proBc") int proBc, @QueryParam("proCost") int proCost, @QueryParam("proQua") int proQua){
		ProductDetails product =new ProductDetails();
		product.setProductId(proId);
		product.setProductName(proName);
		product.setProductDiscription(proDes);
		
		ProductCost productCost = new ProductCost();
		productCost.setProductBarcode(proBc);
		productCost.setProductCost(proCost);
		productCost.setProductQuantity(proQua);
		
		product.getProductCost();
		servicelayerbean.updateProductDetails(product);
	}
	@Path("delete")
	@GET
	public void delete(@QueryParam("proId") int proId){
		ProductDetails product =new ProductDetails();
		product.setProductId(proId);
//		product.setProductName(proName);
//		product.setProductDiscription(proDes);
//		
//		ProductCost productCost = new ProductCost();
//		productCost.setProductBarcode(proBc);
//		productCost.setProductCost(proCost);
//		productCost.setProductQuantity(proQua);
		
//		product.getProductCost();
		servicelayerbean.deleteProductDetails(product);
	}

}
