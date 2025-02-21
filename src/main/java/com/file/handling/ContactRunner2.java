package com.file.handling;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ContactRunner2 {
	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("contact.ser");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Contact c1=(Contact)ois.readObject();
			System.out.println("Object is deserailized");
			System.out.println(c1);
		}
		catch(Exception e) {
			
		}
		
	}
}
