package com.polymorphism;

/*Polymorphism: Single task can perform in different ways.
 * Two types: 1) Compile Time- Method Overloading
 * 					- on basic of no of agruments and data of the argument passed during 
 * 						function call compiler binds function with function definition 
 * 						during compilation so it is known as polymoprphism
 * 
 * 			  2) Run Time - Method overriding.
 * 
 * */

class Shape{
	float ans;
	void area(float r) {
		ans = 3.14f * r * r;
		System.out.println("Area of Circle is: " + ans);
	}
	void area(int s) {
		ans = s * s;
		System.out.println("\nArea of Square" + ans);
	}
	
	void area(float h, float b) {
		ans = 0.5f * h * b;
		System.out.println("\nArea of Triangle: "+ans);
		
	}
}

class Overloading{
	public static void main(String[] args) {
		Shape s = new Shape();
		s.area(2.5f);
		s.area(5);
		s.area(8, 4.5f);
		
	}
}