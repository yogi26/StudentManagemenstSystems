package com.exception.handling;

public class InvalidAgeException extends RuntimeException{

	private int age;
	
	public InvalidAgeException(String message, int age) {
		super(message);
		this.age=age;
	}
	
	public int getAge() {
		return age;
	}
	
}
