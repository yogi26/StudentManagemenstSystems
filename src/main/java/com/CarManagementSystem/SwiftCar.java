package com.CarManagementSystem;

public class SwiftCar extends Car{

	public int maxSpeed;
	
	protected SwiftCar(CarBuilder carBuilder) {
		super(carBuilder);
		this.maxSpeed=((SwiftCarBuilder)carBuilder).maxSpeed;
	}

	@Override
	public void speed() {
		System.out.println("Runs at max "+this.maxSpeed+"kmph");	
	}
	
	@Override
	public String toString() {
		return "SwiftCar [maxSpeed=" + maxSpeed + ", carBrand=" + carBrand + ", carColour=" + carColour + "]";
	}

	public static class SwiftCarBuilder extends Car.CarBuilder{

		public int maxSpeed;
		
		public SwiftCarBuilder(String carBrand, String carColour) {
			super(carBrand, carColour);
		}
		public SwiftCarBuilder withCarMaxSpeed(int maxSpeed) {
			this.maxSpeed=maxSpeed;
			return this;
		}
		@Override
		public Car build() {
			Car c1=new SwiftCar(this);
			return c1;
		}
		
	}

}
