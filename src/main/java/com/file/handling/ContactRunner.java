package com.file.handling;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ContactRunner {
	public static void main(String[] args) {
		Contact c1=new Contact("Yogesh", "6677889900","9876543212");
		
		try(FileOutputStream fis=new FileOutputStream("contact.ser");
			ObjectOutputStream oos=new ObjectOutputStream(fis))
		{
			oos.writeObject(c1);
			System.out.println("Contact object is serialized");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
