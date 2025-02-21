package com.StudentManagementSystem;

import java.io.Serializable;
import java.nio.InvalidMarkException;
import java.util.Objects;

import com.exception.handling.InvalidAddressException;
import com.exception.handling.InvalidAgeException;
import com.exception.handling.InvalidMarksException;
import com.exception.handling.InvalidPhoneNumberException;
import com.exception.handling.InvalidRollNumberException;

public abstract class Student extends Person implements Serializable{
	static final long serialVersionUID = 1L;
	private static int totalStudentsCount;
	private final int rollNumber;
	private final double marksObtainedInEnglish;
	private final double marksObtainedInMaths;
	private final double marksObtainedInScience;
	protected String grade;
	protected double percentage;
	protected final double totalMarks;


	protected Student(StudentBuilder studentBuilder) {
		super(studentBuilder.name, studentBuilder.age, studentBuilder.address, studentBuilder.phoneNumber);
		this.rollNumber = studentBuilder.rollNumber;
		this.marksObtainedInEnglish = studentBuilder.marksObtainedInEnglish;
		this.marksObtainedInMaths = studentBuilder.marksObtainedInMaths;
		this.marksObtainedInScience = studentBuilder.marksObtainedInScience;
		this.totalMarks = calculateTotalMarks();
		totalStudentsCount++;

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

	public double getMarksObtainedInEnglish() {
		return marksObtainedInEnglish;
	}

	public double getMarksObtainedInMaths() {
		return marksObtainedInMaths;
	}

	public double getMarksObtainedInScience() {
		return marksObtainedInScience;
	}

	public String getGrade() {
		return grade;
	}

	public final double calculateTotalMarks() {
		double totalMarks = marksObtainedInEnglish + marksObtainedInMaths + marksObtainedInScience;
		return totalMarks;
	}

	public abstract double calculatePercentage();

	public final String calculateGrade() {
		String grade;
		if (percentage == 0) {
			grade = "Cannot be calculated";
		} else {
			grade = GradePolicy.calculateGrade(percentage);
		}
		return grade;
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
		if (parentApproval()) {
			if (super.updateInformation(newAdderess, newPhoneNumber)) {
				System.out.println("Notifying to Parent that info is upadated");
				return true;
			}
			return false;
		} else {
			System.err.println("No approval from parent");
			return false;
		}

	}

	public boolean updateInformation(String newAdderess) {
		if (parentApproval()) {
			if (super.updateInformation(newAdderess)) {
				System.out.println("Notifying to Parent that info is upadated");
				return true;
			}
			return false;
		} else {
			System.err.println("No approval from parent");
			return false;
		}

	}

	public boolean updateInformation(String newPhoneNumber, boolean update) {
		if (parentApproval()) {
			if (super.updateInformation(newPhoneNumber, update)) {
				System.out.println("Notifying to Parent that info is upadated");
				return true;
			}
			return false;
		} else {
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

	public abstract static class StudentBuilder {

		private int rollNumber;
		private double marksObtainedInEnglish;
		private double marksObtainedInMaths;
		private double marksObtainedInScience;

		protected String name;
		protected int age;
		protected String address;
		protected String phoneNumber;

		public StudentBuilder(String name, int age, String address, String phoneNumber) {
			if (validateAge(age) && validateRollNo(rollNumber) && validateMarks(marksObtainedInEnglish)
					&& validateMarks(marksObtainedInMaths) && validateMarks(marksObtainedInScience)
					&& validatePhoneNumber(phoneNumber) && validateAddress(address)) {
				this.name = name;
				this.age = age;
				this.address = address;
				this.phoneNumber = phoneNumber;
			}
		}

		public StudentBuilder withSetRollNumber(int rollNumber) {
			this.rollNumber = rollNumber;
			return this;
		}

		public StudentBuilder withSetMarksObtainedInEnglish(double marksObtainedInEnglish) {
			this.marksObtainedInEnglish = marksObtainedInEnglish;
			return this;
		}

		public StudentBuilder withSetMarksObtainedInMaths(double marksObtainedInMaths) {
			this.marksObtainedInMaths = marksObtainedInMaths;
			return this;
		}

		public StudentBuilder withSetMarksObtainedInScience(double marksObtainedInScience) {
			this.marksObtainedInScience = marksObtainedInScience;
			return this;
		}

		public final boolean validateAge(int age) {
			if (age >= 6 && age <= 100) {
				return true;
			} else {
				throw new InvalidAgeException("Invalid age", age);
			}
		}

		public final boolean validateRollNo(int rollNumber) {
			if (rollNumber >= 0 && rollNumber <= 1000) {
				return true;
			} else {
				throw new InvalidRollNumberException("Invalid roll number", rollNumber);
			}
		}

		public final boolean validateMarks(double marks) {
			if (marks >= 0 && marks <= 100) {
				return true;
			} else {
				throw new InvalidMarksException("Invalid Marks entered", marks);
			}
		}

		protected final boolean validatePhoneNumber(String phoneNumber) {
			if (phoneNumber.matches("\\d{10}")) {
				return true;
			} else {
				throw new InvalidPhoneNumberException("Invalid phone number", phoneNumber);
			}
		}

		protected final boolean validateAddress(String address) {
			if (!address.isEmpty() || address == null) {
				return true;
			} else {
				throw new InvalidAddressException("Invalid address", address);
			}
		}

		public abstract Student bulid();
	}
} 
