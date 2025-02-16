package com.StudentManagementSystem;

public class LibraryFee implements Payable{

	private double basicSubscription;
	private double additionalBookCharges;
	private double lateReturnPenalties;
	private double finalAmount;
	public LibraryFee(double basicSubscription, double additionalBookCharges, double lateReturnPenalties) {
		super();
		this.basicSubscription = basicSubscription;
		this.additionalBookCharges = additionalBookCharges;
		this.lateReturnPenalties = lateReturnPenalties;
	}

	@Override
	public double calculatePayment() {
		finalAmount=basicSubscription+additionalBookCharges+lateReturnPenalties;
		return finalAmount;
	}
	public boolean processPayment(String paymentMode){
		if (paymentMode.equalsIgnoreCase("Bitcoin")) {
			System.out.println("Payment processiong via " + paymentMode + " ....");
			System.out.println("Payment successful");
			return true;
		} else {
			System.err.println("Something went wrong :(");
			return false;
		}
	}
	@Override
	public void generateReceipt() {
		System.out.println("---------Generating fees recipt---------");
		System.out.println("Basic Subscription       :   " + basicSubscription);
		System.out.println("Additional Book Charges  :   " + additionalBookCharges);
		System.out.println("Late Return Penalties     :   " + lateReturnPenalties);
		System.out.println("---------GOOD DAY!---------");
		
	}
	@Override
	public double getDiscount() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
