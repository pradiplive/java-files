package com.exception;

import com.custom_exception.AgeOutOfRangeException;

class UserValidation 
{
	public  static void validateUserAge(int age) throws Exception {
		if(age<18) {
//			ArrayIndexOutOfBoundsException obj1 = new ArrayIndexOutOfBoundsException();
//			InputMismatchException obj2 = new InputMismatchException();
//			IOException obj3 = new IOException();
////			throw obj1,obj2;  error 
////			throw obj3;
			
//			Custom Exception
			AgeOutOfRangeException obj = new AgeOutOfRangeException("Age must be above 18");
			throw obj;
		}else
		{
			System.out.println("Welcome to Pune");
		}
	}
}

public class ThrowAndThrowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		UserValidation.validateUserAge(15);
		}
		catch(Exception e)
		{
//			e.printStackTrace();
//			e.getMessage();
			System.out.println(e);
		}
		System.out.println("rest of the code");;
		
	}

}
