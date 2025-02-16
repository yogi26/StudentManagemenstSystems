package com.StudentManagementSystem;

public class SportStudent extends Student{

	private double sportsScore;
	
	protected SportStudent(StudentBuilder studentBuilder) {
		super(studentBuilder);
		this.sportsScore=((SportStudentBuilder)studentBuilder).sportsScore;
		this.percentage = calculatePercentage();
		this.grade = calculateGrade();
	}

	

	@Override
	public double calculatePercentage() {
		double acedemicPercentage=totalMarks/3.0;
		double finalPercentage=(acedemicPercentage*0.8)+(sportsScore*0.2);
		return finalPercentage;
	}
	

	public static class SportStudentBuilder extends StudentBuilder{

		private double sportsScore;
		
		public SportStudentBuilder(String name, int age, String address, String phoneNumber) {
			super(name, age, address, phoneNumber);
		}
		
		public SportStudentBuilder withSportScore(double sportScore) {
			if(sportScore>=0 && sportScore<=100) {
				this.sportsScore=sportScore;
			}
			return this;
		}
		
		@Override
		public Student bulid() {
			Student s1=new SportStudent(this);
			return s1;
		}
		
	}
	@Override
	public String toString() {
		return "SportStudent [sportsScore=" + sportsScore + ", grade=" + grade + ", percentage=" + percentage
				+ ", totalMarks=" + totalMarks + ", name=" + name + ", age=" + age + ", address=" + address
				+ ", phoneNumber=" + phoneNumber + "]";
	}

}
