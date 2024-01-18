package com.collections;

import java.util.Scanner;
import java.util.Vector;

class Book
{
	String bookName;
	String publisher;
	int price;
	public Book(String bookName, String publisher, int price) {
		super();
		this.bookName = bookName;
		this.publisher = publisher;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", publisher=" + publisher + ", price=" + price + "]";
	}
}

class Author
{
	String authorName;
	int age;
	Vector<Book> books;
	public Author(String authorName, int age, Vector<Book> books) {
		super();
		this.authorName = authorName;
		this.age = age;
		this.books = books;
	}
}


public class Assignment3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the AuthorName, Age , Books");
		String authorName = sc.next();
		int age = sc.nextInt();
		String books = sc.next();
		System.out.println("Enter the no of books:");
		int no =sc.nextInt();
		Vector<Book> v = new Vector<>();
		
		for(int i=0;i<no;i++)
		{
			System.out.println("Enter the Book Name, Publisher, Price");
			String bName = sc.next();
			String publisher = sc.next();
			int price = sc.nextInt();
			
			Book b = new Book(bName, publisher, price);
			v.add(b);
			
		}
		
		//------------------------------
		Author au = new Author(authorName, age, v);
		System.out.println("Author Name: "+ au.authorName);
		System.out.println("Author Age: "+au.age);
		System.out.println("Author Books are :");
		
		for(Book book: au.books) {
			System.out.println(book);
		}
		
	}
}
