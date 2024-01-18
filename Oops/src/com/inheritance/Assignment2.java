package com.inheritance;

class WageEmployee extends Employee
{
	int hrs;
	int rate;
	float salary;
	
	public WageEmployee() {
		this.hrs = 0;
		this.rate = 0;
		this.salary = 0;
	}
	
	public WageEmployee(int id, String name, String dOB, int hrs, int rate) {
		super(id,name, dOB);
		this.hrs= hrs;
		this.rate = rate;
		this.salary = computeSalary();
	}
	
	public int computeSalary()
	{
		return hrs * rate;
	}

	@Override
	public String toString() {
		return "WageEmployeeId: "+ id + "\nName: "+name+"\nDob: "+dOB+"\nHrs: "
				+hrs+"\nRate: "+rate+"\nSalary: "+salary;
	}
	
}


public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WageEmployee we1 = new WageEmployee(1, "Hari", "03/09/1999", 40, 700);
//		we1.computeSalary();
		System.out.println(we1);
		
		System.out.println();
		
		WageEmployee we2 = new WageEmployee(2, "Swati", "03/09/2002", 32, 600);
//		we2.computeSalary();
		System.out.println(we2);
	}

}
