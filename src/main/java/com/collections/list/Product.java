package com.collections.list;


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

public class Product {
	private int id;
	private String name;
	private double price;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
}
