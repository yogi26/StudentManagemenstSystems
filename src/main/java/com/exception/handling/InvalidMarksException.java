package com.exception.handling;

public class InvalidMarksException extends RuntimeException{

	double marks;
	public InvalidMarksException(String message, double marks) {
		super(message);
		this.marks=marks;
	}
	public double getMarks() {
		return marks;
	}
}
