package com.demo.oop;

public class Rectangle {
	int len, breadth;
	
	void insert(int l, int b) {
		len = l;
		breadth = b;
	}
	
	void calculateArea() {
		int area = len * breadth;
		System.out.println("The area is : " + area);
	}
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.insert(2, 5);
		Rectangle r2 = new Rectangle();
		r2.insert(3, 8);
		
		r1.calculateArea();
		r2.calculateArea();
	}
}
