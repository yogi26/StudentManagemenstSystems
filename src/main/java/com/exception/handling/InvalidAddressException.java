package com.exception.handling;

public class InvalidAddressException extends RuntimeException{

	private String address;
	public InvalidAddressException(String message, String address) {
		super(message);
		this.address=address;
	}
	public String getAddress() {
		return address;
	}
}
