package com.exception.handling;

public class InvalidRollNumberException extends RuntimeException{

	private int rollNumber;
	public InvalidRollNumberException(String message, int rollNumber) {
		super(message);
		this.rollNumber=rollNumber;
	}
	public int getRollNumber() {
		return rollNumber;
	}
}
