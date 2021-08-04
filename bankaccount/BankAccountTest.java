package com.wp.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount account1 = new BankAccount(300.00, 200.00);
		System.out.println(account1.Show());
		System.out.println(account1.Deposit(50, "checking"));
		System.out.println(account1.Deposit(100, "savings"));
		System.out.println(account1.Show());
		
		
		System.out.println(account1.Withdraw(100, "checking"));
		System.out.println(account1.Withdraw(100, "savings"));
		System.out.println(account1.Show());
		
		System.out.println(BankAccount.howMany());
		
		
		System.out.println(account1.Show());
	}

}
