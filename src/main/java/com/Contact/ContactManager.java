package com.Contact;

import java.util.ArrayList;

public class ContactManager {
	ArrayList<Contact> contacts;
	public ContactManager() {
		contacts=new ArrayList<Contact>();
	}
	public void addContact(Contact contact) {
		if(contact!=null) {
			contacts.add(contact);
		}else {
			throw new IllegalArgumentException("contact object is null");
		}
	}
	public void updateContact(String name, Contact contact) {
		if(contact!=null && name!=null) {
			contacts.set(searchContact(name), contact);
			System.out.println("Contact is updated successfully");
		}else {
			throw new RuntimeException("contact object is null");
		}
	}
	public void removeContact(String name) {
		if(name!=null) {
			contacts.remove(searchContact(name));
			System.out.println("Contact is removed successfully");
		}
		else {
			throw new RuntimeException("Name is null");
		}
	}
	public int searchContact(String name) {
		int contactIndex=0;
		for(Contact contact:contacts) {
			if(contact.getName().equalsIgnoreCase(name)) {
				return contactIndex; 
			}
			contactIndex++;
		}
		throw new RuntimeException("No contact is found for : "+name);
	}
	public void showContacts() {
		contacts.forEach(contact->System.out.println(contact));
	}
}
