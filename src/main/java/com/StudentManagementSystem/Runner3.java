package com.StudentManagementSystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Runner3 {
	public static void main(String[] args) {
		
		Student[] students=new Student[2];
		String fileName="student.ser";
		
		students[0]=new RegularStudent.RegularStudentBuilder("Yogesh", 31, "Pune", "9988776655")
				.withSetRollNumber(1001)
				.withSetMarksObtainedInEnglish(78)
				.withSetMarksObtainedInMaths(86)
				.withSetMarksObtainedInScience(75)
				.bulid();
		
		students[1]=new SportStudent.SportStudentBuilder("Akash", 29, "Mumbai", "8877665544")
				.withSportScore(99)
				.withSetRollNumber(20001)
				.withSetMarksObtainedInEnglish(77)
				.withSetMarksObtainedInMaths(88)
				.withSetMarksObtainedInScience(88)
				.bulid();
		
		File file=new File(fileName);
		serializeStudents(students, fileName);
		
	}
	
	private static Student[] createStudentArray(int size) {
		return new Student[size];
	}

	public static void serializeStudents(Student[] students, String fileName) {
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(fileName)))
		{
			oos.writeObject(students);
			System.out.println("Serialization completed..");
		}
		catch(Exception e) {
			throw new RuntimeException("Error occured during serialization : "+e.getMessage());
		}
	}
	public static void desiralizeStudents(String fileName) {
		Student[] data=null;
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(fileName))){
			data=(Student[])ois.readObject();
		}catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Error occured during student deserialization .. :"+e.getMessage());
		}
		for(Student s:data) {
			System.out.println(s);
		}
	}
}
