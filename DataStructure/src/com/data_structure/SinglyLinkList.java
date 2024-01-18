package com.data_structure;

class Book1{
	String bookName;
	String authorName;
	float price;
	public Book1(String bookName, String authorName, float price) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", authorName=" + authorName + ", price=" + price + "]";
	}
	public String getBookName() {
		return bookName;
	}
}

class Node1{
	Node1 next;
	Book1 data;
	public Node1(Book1 data,Node1 next) {
		super();
		this.next = next;
		this.data = data;
	}
}

class SinglyLL{
	Node1 head;
	Node1 tail;
	
	SinglyLL(){
		head=null;
		tail=null;			
	}
	public void addBook(Book1 book) {
		Node1 newNode = new Node1(book, null);
		if(head==null) {
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	public void removeBook(String book) {
		Node1 current = head;
		//head
		if(current == head && (current.data.bookName.equalsIgnoreCase(book))) {
			head = current.next;
		}
		Node1 temp = current;
		current = current.next;
		while(current != null) {
			
			//middle
			if(current.data.bookName.equalsIgnoreCase(book)) {
				if(current.next!=null) {
					temp.next = current.next;
				}
				else {
					temp.next = null;
				}
				break;
			}
			
			//tail
			if(current == tail && (current.data.bookName.equalsIgnoreCase(book))) {	
				tail = temp;
				tail.next = null;
				break;
			}
			temp = current;
			current = current.next;
		}
	}
	
	public int search(String book) {
		int count = 1;
		Node1 current = head;
		while(current != null) {
			if(current.data.bookName.equalsIgnoreCase(book)) {
				return count;
			}
			count++;
			
			current = current.next;
		}
		return 0;
	}
	
	public void InsertAtPosition(String bookName, Book1 book) {
		if(head == null) {
			addBook(book);
			return;
		}
		int position = search(bookName);
		if(position == 0) {
			System.out.println("Node Not found");
			return;
		}
		Node1 current = head;
		int i=1;
		Node1 temp;
		while(i < position) {
			temp = current;
			current = current.next;
			i++;
		}
		Node1 newNode = new Node1(book, null);
		// tail
		if(current.next == null) {
			addBook(book);
			return;
		}
		//middle
		if(current.next != null) {
			newNode.next = current.next;
			current.next = newNode;
		}
	}
	
	public void showBooks() {
		Node1 current = head;
		while(current!=null) {
			System.out.println(current.data);
			System.out.println(current);
			current = current.next;
		}
	}
}

public class SinglyLinkList {

	public static void main(String[] args) {
		
		Book1 b1 = new Book1("Java", "pradip", 500);
		Book1 b2 = new Book1("Python", "swapnil", 700);
		Book1 b3 = new Book1(".Net", "yash", 900);
		Book1 b4 = new Book1("ReactJs", "Ramesh", 1200);
		SinglyLL dLL = new SinglyLL();
		dLL.addBook(b1);
		dLL.addBook(b2);
		dLL.addBook(b3);
		dLL.addBook(b4);
		
		dLL.showBooks();
		
		System.out.println();
//		dLL.removeBook("java");
		
		dLL.showBooks();
		
		System.out.println("Search : " + dLL.search("java"));;
		
		
		Book1 b5 = new Book1("Angular", "Suresh", 1500);
		dLL.InsertAtPosition(".net", b5);
		
		System.out.println();
		dLL.showBooks();

	}

}
