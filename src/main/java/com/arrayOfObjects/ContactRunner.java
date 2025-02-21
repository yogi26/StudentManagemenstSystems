package com.arrayOfObjects;

public class ContactRunner {
	public static void main(String[] args) {
		Contact c1=new Contact("Yogesh", "7038777279");
		System.out.println(c1);
		
		Contact c[]=new Contact[2];
		c[0]=new Contact("Jatin", "8877665544");
		c[1]=new Contact("Akash", "8877665541");
		
		for(Contact contact:c) {
			System.err.println(contact);
		}
		
	}
}
