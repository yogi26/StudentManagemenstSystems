package com.StudentManagementSystem;

public class SportsActivity implements Payable{

	private double equipmentCharges;
	private double tournamentFees;
	private double uniformCost;
	private double discountForStatePlayers;
	private double finalAmount;
	
	
	
	public SportsActivity(double equipmentCharges, double tournamentFees, double uniformCost,
			double discountForStatePlayers) {
		super();
		this.equipmentCharges = equipmentCharges;
		this.tournamentFees = tournamentFees;
		this.uniformCost = uniformCost;
		this.discountForStatePlayers = discountForStatePlayers;
	}
	@Override
	public double calculatePayment() {
		finalAmount=equipmentCharges+tournamentFees+uniformCost-discountForStatePlayers;
		return finalAmount;
	}
	@Override
	public void generateReceipt() {
		System.out.println("---------Generating fees recipt---------");
		System.out.println("Equipment Charges            :   " + equipmentCharges);
		System.out.println("Tournament Fees              :   " + tournamentFees);
		System.out.println("Team Uniform Costs           :   " + uniformCost);
		System.out.println("Discount for State Players   :   " + discountForStatePlayers);
		System.out.println("FINAL PAYMENT                :   " +finalAmount);
		System.out.println("---------GOOD DAY!---------");
		
	}
	@Override
	public double getDiscount() {
		return discountForStatePlayers;
	}
}
