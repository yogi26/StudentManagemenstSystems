package com.StudentManagementSystem;

public interface Payable {

	public double calculatePayment();

	public default boolean processPayment(PaymentMode paymentMode) {
		if (paymentMode == PaymentMode.CASH || paymentMode == PaymentMode.UPI || paymentMode == PaymentMode.CARD) {
			System.out.println("Payment processiong via " + paymentMode + " ....");
			System.out.println("Payment successful");
			return true;
		} else {
			System.err.println("Something went wrong :(");
			return false;
		}
	}

	public void generateReceipt();

	public double getDiscount();
}
