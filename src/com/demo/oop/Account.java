package com.demo.oop;

public class Account {
	int acc_no;
	String name;
	float amount;
	
	void insert(int acc, String n, float amt) {
		acc_no = acc;
		name = n;
		amount = amt;
	}
	
	void deposit(float amt) {
		amount = amount + amt;
		System.out.println(amt + " has been deposited.");
	}
	
	void checkBalance() {
		System.out.println("The current balance is : Rupees: " + amount);
	}
	
	void withdraw(float amt) {
		if(amount >= amt) {
			amount = amount - amt;
			System.out.println(amt + " has been withdrawn.");
		} else {
			System.out.println("Insufficient balance for withdrawal.");
		}
	}
	
	public static void main(String[] args) {
		Account a = new Account();
		a.insert(56789, "Nishant", 100000);
		a.deposit(10000);
		a.checkBalance();
		a.withdraw(500000);
		a.checkBalance();
	}
}
