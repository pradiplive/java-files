package com.cybage;

import java.util.Scanner;

class Emp{
	int id;
	String name;
	String designation;
	float salary;
	
	public Emp(int id, String name, String designation) {
		this.id = id;
		this.name = name;
		this.designation = designation;
	}
	void employeeDetails() {
		System.out.println("ID: "+id + "\nName: "+name+"\nDesignation: "+designation+"\nSalary: "+salary);
	}
}

class PartTimeEmployee extends Emp{
	int noOfHrs, hrsSal;
	public PartTimeEmployee(int id, String name, String designation, int noOfHrs, int hrsSal) {
		// super(); 	// call to parents default contructor
		super(id, name, designation);
		this.noOfHrs = noOfHrs;
		this.hrsSal = hrsSal;
	}
	void calSal() {
		super.salary = noOfHrs*hrsSal;	
	}
}

class FullTimeEmployee extends Emp{
	int FixedSalary;
	int ExtraNOHrs; 
	int ExtraSalary;
	public FullTimeEmployee(int id, String name, String designation, int fixedSalary, int extraNOHrs, int extraSalary) {
		super(id, name, designation);
		FixedSalary = fixedSalary;
		ExtraNOHrs = extraNOHrs;
		ExtraSalary = extraSalary;
	}
	void calSal() {
		super.salary = FixedSalary + (ExtraNOHrs*ExtraSalary);
	}
	
}

public class Inheritance {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PartTimeEmployee pemp = new PartTimeEmployee(3, "Swapnil","SDE",40, 500);
		pemp.calSal();
//		pemp.employeeDetails();
		
		FullTimeEmployee femp = new FullTimeEmployee(4, "Shyam", "Devops Engineer", 20000, 20, 500);
		femp.calSal();
//		femp.employeeDetails();
		int choice = sc.nextInt();
		switch(choice) {
			case 1:
				pemp.employeeDetails();
				break;
			case 2:
				femp.employeeDetails();
				break;
		}
	}

}
