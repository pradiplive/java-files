package domo;
import java.util.*;

class Two{
	static void show() {
		System.out.println("inside two class");
	}
}

public class first extends Two {

	public void  first() {
		// TODO Auto-generated constructor stub
		System.out.println("Inside first function");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		
		first f = new first();
		f.first();
		f.show();
//		Two t = new Two();
//		t.show();
		int a = 99;
	
		
		
		

	}

}