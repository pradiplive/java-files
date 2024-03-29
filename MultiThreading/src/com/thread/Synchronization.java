package com.thread;
class PrintTable{
//	synchronized public void table(int no) {
	public void table(int no) {
		synchronized (this) {
			for(int i=1; i<=10; i++){
				System.out.println(Thread.currentThread().getName() + "\t" + i*no + "\t" + Thread.currentThread().getPriority());
				try
				{
					Thread.sleep(2000); //Non-Runnable
				}catch (Exception e) {
					System.out.println(e);
				}
			}
		}
		
	}
}

class FirstThread extends Thread {
	PrintTable t;	// reference

	public FirstThread(PrintTable t) {
		this.t = t;
	}
	
	public void run() {
		t.table(5);
	}	
}

class SecondThread extends Thread {
	PrintTable t;	// reference

	public SecondThread(PrintTable t) {
		this.t = t;
	}
	
	public void run() {
		t.table(9);
	}
}
public class Synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintTable t = new PrintTable();
		
		FirstThread fThread = new FirstThread(t);
		
		SecondThread sThread = new SecondThread(t);
		
		fThread.start();
		sThread.start();
		
	}

}
