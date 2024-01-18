package com.data_structure;

class Book{
	String bookName;
	String authorName;
	float price;
	public Book(String bookName, String authorName, float price) {
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

class Node{
	Node next;
	Node prev;
	Book data;
	public Node( Node prev, Book data,Node next) {
		super();
		this.next = next;
		this.prev = prev;
		this.data = data;
	}
}

class DoublyLL{
	Node head;
	Node tail;
	
	DoublyLL(){
		head=null;
		tail=null;			
	}
	public void addBook(Book book) {
		Node newNode = new Node(null, book, null);
		if(head==null) {
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
	}
	
	public void removeBook(String book) {
		Node current = head;
		
		while(current != null) {
			if(current == head && (current.data.bookName.equalsIgnoreCase(book))) {
				head = current.next;
				head.prev = null;
				break;
			}
			if(current == tail && (current.data.bookName.equalsIgnoreCase(book))) {
				current = current.prev;
				tail = current;
				tail.next = null;
				break;
			}
			if(current.data.bookName.equalsIgnoreCase(book)) {
//				tail = tail.prev;
//				tail.next = null;
				current.prev.next = current.next;
				current.next.prev = current.prev;
				break;
			}
			
			current = current.next;
		}
	}
	
	public int search(String book) {
		int count = 1;
		Node current = head;
		while(current != null) {
			if(current.data.bookName.equalsIgnoreCase(book)) {
				return count;
			}
			count++;
			
			current = current.next;
		}
		return 0;
	}
	
	public void InsertAtPosition(String bookName, Book book) {
		
		
		if(head == null) {
			addBook(book);
			return;
		}
		
		int position = search(bookName);
		if(position == 0) {
			System.out.println("Node Not found");
			return;
		}
		
		Node current = head;
		int i=1;
		while(i < position) {
			current = current.next;
			i++;
		}
		Node newNode = new Node(null, book, null);

		// tail
		if(current.next == null) {
			addBook(book);
			return;
		}
		//middle
		if(current.next != null) {
			newNode.prev = current;
			newNode.next = current.next;
			current.next.prev = newNode;
			current.next = newNode;
		}
	}
	
	public void showBooks() {
		Node current = head;
		while(current!=null) {
			System.out.println(current.data);
			System.out.println(current);
			current = current.next;
		}
	}
}


public class DoublyLinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("Java", "pradip", 500);
		Book b2 = new Book("Python", "swapnil", 700);
		Book b3 = new Book(".Net", "yash", 900);
		Book b4 = new Book("ReactJs", "Ramesh", 1200);
		DoublyLL dLL = new DoublyLL();
		dLL.addBook(b1);
		dLL.addBook(b2);
		dLL.addBook(b3);
		dLL.addBook(b4);
		
		dLL.showBooks();
		
		System.out.println();
//		dLL.removeBook("python");
		
//		dLL.showBooks();
		
		System.out.println(dLL.search("java"));;
		
		
		Book b5 = new Book("Angular", "Suresh", 1500);
		dLL.InsertAtPosition("python", b5);
		
		System.out.println();
		dLL.showBooks();
	}

}
