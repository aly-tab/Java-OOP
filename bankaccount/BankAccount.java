package com.wp.bankaccount;

public class BankAccount {
	private double checkingBalance;
	private double savingsBalance;
	
	private static int numberOfAccounts;
	
	public BankAccount(double checking, double savings) {
		this.checkingBalance = checking;
		this.savingsBalance = savings;
		numberOfAccounts++;
	}
	
	public static int howMany() {
		return numberOfAccounts;
	}
	
	public double getChecking() {
		return checkingBalance;
	}
	
	private double getSavings() {
		return savingsBalance;
	}
	
	public String Deposit(double amount, String account) {
		if (account == "checking") {
			checkingBalance = this.getChecking() + amount;
			return "Checking balance: " + this.getChecking();
		} else if (account == "savings") {
			savingsBalance = this.getSavings() + amount;
			return "Savings balance: " + this.getSavings();			
		} else {
			return "error";
		}
	}
	
	public String Withdraw(double amount, String account) {
		if (account == "checking") {
			if (this.getChecking() > amount) {
				checkingBalance = this.getChecking() - amount;
				return "Checking balance: " + this.getChecking();
			} else {
				return "insufficient funds";
			}
		} else if (account == "savings") {
			if (this.getSavings() > amount) {
				savingsBalance = this.getSavings() - amount;
				return "Savings balance: " + this.getSavings();	
			} else {
				return "insufficient funds";
			}
		} else {
			return "error";
		}
	}
	
	public String Show() {
		return "Checking balance: " + this.getChecking() + " Savings balance: " + this.getSavings();
	}
}
