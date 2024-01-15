package com.aggregation;

public class Date {
	

	int dd, mm, yyyy;
	public Date(int dd, int mm, int yyyy) {
		super();
		
		this.dd = dd;
		this.mm = mm;
		this.yyyy = yyyy;
	}
	
	// below class is defined in object class. It is override here.
	@Override
	public String toString() {
		return "MyDate [dd=" + dd + ", mm=" + mm + ", yyyy=" + yyyy + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date dob = new Date(01,06,2001);
		System.out.println("Date: "+ dob);
		
	}

}
