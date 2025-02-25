package com.TestDataManagement;

public class Runner {
	public static void main(String[] args) {
		TestDataManager tdm=new TestDataManager();
		
		tdm.addUser(new User("Yogesh", "test5@gmail.com","12345"));
		tdm.addUser(new User("Ramesh", "test1@gmail.com","12346"));
		tdm.addUser(new User("Mahesh", "test2@gmail.com","12347"));
		tdm.addUser(new User("Ganesh", "test3@gmail.com","12348"));
		tdm.addUser(new User("Somesh", "test4@gmail.com","12349"));
		
		
		tdm.sortUserByName();
		tdm.showUsers();
		tdm.totalUsers();
		tdm.removeDuplicateUsers();
		tdm.clearAllUsers();
		tdm.totalUsers();
	
	}
}
