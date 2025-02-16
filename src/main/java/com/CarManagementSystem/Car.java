package com.CarManagementSystem;

public abstract class Car {
	
	protected String carBrand;
	protected String carColour;
	
	protected Car(CarBuilder carBuilder) {
		this.carBrand=carBuilder.carBrand;
		this.carColour=carBuilder.carColour;
	}
	public abstract void speed();
	
	@Override
	public String toString() {
		return "Car [carBrand=" + carBrand + ", carColour=" + carColour + "]";
	}

	public static abstract class CarBuilder{
		
		private String carBrand;
		private String carColour;
		
		public  CarBuilder(String carBrand, String carColour) {
			this.carBrand=carBrand;
			this.carColour=carColour;
		}
		public abstract Car build();
	}
}
