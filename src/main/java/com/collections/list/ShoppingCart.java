package com.collections.list;

import java.util.ArrayList;
import java.util.List;

/* Create a shopping cart system using ArrayList with the following requirements:
 * a) Create a class Product with attributes: id, name, price
 * b) Create a ShoppingCart class that uses an ArrayList to store Products
 * c) Implement the following methods in ShoppingCart:
 *    - addProduct(Product p)
 *    - removeProduct(int id)
 *    - calculateTotal()
 *    - displayCart()
 * d) Write a main method to test your implementation
 */
public class ShoppingCart {
	
	List<Product> products=new ArrayList<Product>();
	
	public void addProduct(Product p) {
		products.add(p);
	}
	public boolean removeProduct(int id) {
		for(Product product:products) {
			if(product.getId()==id) {
				products.remove(product);
				return true;
			}
		}
		throw new RuntimeException("No products found with given ID");
	}
	public double calculateTotal() {
		double sum=0;
		for(Product product:products) {
			sum+=product.getPrice();
		}
		return sum;
	}
	public void displayCart() {
		for(Product product:products) {
			System.out.println(product);
		}
	}
}
