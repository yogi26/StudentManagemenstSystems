package com.StudentManagementSystem;

public interface Payable {
	
	public double calculatePayment();
	
	public default boolean processPayment(String paymentMode){
		if (paymentMode.equalsIgnoreCase("cash") || paymentMode.equalsIgnoreCase("upi")
				|| paymentMode.equalsIgnoreCase("card")) {
			System.out.println("Payment processiong via " + paymentMode + " ....");
			System.out.println("Payment successful");
			return true;
		} else {
			System.err.println("Something went wrong :(");
			return false;
		}
	}
	
	public void generateReceipt();
	
	public double getDiscount() ;
}
