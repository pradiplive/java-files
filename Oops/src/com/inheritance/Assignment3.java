package com.inheritance;

class SalesPerson extends WageEmployee {
	int sales;
	int commision;
	float salary;
	
	public SalesPerson(int id,String name, String dOB,int hrs, int rate, int sales, int commision) {
		super(id, name, dOB, hrs, rate);
		this.sales = sales;
		this.commision = commision;
		this.salary = computeSalary();
	}
	
	@Override
	public int computeSalary() {
		return sales + commision;
	}
	
	@Override
	public String toString() {
		return "SalesPersonId: "+ id + "\nName: "+name+"\nDob: "+dOB+"\nSales: "
				+sales+"\ncommision: "+commision+"\nSalary: "+salary;
	}
	
}

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalesPerson sp1 = new SalesPerson(1, "Ramu", "07/03/1995", 32, 500,  40000, 5000);
		System.out.println(sp1);
		
		System.out.println();
		
		SalesPerson sp2 = new SalesPerson(2, "Shyamu", "12/04/1997",40, 700, 50000, 7000);
		System.out.println(sp2);

	}

}
