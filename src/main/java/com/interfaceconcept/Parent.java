package com.interfaceconcept;

public interface Parent {
	default void show() {
		System.out.println("Hello form show from interface");
	}
}
