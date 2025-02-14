package com.builder;

public class Runner {

	public static void main(String[] args) {
		
		Employee e1=new Employee
				.Builder()
					.name("Yogesh")
					.empID(10001)
					.salary(30000.00)
					.build();
		System.out.println(e1);
		
		Car c1=new Car
				.CarBuilder()
					.setBrand("Hyundai")
					.setCar("Creta")
					.bulild();
		
		System.out.println(c1);
	}

}
