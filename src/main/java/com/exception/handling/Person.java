package com.exception.handling;

public class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		if(validateAge(age) && validateName(name)) {
			this.name = name;
			this.age = age;
		}
		
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		if(validateName(name)) {
			this.name = name;
		}
		this.name = name;
	}
	public void setAge(int age) {
		if(validateAge(age)) {
			this.age = age;
		}
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	private boolean validateAge(int age) {
		if(age>=18 && age <=90) {
			return true;
		}else {
			try {
				throw new InvalidAgeException("Invalid age", age);
			}catch(InvalidAgeException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
	public boolean validateName(String name) {
		if(name==null || name.trim().isEmpty()) {
			throw new InvalidNameException("Name cannot be emppty");
		}
		else if(!name.matches("[a-zA-Z\\s]+")) {
			throw new InvalidNameException("Name is invalid");
		}
		return true;
	}
}
