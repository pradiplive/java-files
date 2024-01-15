package com.cybage;

//class Abc {
//	int val= 400;
//	void show()
//	{
//		System.out.println("In the ABC class");
//	}
//}
//
//class PQR extends Abc
//{
//	int val = 700;
//	void show()
//	{
//		System.out.println("Value is :"+ super.val); 
//		super.show();
//	}
//}
	class A
	{
		 A() {
			System.out.println("A");
		}
	}
	
	class B extends A
	{
		B()
		{
			System.out.println("B");
		}
	}
	
	class C 
	{
		
	}



public class SuperKeywordExample  
{
	public static void main(String[] args) {
		
//		PQR pqr = new PQR();
//		pqr.show();
		
		B b= new B();
	
	}
}
