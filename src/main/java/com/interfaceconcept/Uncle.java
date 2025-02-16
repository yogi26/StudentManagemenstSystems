package com.interfaceconcept;

public interface Uncle {
	default void display() {
		System.out.println("Hello from uncle");
	}
}
