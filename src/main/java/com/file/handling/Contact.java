package com.file.handling;

import java.io.Serializable;

public class Contact implements Serializable{
	private static final long serialVersionUID = 42L;
	private String name;
	private String contactNumber;
	private transient String emergencyContactNumber;
	
	public Contact(String name, String contactNumber, String emergencyContactNumber) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
		this.emergencyContactNumber = emergencyContactNumber;
	}

	public String getName() {
		return name;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public String getEmergencyContactNumber() {
		return emergencyContactNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public void setEmergencyContactNumber(String emergencyContactNumber) {
		this.emergencyContactNumber = emergencyContactNumber;
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", contactNumber=" + contactNumber + ", emergencyContactNumber="
				+ emergencyContactNumber + "]";
	}
	
	
	
}
