package com.CarManagementSystem;

public class PoloCar extends Car{

	public int maxSpeed;
	
	protected PoloCar(CarBuilder carBuilder) {
		super(carBuilder);
		this.maxSpeed=((PoloCarBuilder)carBuilder).maxSpeed;
	}

	

	@Override
	public void speed() {
		System.out.println("Runs at max "+this.maxSpeed+"kmph");	
	}
	
	@Override
	public String toString() {
		return "PoloCar [maxSpeed=" + maxSpeed + ", carBrand=" + carBrand + ", carColour=" + carColour + "]";
	}

	public static class PoloCarBuilder extends Car.CarBuilder{
		public int maxSpeed;
		public PoloCarBuilder(String carBrand, String carColour) {
			super(carBrand, carColour);
		}
		public PoloCarBuilder withMaxSpeed(int maxSpeed) {
			this.maxSpeed=maxSpeed;
			return this;
		}

		@Override
		public Car build() {
			Car c1=new PoloCar(this);
			return c1;
		}	
	}
}
