package com.collections.list;

public class AmazonApp {
	public static void main(String[] args) {
		Product p1=new Product();
		p1.setId(101);
		p1.setName("Phone");
		p1.setPrice(40000);
		
		Product p2=new Product();
		p2.setId(102);
		p2.setName("Jeans");
		p2.setPrice(4000);
		
		Product p3=new Product();
		p3.setId(103);
		p3.setName("Laptop");
		p3.setPrice(60000);
		
		ShoppingCart cart=new ShoppingCart();
		cart.addProduct(p1);
		cart.addProduct(p2);
		cart.addProduct(p3);
		
		cart.displayCart();
		System.out.println("Total :"+cart.calculateTotal());
		cart.removeProduct(101);
		cart.displayCart();
	}
}
