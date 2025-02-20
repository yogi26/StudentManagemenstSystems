package com.StudentManagementSystem;

import com.exception.handling.InvalidAgeException;
import com.exception.handling.InvalidPhoneNumberException;

public class RegularStudentRunner {
	public static void main(String[] args) {
		try {
			Student s1=new RegularStudent.
					RegularStudentBuilder("Yogesh", 12, "Pune", "99887a6655").bulid();
			System.out.println(s1);
		}
		catch(InvalidPhoneNumberException | InvalidAgeException e) {
			e.printStackTrace();
			//System.out.println(e.getAge());
		}
	}
}
