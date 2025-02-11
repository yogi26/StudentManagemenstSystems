package com.StudentManagementSystem;

import java.util.Objects;

public class Student extends Person {
	private static int totalStudentsCount;
	private int rollNumber;
	private double marksObtainedInEnglish;
	private double marksObtainedInMaths;
	private double marksObtainedInScience;
	private String grade;
	private double percentage;
	private double totalMarks;

	public Student(String name, int age, String address, String phoneNumber, int rollNumber,
			double marksObtainedInEnglish, double marksObtainedInMaths, double marksObtainedInScience) {
		super(name, age, address, phoneNumber);
		if (validateAge(age) && validateRollNo(rollNumber) && validateMarks(marksObtainedInEnglish)
				&& validateMarks(marksObtainedInMaths) && validateMarks(marksObtainedInScience)
				&& validatePhoneNumber(phoneNumber) && validateAddress(address)) {

			this.rollNumber = rollNumber;
			this.marksObtainedInEnglish = marksObtainedInEnglish;
			this.marksObtainedInMaths = marksObtainedInMaths;
			this.marksObtainedInScience = marksObtainedInScience;
			totalStudentsCount++;
		}
	}

	public boolean validateAge(int age) {
		if (age >= 6 && age <= 100) {
			return true;
		} else {
			System.err.println("Invalid age");
			return false;
		}
	}

	public void setAge(int age) {
		if (age >= 6 && age <= 100) {
			this.age = age;
		} else {
			System.out.println("Invalid age");
		}
	}

	public boolean rollNumber() {
		if (rollNumber >= 0 && rollNumber <= 1000) {
			return true;
		} else {
			System.err.println("Invalid roll number");
			return false;
		}
	}

	public int getRollNumber() {
		return rollNumber;
	}

	
	public boolean validateRollNo(int rollNumber) {
		if (rollNumber >= 0 && rollNumber <= 1000) {
			return true;
		} else {
			System.err.println("Invalid roll number");
			return false;
		}
	}

	public void setRollNumber(int rollNumber) {
		if (rollNumber >= 0 && rollNumber <= 1000) {
			this.rollNumber = rollNumber;
		} else {
			System.out.println("Invalid roll number");
		}
	}

	public double getMarksObtainedInEnglish() {
		return marksObtainedInEnglish;
	}

	public boolean validateMarks(double marks) {
		if (marks >= 0 && marks <= 100) {
			return true;
		} else {
			System.err.println("Invalid Marks entered");
			return false;
		}
	}

	public void setMarksObtainedInEnglish(double marksObtainedInEnglish) {
		if (marksObtainedInEnglish >= 0 && marksObtainedInEnglish <= 100) {
			this.marksObtainedInEnglish = marksObtainedInEnglish;
		} else {
			System.out.println("Please enter marks between 0 to 100");
		}

	}

	public double getMarksObtainedInMaths() {
		return marksObtainedInMaths;
	}

	public void setMarksObtainedInMaths(double marksObtainedInMaths) {
		if (marksObtainedInMaths >= 0 && marksObtainedInMaths <= 100) {
			this.marksObtainedInMaths = marksObtainedInMaths;
		} else {
			System.out.println("Please enter marks between 0 to 100");
		}
	}

	public double getMarksObtainedInScience() {
		return marksObtainedInScience;
	}

	public void setMarksObtainedInScience(double marksObtainedInScience) {
		if (marksObtainedInScience >= 0 && marksObtainedInScience <= 100) {
			this.marksObtainedInScience = marksObtainedInScience;
		} else {
			System.out.println("Please enter marks between 0 to 100");
		}
	}

	public String getGrade() {
		return grade;
	}

	public void calculateTotalMarks() {
		totalMarks = marksObtainedInEnglish + marksObtainedInMaths + marksObtainedInScience;
	}

	public void calculatePercentage() {
		percentage = totalMarks / 3.0;
	}

	public void calculateGrade() {

		if(percentage==0) {
			grade="Cannot be calculated";
		}else {
			grade=GradePolicy.calculateGrade(percentage);
		}
	}

	public void showStudentDetails() {
		System.out.println("----------STUDENT DETAILS---------------");
		System.out.println("NAME  :" + name);
		System.out.println("AGE  :" + age);
		System.out.println("CONTACT :" + phoneNumber);
		System.out.println("ADDRESS  :" + address);
		System.out.println("ROLL NO  :" + rollNumber);
		System.out.println("ENGLISH MARKS  :" + marksObtainedInEnglish);
		System.out.println("MATHS MARKS  :" + marksObtainedInMaths);
		System.out.println("SCIENCE MARKS  :" + marksObtainedInScience);
		System.out.println("TOTAL MARKS  :" + totalMarks);
		System.out.println("PERCENTAGE :" + percentage);
		System.out.println("GRADE :" + grade);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", rollNumber=" + rollNumber + ", marksObtainedInEnglish="
				+ marksObtainedInEnglish + ", marksObtainedInMaths=" + marksObtainedInMaths
				+ ", marksObtainedInScience=" + marksObtainedInScience + ", grade=" + grade + ", percentage="
				+ percentage + ", totalMarks=" + totalMarks + ", address=" + address + ", phoneNumber=" + phoneNumber
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, age, grade, marksObtainedInEnglish, marksObtainedInMaths, marksObtainedInScience,
				name, percentage, phoneNumber, rollNumber, totalMarks);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(address, other.address) && age == other.age && Objects.equals(grade, other.grade)
				&& Double.doubleToLongBits(marksObtainedInEnglish) == Double
						.doubleToLongBits(other.marksObtainedInEnglish)
				&& Double.doubleToLongBits(marksObtainedInMaths) == Double.doubleToLongBits(other.marksObtainedInMaths)
				&& Double.doubleToLongBits(marksObtainedInScience) == Double
						.doubleToLongBits(other.marksObtainedInScience)
				&& Objects.equals(name, other.name)
				&& Double.doubleToLongBits(percentage) == Double.doubleToLongBits(other.percentage)
				&& Objects.equals(phoneNumber, other.phoneNumber) && rollNumber == other.rollNumber
				&& Double.doubleToLongBits(totalMarks) == Double.doubleToLongBits(other.totalMarks);
	}
	public boolean updateInformation(String newAdderess, String newPhoneNumber) {
		if(parentApproval()) {
			if(super.updateInformation(newAdderess, newPhoneNumber)) {
				System.out.println("Notifying to Parent that info is upadated");
				return true;
			}
			return false;	
		}
		else {
			System.err.println("No approval from parent");
			return false;
		}
		
	}
	public boolean updateInformation(String newAdderess) {
		if(parentApproval()) {
			if(super.updateInformation(newAdderess)) {
				System.out.println("Notifying to Parent that info is upadated");
				return true;
			}
			return false;	
		}
		else {
			System.err.println("No approval from parent");
			return false;
		}
		
	}
	public boolean updateInformation(String newPhoneNumber, boolean update) {
		if(parentApproval()) {
			if(super.updateInformation(newPhoneNumber, update)) {
				System.out.println("Notifying to Parent that info is upadated");
				return true;
			}
			return false;	
		}
		else {
			System.err.println("No approval from parent");
			return false;
		}
		
	}
	private boolean parentApproval() {
		return true;
	}
	public static int getTotalStudentsCount() {
		return totalStudentsCount;
	}
}
