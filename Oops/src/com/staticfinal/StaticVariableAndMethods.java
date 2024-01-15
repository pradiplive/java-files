package com.staticfinal;

/*
 * Static Method :
 * if method signature/prototype starts with static keywords we call it as static variable
 * static method can access only static variables from outside.
 * */

class Circle
{
	static float pi = 3.14f;
	static float ans;
	
	
	static void circleArea(float r)
	{
		ans = pi *r * r ;
		System.out.println("Area of the circle:"+ ans);
	}
	
	static void circleCircum(float r)
	{
		ans = 2* pi *r;
		System.out.println("Cirle circum:"+ ans);
	}
}

public class StaticVariableAndMethods {
	
	static
	{
		System.out.println("Static Block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Circle c = new Circle();
		Circle.circleArea(5.87f);
		Circle.circleCircum(5.87f);

	}

}
