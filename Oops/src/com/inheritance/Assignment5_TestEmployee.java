package com.inheritance;

import java.util.Scanner;

public class Assignment5_TestEmployee {
	public static void main(String[] args) {
		Employee empArr[] = new Employee[10];
		
		Scanner sc = new Scanner(System.in);
		
		int i=0;
		while(i<10) {
			System.out.println("Enter choice");
			System.out.println("1. Wage Employee");
			System.out.println("2. Sales Person");
			System.out.println("3. Manager");
			System.out.println("4. Display Employees");
			System.out.println("5. Exit");
			
			int ch = sc.nextInt();
			boolean flag=false;
			
			switch(ch) {
				case 1:
					System.out.print("Enter Id: ");
					int id = sc.nextInt();
					System.out.print("Enter Name: ");
					String empName = sc.next();
					System.out.print("Enter DOB: ");
					String dOB = sc.next();
					System.out.print("Enter Hrs: ");
					int hrs = sc.nextInt();
					System.out.print("Enter rate: ");
					int rate = sc.nextInt();
					empArr[i] = new WageEmployee(id, empName, dOB, hrs, rate);
					
//					System.out.println( empArr[i] );
					break;
					
				case 2: 
					System.out.print("Enter Id: ");
					int id1 = sc.nextInt();
					System.out.print("Enter Name: ");
					String empName1 = sc.next();
					System.out.print("Enter DOB: ");
					String dOB1 = sc.next();
					System.out.print("Enter Hrs: ");
					int hrs1 = sc.nextInt();
					System.out.print("Enter rate: ");
					int rate1 = sc.nextInt();
					System.out.print("Enter Sales: ");
					int sales = sc.nextInt();
					System.out.print("Enter Commision: ");
					int commision = sc.nextInt();
					empArr[i] = new SalesPerson(id1, empName1, dOB1 ,hrs1 , rate1, sales, commision);
					
//					System.out.println( empArr[i] );
					break;
					
				case 3:
					System.out.print("Enter Id: ");
					int id2 = sc.nextInt();
					System.out.print("Enter Name: ");
					String empName2 = sc.next();
					System.out.print("Enter DOB: ");
					String dOB2 = sc.next();
					System.out.print("Enter fixedSalary: ");
					int fixedSalary = sc.nextInt();
					System.out.print("Enter incentives: ");
					int incentives = sc.nextInt();
					empArr[i] = new Manager(id2 , empName2, dOB2, fixedSalary, incentives);
//					System.out.println( empArr[i] );
					break;
					
				case 4:
					System.out.println("--------Employee are----------");
					for(int j=0; j<i; j++) {
						System.out.println(empArr[j]);
					}
					continue;
					
				case 5:
					flag = true;
					System.out.println("--------Program Exited--------");
					break;
			}
			
			if(flag) {
				break;
			}
			i++;
			
		}	
		
	}
	

}
