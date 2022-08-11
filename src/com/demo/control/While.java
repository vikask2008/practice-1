package com.demo.control;

public class While {
	public static void main(String[] args) {
		int age = 12;
		while (age<18) {
			System.out.println("You are underage, you are " + age);
			age = age + 1;
		}
		int rows=5;
		int i=1;
		while (i <= rows) {
			int j=1;
			while (j<=(rows-i)) {
				System.out.print(" ");
				j = j + 1;
			}
			j=1;
			while (j<=i) {
				System.out.print("* ");
				j = j + 1;
			}
			System.out.println();
			i = i + 1;
		}
	}
}
