package com.demo.oop;

public class Employee {
	
	String name;
	int year;
	String address;
	
	public Employee() {

	}
	
	private Employee(String n, int y, String add) {
		name = n;
		year = y;
		address = add;
	}
	
	void printDetails() {
		System.out.println("Employee name : " + name + " Year of joining : " + year + " Address : " + address);
	}
	public static void main(String[] args) {
		Employee e1 = new Employee("Robert" , 1994 , "64C-WallsStreet");
		e1.printDetails();
		Employee e2 = new Employee("Sam" , 2000 , "68D-WallsStreet");
		e2.printDetails();
		Employee e3 = new Employee("John" , 1999 , "26B-WallsStreet");
		e3.printDetails();		
	}
}
