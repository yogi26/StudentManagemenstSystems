package com.exception.handling;

public class Runner {

	public static void main(String[] args) {
		Person p1;
		Person p2;
		try {
			p1 = new Person("Yoge11sh", 32);
			System.out.println(p1);
			p2=new Person("Akash11", 291);
			System.out.println(p2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
