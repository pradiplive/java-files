package com.collections;

import java.util.Scanner;
import java.util.Vector;

class Employee
{
	int id;
	String name;
	String designation;
	
	public Employee(int id, String name, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [ id=" + id + ", name=" + name + ", designation=" + designation + "]";
	}
}

class ProjectTeam 
{
	String managerName;
	String projectName;
	String clientName;
	
	Vector<Employee> employees;

	public ProjectTeam(String managerName, String projectName, String clientName, Vector<Employee> employees) {
		super();
		this.managerName = managerName;
		this.projectName = projectName;
		this.clientName = clientName;
		this.employees = employees;
	}

//	@Override
//	public String toString() {
//		return "ProjectTeam [managerName=" + managerName + ", projectName=" + projectName + ", clientName=" + clientName
//				+ ",\n employees=" + employees + "]";
//	}
}

public class VectorExample {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Project name,Manager Name,Client name");
		String projectName = s.next();
		String managerName = s.next();
		String clientName = s.next();
		System.out.println("Enter count of project resources:");
		int count =s.nextInt();
		Vector<Employee> v = new Vector<>();
		for (int i=0; i<count;i++)
		{
			System.out.println("Enter Id,Name,Designation of the Employees");
			int id =s.nextInt();
			String name = s.next();
			String designation =s.next();
			
			Employee e = new Employee(id, name, designation);
//			v.add(e);
			v.addElement(e);
		}
		
		
		ProjectTeam pt = new ProjectTeam(managerName, projectName, clientName, v);
		System.out.println("Project Name:" + pt.projectName);
		System.out.println("Client Nmae:" + pt.clientName);
		System.out.println("Manager Nmae:"+ pt.managerName);
		
		Vector<Employee> emps = pt.employees;
		for( Employee emp :emps)
		{
			System.out.println(emp);
		}
	}
}
