package com.ericsson.oops;

public class Client {
	public static void main(String[] args) {

		Product product=new Product();
		product.setProductId(111);
		product.setProductName("samsung");
		product.setProductPrice(9000);
		product.setProductCategory("electronics");
		
		
		System.out.println(product.getProductName());
	}
}
