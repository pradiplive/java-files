package com.thread;

import com.custom_exception.InsufficientBalanceException;

class Account{
	int balance;
	public Account(int b) {
		balance = b;
	}
	synchronized public void withdraw(int amount) throws Exception{
		System.out.println("Withdrawal start");
//		try {
			if(amount > balance) {
				
//				InsufficientBalanceException e = new InsufficientBalanceException("Balance is not sufficient buddy.");
//				throw e;
				System.out.println("InsufficientBalanceException");
				wait();
			}
//			else {
				balance = balance - amount;
				System.out.println("Withdrawal Successfull.");
				System.out.println("Your Available Balance is " + balance);
				
//			}
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
	}
	
  synchronized	public void deposit(int deposit) {
	  System.out.println("Deposit start");
		balance = balance + deposit;
		System.out.println("Deposit Successfull.");
		System.out.println("Your Available Balance is " + balance);
		notify();
	}
}

public class BankAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account(50000);
		
		Runnable w = new Runnable() { // Anonymous class
			@Override
			public void run() {
				try
				{
					acc.withdraw(60000);
				}catch (Exception e) {
					System.out.println(e);
				}	
			}
		};
		
		Runnable d = new Runnable() { // Anonymous class			
				@Override
				public void run() {
					try
					{
						acc.deposit(40000);
					}catch (Exception e) {
						System.out.println(e);
					}
				}
		};
		
		Thread t1 = new Thread(w);
		Thread t2 = new Thread(d);
		t1.start();
		t2.start();
		
	

	}
}

