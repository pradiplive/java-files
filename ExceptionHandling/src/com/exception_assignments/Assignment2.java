package com.exception_assignments;

class NumberOperations{
	int a;
	int b;
	public NumberOperations(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int add() {
		return a + b;
	}
	public int sub() {
		return a - b;
	}
	public int multi() {
		return a * b;
	}
	public void div() {
		try {
//			if( b==0 ) {
//				ArithmeticException e = new ArithmeticException("Divide be zero exception occur.");
//				throw e;
//			}
//			else {
//				return a / b;
//			}
			
			System.out.println(a / b);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
//			return 0;
		}
	}
}

public class Assignment2 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberOperations nOperation = new NumberOperations(10, 0);
		System.out.println(nOperation.add() );
		nOperation.div();
		System.out.println(nOperation.sub() );
		System.out.println(nOperation.multi() );
		System.out.println( );
	}

}
