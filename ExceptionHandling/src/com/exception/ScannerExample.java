package com.exception;

import java.util.Scanner;

class Book
{
	
	
	String bookName;
	String authorName;
	int price;
	int availability;
	public Book(String bookName, String authorName, int price, int availability) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.price = price;
		this.availability = availability;
	}
	
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", authorName=" + authorName + ", price=" + price + ", availability="
				+ availability + "]";
	}
}



public class ScannerExample {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String bname = sc.next();
		String aname = sc.next();
		int price = sc.nextInt();
		int avail = sc.nextInt();
		
		Book b = new Book(bname,aname,price,avail);
		System.out.println(b);
	}
}
