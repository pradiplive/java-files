package com.abstraction;

import java.util.Random;

class Medicine{
	String companyName="FarmEasy";
	String address="8,F,Gandhi Nagar, Mumbai.400007";
	void displayLabel() {
		System.out.println("Company Name: "+ companyName+ "\nAdress: "+ address);
	}
}

class Tablet extends Medicine{
	void displayLabel() {
		System.out.println("Have it after lunch");
	}
}
class Syrup extends Medicine{
	void displayLabel() {
		System.out.println("Store in a cool dry place");
	}
}
class Ointment extends Medicine{
	void displayLabel() {
		System.out.println("For external use only");
	}
}

public class TestMedicine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] medicine  = new int[10]; 
		
		Random random = new Random();
		
		for (int i =0; i<10; i++) {
			
		}
		

	}

}
