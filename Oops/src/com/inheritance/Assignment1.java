package com.inheritance;

class Employee{
	int id;
	String name;
	String dOB;
	public Employee() {
		this.id  = 0;
		this.name = "";
		this.dOB = "";
	}
	public Employee(int id, String name, String dOB) {
		this.id = id;
		this.name = name;
		this.dOB = dOB;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", DOB=" + dOB + "]";
	}
	
}

public class Assignment1 extends Object{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(1,"Ramesh", "21/08/2000");
		System.out.println(emp1);;
		
		Employee emp2 = new Employee(2,"suresh", "21/08/2001");
		System.out.println(emp2);;
		
		Employee emp3 = new Employee(3,"Naresh", "18/08/1999");
		System.out.println(emp3);;

	}

}
