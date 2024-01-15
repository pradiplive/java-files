package com.custom_exception;

public class AgeAndNationalityException extends Exception{
	public AgeAndNationalityException(int age) {
		super("Your are under age.");
	}
	public AgeAndNationalityException(String str) {
		super(str);
	}
}
