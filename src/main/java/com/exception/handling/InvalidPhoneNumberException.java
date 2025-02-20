package com.exception.handling;

public class InvalidPhoneNumberException extends RuntimeException{
	
	private String phoneNumber;
	public InvalidPhoneNumberException(String message, String phoneNumber) {
		super(message);
		this.phoneNumber=phoneNumber;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}

}
