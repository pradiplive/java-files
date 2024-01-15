package com.thread;


class Account2
{
	String accountHolderName;
	int actBal;
	
	public Account2(String accountHolderName, int actBal) {
		super();
		this.accountHolderName = accountHolderName;
		this.actBal = actBal;
	}
	
	synchronized public void withdraw(int wbal)throws Exception
	{
		System.out.println("Going Withdraw!!!!");
		if(wbal>actBal)
		{
//			InsufficientFundsException e=new InsufficientFundsException();
//			throw e;
			System.out.println("InsufficientFundsException");
			wait();
		}
		this.actBal=this.actBal-wbal;
		System.out.println("Remainning Balance after withdraw is :"+actBal);
	}
	synchronized public void deposit(int dbal)
	{
		System.out.println("Going Deposit!!!!");
		this.actBal=this.actBal+dbal;
		System.out.println(" Balance after deposit is :"+actBal);
		notify();
	}
	
}
public class BankAssignSonali {

	public static void main(String[] args) {
		Account2 c=new Account2("Sonali Maind", 50000);
		
		
		Runnable w=new Runnable() {
			
			public void run()
			{
				try
				{
					c.withdraw(70000);
				}
				catch (Exception e) {
					System.out.println(e);
				}
			}
		};
		
		Runnable d=new Runnable() {
			public void run() {
				c.deposit(40000);
			}
		};
		Thread t1=new Thread(w);
		Thread t2=new Thread(d);
	
		t1.start();
		t2.start();
		
	}

}








