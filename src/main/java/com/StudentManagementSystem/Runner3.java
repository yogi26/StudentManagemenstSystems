package com.StudentManagementSystem;

public class Runner3 {
	public static void main(String[] args) {
		Student s1=new RegularStudent.RegularStudentBuilder("Yogesh", 31, "Pune", "9988776655")
				.withSetRollNumber(1001)
				.withSetMarksObtainedInEnglish(78)
				.withSetMarksObtainedInMaths(86)
				.withSetMarksObtainedInScience(75)
				.bulid();
		
		System.out.println(s1);
		
		Student s2=new SportStudent.SportStudentBuilder("Akash", 29, "Mumbai", "8877665544")
				.withSportScore(99)
				.withSetRollNumber(20001)
				.withSetMarksObtainedInEnglish(77)
				.withSetMarksObtainedInMaths(88)
				.withSetMarksObtainedInScience(88)
				.bulid();
		
		System.out.println(s2);
	}
}
