package com.demo.control;

public class For {
	public static void main(String[] args) {
		for (int age = 14; age < 18; age++) {
			System.out.println("You are underage to drive, you are " + age);
		}
		int rows=5;
		int i;
		for (i = 1; i <=rows; i++) {
			int j;
			for (j=1; j<=(rows-i); j++) {
				System.out.print(" ");
			}
			for  (j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (i = rows-1; i>=1; i--) {
			int j;
			for (j=1; j<=(rows-i); j++) {
				System.out.print(" ");
			}
			for  (j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
