package com.cybage;

class Book
{
	String bookName;
	String authorName;
	int price;
//	final String publisher = "Navneet Publication"; // Final Variable
//	static final String publisher; // Blank final variable
	
	
	static final String publisher= "Navneet";
	
	
	public Book(String bookName, String authorName, int price) {
//		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.price = price;
//		this.publisher = publisher;
	}
	
	
	
	void show()
	{
		System.out.println("\nBook name:" + bookName + "\nAuthor Name:"+ 
	authorName+ "\nPrice:"+ price+ "\npublisher:"+publisher);
	}
	
	
}

public class FinalVariableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book bk1 = new Book("Java Program","Code with Harry",500);
		bk1.show();
		Book bk2 = new Book("CPP","Code with Pradeep",1000);
		bk2.show();
		
	}

}
