package com.exception_assignments;

import com.custom_exception.InsufficientBalanceException;

class Account{
	int balance;
	public Account(int b) {
		balance = b;
	}
	void withdraw(int amount) {
		try {
			if(amount > balance) {
				
				InsufficientBalanceException e = new InsufficientBalanceException("Balance is not sufficient buddy.");
				throw e;
			}else {
				balance = balance - amount;
				System.out.println("Withdrawal Successfull.");
				System.out.println("Your Available Balance is " + balance);
				
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account(50000);
		acc.withdraw(20000);
		acc.withdraw(60000);
		acc.withdraw(10000);

	}

}
