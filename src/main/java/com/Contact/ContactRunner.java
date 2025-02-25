package com.Contact;

public class ContactRunner {
	public static void main(String[] args) {
	
		ContactManager manager=new ContactManager();
		
		manager.addContact(new Contact("Yogesh", "7038777279"));
		manager.addContact(new Contact("Akash", "7038777288"));
		manager.addContact(new Contact("Amol", "7038771234"));
		manager.addContact(new Contact("Raju", "9938771234"));
		manager.addContact(new Contact("Shyam", "7738771234"));
		
		manager.showContacts();
		
		manager.updateContact("Raju", new Contact("Raju T", "9938771234"));
		manager.showContacts();
		
		manager.removeContact("Raju T");
		manager.showContacts();
	}
}
