package com.TestDataManagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Assignment 1: Test Data Management

Create an ArrayList to store test data for a user registration form
The data should include: usernames, emails, passwords, phone numbers
Write methods to:
Add new test data
Remove duplicate entries
Sort users alphabetically by username
Find total number of users
Clear all test data*/

public class TestDataManager {
	ArrayList<User> users;
	
	public TestDataManager() {
		users=new ArrayList<User>();
	}
	public void addUser(User user) {
		users.add(user);
	}
	public void removeDuplicateUsers() {
	    ArrayList<User> uniqueUsers = new ArrayList<>();
	    for (User user : users) {
	        if (!containsUser(uniqueUsers, user)) {
	            uniqueUsers.add(user);
	        }
	    }
	    users = uniqueUsers;
	}

	private boolean containsUser(ArrayList<User> userList, User userToCheck) {
	    for (User user : userList) {
	        if (user.getEmail().equals(userToCheck.getEmail())) {
	            return true;
	        }
	    }
	    return false;
	}
	public void sortUserByName() {
		Collections.sort(users);
	}
	public void totalUsers() {
		System.out.println("Total Users :"+users.size());
	}
	public void clearAllUsers() {
		users.clear();
		System.out.println("All users are cleared..");
	}
	public void showUsers() {
//		for(User user:users) {
//			System.out.println(user);
//		}
		//users.forEach(user->System.out.println(user));
		users.forEach(System.out::println);// method reference
	}
}
