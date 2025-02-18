package com.exception.handling;

public class Sample {
	public static void main(String[] args) {
		System.out.println("Line 1");
		try {
			int result=10/0;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Line 2");
		System.out.println("Line 3");
	}
}
