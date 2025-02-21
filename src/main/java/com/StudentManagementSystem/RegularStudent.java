package com.StudentManagementSystem;

import java.io.Serializable;

public class RegularStudent extends Student implements Serializable{
	static final long serialVersionUID = 1L;
	protected RegularStudent(StudentBuilder studentBuilder) {
		super(studentBuilder);
		this.percentage = calculatePercentage();
		this.grade = calculateGrade();
	}

	@Override
	public double calculatePercentage() {
		double percentage = totalMarks / 3.0;
		return percentage;
	}
	
	@Override
	public String toString() {
		return "RegularStudent [grade=" + grade + ", percentage=" + percentage + ", totalMarks=" + totalMarks
				+ ", name=" + name + ", age=" + age + ", address=" + address + ", phoneNumber=" + phoneNumber + "]";
	}

	public static class RegularStudentBuilder extends Student.StudentBuilder{

		public RegularStudentBuilder(String name, int age, String address, String phoneNumber) {
			super(name, age, address, phoneNumber);
		}

		@Override
		public Student bulid() {
			
			Student s1=new RegularStudent(this);
			return s1;
		}
		
	}
	

	
}
