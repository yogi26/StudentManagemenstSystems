package com.exception.handling;

public class InvalidNameException extends RuntimeException{
	public InvalidNameException(String message) {
		super(message);
	}
}
