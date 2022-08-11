package com.demo.control;

public class ControlStatements {
	public static void main(String[] args) {
		int NishantAge = 23;
		int AkshayAge = 26;
		
		if(NishantAge > AkshayAge) {
			System.out.println("Nishant is elder than Akshay.");
		} else if (NishantAge == AkshayAge) {
			System.out.println("Both have the same age.");
		} else {
			System.out.println("Akshay is elder than Nishant.");
		}
		
		String NishantAddress = "BLR";
		
		if (NishantAddress == "BLR") {
			System.out.println("Nishant's Address is Bangalore.");
		} else {
			System.out.println("Nishant's Address is not Bangalore.");
		}
	}
}
