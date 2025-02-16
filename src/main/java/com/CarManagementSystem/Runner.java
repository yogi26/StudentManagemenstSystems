package com.CarManagementSystem;

public class Runner {
	public static void main(String[] args) {
		Car car1=new SwiftCar.SwiftCarBuilder("Suzuki", "Red")
				.withCarMaxSpeed(150)
				.build();
		
		System.out.println(car1);
		
		Car car2=new PoloCar.PoloCarBuilder("Volkswagon", "Gray")
				.withMaxSpeed(200)
				.build();
		
		System.out.println(car2);
		
		car1.speed();
		car2.speed();
	}
}		
