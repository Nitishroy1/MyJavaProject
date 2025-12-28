package com.oops.constructors;

public class Lone {
	private double principalAmount;
	private double interestRate;
	private int durationMonths;
	
	public Lone(double principalAmount, double interestRate, int durationMonths) {
		super();
		
		if(principalAmount<=0) {
			System.err.println("Error! value must be grater then 0.");
		}
		if(interestRate<=0) {
			System.err.println("Error! value must be grater then 0.");
		}
		
		if(durationMonths<=0) {
			System.err.println("Error! value must be grater then 0.");
		}
		this.principalAmount = principalAmount;
		this.interestRate = interestRate;
		this.durationMonths = durationMonths;
	}

	@Override
	public String toString() {
		return "Lone [principalAmount=" + principalAmount + ", interestRate=" + interestRate + ", durationMonths="
				+ durationMonths + "]";
	}

	public double getPrincipalAmount() {
		return principalAmount;
	}

	public void setPrincipalAmount(double principalAmount) {
		this.principalAmount = principalAmount;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public int getDurationMonths() {
		return durationMonths;
	}

	public void setDurationMonths(int durationMonths) {
		this.durationMonths = durationMonths;
	}
	
	public void calculateSimpleInterest() {
		double totalRepaymentAmount;
		
		totalRepaymentAmount=principalAmount *(interestRate + durationMonths);
		
		System.out.println("TotalRepayment Amount: "+totalRepaymentAmount);
		
	}
	
	
	
	

}
