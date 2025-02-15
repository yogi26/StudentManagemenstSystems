package com.StudentManagementSystem;

public abstract class Person {
	
	private static int totalPersonCount;
	protected String name;
	protected int age;
	protected String address;
	protected String phoneNumber;
	
	public Person(String name, int age, String address, String phoneNumber) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.phoneNumber = phoneNumber;
		totalPersonCount++;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		if(validatePhoneNumber(phoneNumber)) {
			this.phoneNumber=phoneNumber;
		}
	}
	

	public boolean updateInformation(String newAdderess, String newPhoneNumber) {
		if(validateAddress(newAdderess)&&validatePhoneNumber(newPhoneNumber)) {
			this.address=newAdderess;
			this.phoneNumber=newPhoneNumber;
			System.out.println("Updated address and contact number");
			return true;
		}else {
			return false;
		}
	}
	public boolean updateInformation(String newAdderess) {
		if(validateAddress(newAdderess)) {
			this.address=newAdderess;
			System.out.println("Updated address");
			return true;
		}else {
			return false;
		}
	}
	public boolean updateInformation(String newPhoneNumber, boolean update) {
		if(validatePhoneNumber(newPhoneNumber)) {
			this.phoneNumber=newPhoneNumber;
			System.out.println("Updated contact number");
			return true;
		}else {
			return false;
		}
	}
	public static int getTotoalPersonCount() {
		return totalPersonCount;
	}
	protected boolean validatePhoneNumber(String phoneNumber) {
		if (phoneNumber.matches("\\d{10}")) {
			return true;
		} else {
			System.err.println("Invalid phone number");
			return false;
		}
	}

	protected boolean validateAddress(String address) {
		if (!address.isEmpty() || address == null) {
			return true;
		} else {
			System.err.println("Invalid address");
			return false;
		}
	}
}
