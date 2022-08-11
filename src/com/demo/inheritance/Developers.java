package com.demo.inheritance;

public class Developers extends Employee {
	int bonus = 15000;
	public static void main(String[] args) {
		Developers d1 = new Developers();
		System.out.println("Developer's base salary is : " + d1.baseSalary);
		System.out.println("Developer's bonus is : " + d1.bonus);
		System.out.println("Developer's total payment is : " + (d1.bonus + d1.baseSalary));
		HR h1 = new HR();
		h1.totalPayment();
	}
}

class Employee {
	int id;
	float baseSalary = 50000;
}

class HR extends Employee {
	int bonus = 10000;
	
	void totalPayment() {
		System.out.println("total payment : " + (baseSalary + bonus));
	}
}