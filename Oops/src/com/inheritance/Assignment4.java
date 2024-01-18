package com.inheritance;

class Manager extends Employee
{
	int fixedsalary=0;
	int incentives=0;
	int salary =0;
	
	public Manager(int id, String name, String dOB,int fixedSalary, int incentives) {
		super(id, name, dOB);
		this.fixedsalary = fixedSalary;
		this.incentives = incentives;
		this.salary = computeSalary();
	}
	
	
	public int computeSalary() {
		return fixedsalary + incentives;
	}
	
	@Override
	public String toString() {
		return "ManagerId: "+ id + "\nName: "+name+"\nDob: "+dOB+"\nfixedSalary: "
				+fixedsalary+"\nincentives: "+incentives+"\nSalary: "+salary;
	}
	
	
}


public class Assignment4 {

	public static void main(String[] args) {

		Manager m1 = new Manager(1, "Rohit", "04/11/1998", 50000, 15000);
		System.out.println(m1);
		
		System.out.println();
		
		Manager m2 = new Manager(2, "Rahul", "24/12/1995", 60000, 10000);
		System.out.println(m2);

	}

}
