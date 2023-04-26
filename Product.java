package com.ericsson.fileio;

import java.io.Serializable;

public class Product implements Serializable {

	private int productId;
	private String productName;
	private float productPrice;
	private String productCategory;

	
	
	
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productCategory=" + productCategory + "]";
	}

	public Product() {
		System.out.println("default constructor");
	}

	public Product(int productId, String productName, float productPrice, String productCategory) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productCategory = productCategory;
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
		if (this.productId == 0) {
			System.out.println("First set productid...");
		} else {
			this.productName = productName;
		}
	}

	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
		if (productPrice > 0)
			this.productPrice = productPrice;
		else
			System.out.println("product can't be -ve or zero");
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

}
