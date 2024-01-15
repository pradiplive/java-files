package com.exception;
import java.util.Scanner;


public class ExceptionBlocks {
	 public static void main(String[] args) {
		
//		 Scanner
		 //Scanner --class --java.util--import
		 //Stream --in/out/err
		 //Object
		 //Scanner s = new Scanner(System.in);
		 /*works on tokens
		  * 
		  * Methods of scanner class
		  * -- next() -- String
		  * -- nextInt() --Integer
		  * -- nextByte() --Bytes 
		  * -- nextFloat()
		  * 
		  * 
		  * */
		 
//		 Scanner sc = new Scanner(System.in);
//		 System.out.println("Enter the ID, Name , Salary :");
//		 int id = sc.nextInt();
//		 String name = sc.next();
//		 float Salary = sc.nextFloat();
//		 System.out.println("id"+id+"\n Name:"+name+"\n Salary"+Salary);
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("ddter the 2 Number: ");
		 int arr[] = new int[3];
		 arr[0] = sc.nextInt();
		 arr[1] = sc.nextInt();
		 arr[2] = arr[0] / arr[1];
		 
		 try {
			 
		 }
		 catch(ArithmeticException e) {
			 System.out.println(e);
		 }
		 catch(ArrayIndexOutOfBoundsException e) {
			 System.out.println(e);
		 }
		 catch(StringIndexOutOfBoundsException e) {
			 System.out.println(e);
		 }
	}
}
