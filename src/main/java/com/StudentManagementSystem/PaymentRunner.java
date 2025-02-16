package com.StudentManagementSystem;

public class PaymentRunner {
	public static void main(String[] args) {
		Payable payable=new TutionFee(50000, 10000, 5000);
		payable.calculatePayment();
		payable.generateReceipt();
		payable.processPayment("CASH");
		System.out.println(payable.getDiscount());
		
		Payable spPayable=new SportsActivity(5000, 3000, 2000, 1000);
		spPayable.calculatePayment();
		spPayable.generateReceipt();
		spPayable.processPayment("CHEQUE");
		System.out.println(spPayable.getDiscount());
		
		Payable tpPayable=new TransportFee(1000, 12, 500);
		tpPayable.calculatePayment();
		tpPayable.generateReceipt();
		tpPayable.processPayment("CASH");
		System.out.println(tpPayable.getDiscount());
		
		Payable lfPayable=new LibraryFee(500, 200, 100);
		lfPayable.calculatePayment();
		lfPayable.generateReceipt();
		lfPayable.processPayment("bitcoin");
	}
}
