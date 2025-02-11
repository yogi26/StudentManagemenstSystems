package com.StudentManagementSystem;

import java.util.Objects;

public class Teacher extends Person{
	private String empID;
	private String subject;
	private int yearsOfExperience;
	private double salary;
	private static int totalTeachersCount;
	
	private static final double BASE_SALARY=30000;
	private static final double EXPERIENCE_BONUS=2000;
	
	public Teacher(String name, int age, String address, String phoneNumber, String empID, String subject,
			int yearsOfExperience) {
		super(name, age, address, phoneNumber);
		this.empID = empID;
		this.subject = subject;
		this.yearsOfExperience = yearsOfExperience;
		totalTeachersCount++;
	}

	public String getEmpID() {
		return empID;
	}

	public void setEmpID(String empID) {
		this.empID = empID;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	public double getSalary() {
		return salary;
	}

	public void calculateSalary() {
		salary=BASE_SALARY+yearsOfExperience*EXPERIENCE_BONUS;
	}

	
	public void showTeacherDetails() {
		System.out.println("----------TEACHER DETAILS---------------");
		System.out.println("NAME  :" + name);
		System.out.println("AGE  :" + age);
		System.out.println("CONTACT :" + phoneNumber);
		System.out.println("ADDRESS  :" + address);
		System.out.println("EMP ID  :"+empID);
		System.out.println("SUBJECT  :"+subject);
		System.out.println("EXPERIENCE  :"+yearsOfExperience);
		System.out.println("SALARY  : "+salary);
	}
	
	

	@Override
	public String toString() {
		return "Teacher [empID=" + empID + ", subject=" + subject + ", yearsOfExperience=" + yearsOfExperience
				+ ", salary=" + salary + ", name=" + name + ", age=" + age + ", address=" + address + ", phoneNumber="
				+ phoneNumber + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(empID, salary, subject, yearsOfExperience);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		return Objects.equals(empID, other.empID)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary)
				&& Objects.equals(subject, other.subject) && yearsOfExperience == other.yearsOfExperience;
	}
	public boolean updateInformation(String newAdderess, String newPhoneNumber) {
		if(hrApproval()) {
			if(super.updateInformation(newAdderess, newPhoneNumber)) {
				System.out.println("Notifying to teacher that info is upadated");
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
		if(hrApproval()) {
			if(super.updateInformation(newAdderess)) {
				System.out.println("Notifying to teacher that info is upadated");
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
		if(hrApproval()) {
			if(super.updateInformation(newPhoneNumber, update)) {
				System.out.println("Notifying to teacher that info is upadated");
				return true;
				
			}
			return false;	
		}
		else {
			System.err.println("No approval from parent");
			return false;
		}
		
	}
	private boolean hrApproval() {
		return true;
	}
	public static int getTotalTeachersCount() {
		return totalTeachersCount;
	}
}
