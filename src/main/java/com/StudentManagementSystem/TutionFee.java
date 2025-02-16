package com.StudentManagementSystem;

public class TutionFee implements Payable {

	private final double baseFees;
	private final double scholarshipDeduction;
	private final double earlyPaymentDiscount;
	private double finalFeesAmount;

	public TutionFee(double baseFees, double scholarshipDeduction, double earlyPaymentDiscount) {
		super();
		this.baseFees = baseFees;
		this.scholarshipDeduction = scholarshipDeduction;
		this.earlyPaymentDiscount = earlyPaymentDiscount;
	}

	@Override
	public double calculatePayment() {
		finalFeesAmount = baseFees - scholarshipDeduction - earlyPaymentDiscount;
		return finalFeesAmount;
	}
	@Override
	public void generateReceipt() {
		System.out.println("---------Generating fees recipt---------");
		System.out.println("BASE FEES              :   " + baseFees);
		System.out.println("DEDUCTION OFFERED      :  -" + scholarshipDeduction);
		System.out.println("DISCOUNT               :  -" + earlyPaymentDiscount);
		System.out.println("TOTAL FEES TO BE PAID  :   " + finalFeesAmount);
		System.out.println("---------GOOD DAY!---------");
	}

	@Override
	public double getDiscount() {
		return (scholarshipDeduction + earlyPaymentDiscount);
	}

}
