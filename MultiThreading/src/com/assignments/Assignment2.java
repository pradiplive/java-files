package com.assignments;

class Counter {
	int count=30;
	public synchronized void increment() {
		count++;
	}
	public synchronized void decrement() {
		count--;
	}
	public synchronized int getValue() {
		return count;
	}
}

class Incrementer extends Thread {
	Counter c ;	// reference
	public Incrementer(Counter c) {
		this.c = c;
	}
	public void run() {
		int i=0;
		while(i<5) {
			c.increment();
			i++;
		}
	}
}

class Decrementer  extends Thread{
	Counter c ;	// reference
	public Decrementer(Counter c) {
		this.c = c;
	}
	public void run() {
		int i=0;
		while(i<3) {
			c.decrement();
			i++;
		}
	}
}

public class Assignment2 {
	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();
		Incrementer inc[] = new Incrementer[2];
		
		Decrementer dec[] = new Decrementer[2];
		
		for(int i=0; i<2; i++) {
			inc[i] = new Incrementer(c);
			inc[i].start();
			dec[i] = new Decrementer(c);
			dec[i].start();
		}
		for(int i=0; i<2; i++) {
			inc[i].join();
			dec[i].join();
		}
		
		System.out.println("Value of count is : "+ c.getValue());
		
	}
}
