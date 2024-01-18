package com.assignments;

class Numbers extends Thread {
	
//	public void even(int num) {
//		System.out.println("Even: "+num);
//	}
//	public void odd(int num) {
//		System.out.println("odd: "+num);
//	}
	static int even=0;
	static int odd=1;
	public void evenOdd() {
		
	}
	
}


public class EvenOddAssignment extends Thread{
	
	public static void main(String[] args) {
		Numbers thr1 = new Numbers();
		thr1.start();
		Numbers thr2 = new Numbers();
		thr2.start();
		
		
//		for(int i=0; i<10; i++) {
//			if(i%2==0) {
//				thr1.even(i);
//			}else {
//				thr2.odd(i);
//			}
//		}
		

	}

}
