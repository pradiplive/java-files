package com.collections;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
//		ArrayList al = new ArrayList();
		ArrayList<String> al= new ArrayList<>();
		
		al.add("sonali");
		al.add("sonu");
		al.add("pradeep");
//		al.add(true);
//		al.add(23);
//		al.add(23.9f);
		
		for (Object object : al) {
			System.out.println(object);
		}
	}
}
