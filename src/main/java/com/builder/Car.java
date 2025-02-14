package com.builder;

public class Car {
	private final String brand;
	private final String car;
	
	public Car(String brand, String car) {
		super();
		this.brand = brand;
		this.car = car;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", car=" + car + "]";
	}

	public String getBrand() {
		return brand;
	}

	public String getCar() {
		return car;
	}

	public static class CarBuilder{
		private String brand;
		private String car;
	
		public CarBuilder setBrand(String brand) {
			this.brand = brand;
			return this;
		}
		public CarBuilder setCar(String car) {
			this.car = car;
			return this;
		}
		
		public Car bulild() {
			Car c1=new Car(brand, car);
			return c1;
		}
	}
	
	
}
