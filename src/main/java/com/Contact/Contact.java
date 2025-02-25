package com.Contact;

public class Contact {
	private String name;
	private String contactNumber;

	public Contact(String name, String contactNumber) {
		super();
		if (validateName(name) && validateContactNumber(contactNumber)) {
			this.name = name;
			this.contactNumber = contactNumber;
		}
	}

	public String getName() {
		return name;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setName(String name) {
		if (validateName(name)) {
			this.name = name;
		}
	}

	public boolean validateName(String name) {
		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException("Name cannot be empty");
		}
		return true;
	}

	public void setContactNumber(String contactNumber) {
		if (validateContactNumber(contactNumber)) {
			this.contactNumber = contactNumber;
		}
	}

	public boolean validateContactNumber(String contactNumber) {
		if (contactNumber == null || contactNumber.isEmpty() || !contactNumber.matches("\\d{10}")
				|| contactNumber.length() != 10) {
			throw new IllegalArgumentException("Invalid contact number provided");
		}
		return true;
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", contactNumber=" + contactNumber + "]";
	}

}
