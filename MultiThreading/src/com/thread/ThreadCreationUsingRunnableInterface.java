package com.thread;

import java.util.Iterator;

class MyThread2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++){
			System.out.println(Thread.currentThread().getName() + "\t" + i*5 + "\t" + Thread.currentThread().getPriority());
			try
			{
				Thread.sleep(2000); //Non-Runnable
			}catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	
}

public class ThreadCreationUsingRunnableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Your class object will not act as thread
		MyThread2 obj1 = new MyThread2();
		MyThread2 obj2 = new MyThread2();
		
		//convert them into thread
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
	}

}
