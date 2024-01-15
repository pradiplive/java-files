package com.abstraction;

interface M1{
	void add(int a, int b);
	void substract(int a, int b);
	static void division(int x, int y) {
		System.out.println("Division: "+ (x / y));
	}
	default void multiply(int x, int y) {
		System.out.println("Multiplication: " + (x * y));
	}
}
interface M2{
	void square(int a);
	void doble(int a);
}

class M3 implements M1, M2{
	public void add(int a, int b) {
		System.out.println("Addition: " + (a + b));
	}
	public void substract(int a, int b) {
		System.out.println("Substraction: " + (a - b));
	}
	public void square(int a) {
		System.out.println("Square: " + (a * a));
	}
	public void doble(int a) {
		System.out.println("Double: " + (a * 2));
	}
}
public class InterfaceAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M3 m = new M3();
		m.add(10, 20);
		m.substract(100, 20);
		m.square(4);
		m.doble(8);
		
		M1.division(30, 5);
		m.multiply(3, 8);
		

	}

}
