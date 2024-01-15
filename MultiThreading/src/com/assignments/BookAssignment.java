package com.assignments;

import java.util.Scanner;

class Book {
	String bokName;
	String authorName;
	int Price;
	public Book(String bokName, String authorName, int price) {
		this.bokName = bokName;
		this.authorName = authorName;
		Price = price;
	}
	@Override
	public String toString() {
		return "Book [bokName=" + bokName + ", authorName=" + authorName + ", Price=" + Price + "]";
	}
	
	
}

public class BookAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book bk[] = new Book[5];
		for(int i=0; i<5; i++) {
			System.out.println("Enter bookName, authorName and Price");
			Scanner sc = new Scanner(System.in);
			String bName = sc.next();
			String aName = sc.next();
			int price = sc.nextInt();
			bk[i] = new Book(bName, aName, price);
//			bk[i].toString();
			System.out.println(bk[i]);
		}
	}

}
//Enter bookName, authorName and Price
//java pradip 200
//Book [bokName=java, authorName=pradip, Price=200]
//Enter bookName, authorName and Price
//cpp swapnil 300
//Book [bokName=cpp, authorName=swapnil, Price=300]
//Enter bookName, authorName and Price
//python ram 400
//Book [bokName=python, authorName=ram, Price=400]
//Enter bookName, authorName and Price
//Devops shyam 500
//Book [bokName=Devops, authorName=shyam, Price=500]
//Enter bookName, authorName and Price
//Php rohit 600
//Book [bokName=Php, authorName=rohit, Price=600]
