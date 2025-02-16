package com.StudentManagementSystem;

public class TransportFee implements Payable{
	private double baseFee;
	private int paymentMode;
	private double siblingDiscount;
	private double finalAmount;
	
	
	
	public TransportFee(double baseFee, int paymentMode, double siblingDiscount) {
		super();
		this.baseFee = baseFee;
		this.paymentMode = paymentMode;
		this.siblingDiscount = siblingDiscount;
	}
	@Override
	public double calculatePayment() {
		finalAmount=(baseFee * 12)-siblingDiscount;
		return finalAmount;
	}
	@Override
	public void generateReceipt() {
		System.out.println("---------Generating fees recipt---------");
		System.out.println("Base Fee (per month)    :   " + baseFee);
		System.out.println("Payment Mode            :   " + paymentMode);
		System.out.println("Sibling Discount        :   " + siblingDiscount);
		System.out.println("---------GOOD DAY!---------");
		
	}
	@Override
	public double getDiscount() {
		// TODO Auto-generated method stub
		return siblingDiscount;
	}
}
