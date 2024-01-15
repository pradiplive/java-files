package com.polymorphism;

/*
 * final keyword: 
 * 		1) when we declare final method in parent,
 * 		   we cannot override parent method inside child class 
 * 		2) we cannot inherit parent inside child class with final keyword.
 * */

final class ABC{
	void show() {
		System.out.println("Class ABC");
	}
}
//class PQR extends ABC{  // it give error due to final.
//	void show() {
//		System.out.println("Class PQR");
//	}
//}

public class FinalMethodAndClass {
	public static void main(String[] args) {
		ABC a = new ABC();
		a.show();
	}

}
