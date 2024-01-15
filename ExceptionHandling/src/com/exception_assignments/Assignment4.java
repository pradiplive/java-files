package com.exception_assignments;

import java.util.Scanner;

import com.custom_exception.AgeAndNationalityException;

class Voter{
	int age;
	String nationality;
	public Voter(int age, String nationality) {
//		super();
		this.age = age;
		this.nationality = nationality;
	}
	@Override
	public String toString() {
		return "Voter [age=" + age + ", nationality=" + nationality + "]";
	}
	
	public boolean check() {	
		try {
			if(age < 18) {
				AgeAndNationalityException eAge = new AgeAndNationalityException(age);
				throw eAge;
			}
			if(nationality != "india") {
				AgeAndNationalityException eNationality = new AgeAndNationalityException("You are Foreiner!!");
				throw eNationality;
			}
			else {
				System.out.println("You can Vote !!!");
				toString();
			}
		}
		catch(Exception e){
			System.out.println(e);
			return false;
		}
		return true;
	}	
}

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		String nationality = sc.next();
		
		Voter vt = new Voter(age, nationality);
		vt.check();

	}

}
