package com.abstraction;

/*
 * Abstract class:
 * class which hold abstract as well as non abstract methods
 * If class hold abstract methods class must declare with abstract keywords 
 * vice versa is not mandatory
 * If any class inherit abstract class then derived class is supposed to implements 
 * abstract methods coming from parent(Abstract) Class otherwise declare child class abstract
 * We cannot initialize abstract class but we can create reference of it which 
 * can be initialized to the object of implemented child object 
 * */
abstract class Game
{
	public void start() {
		System.out.println("Game Started");
	}
	public void stop() {
		System.out.println("Game Stopped");
	}
	abstract public void run();
}

class G1_Game extends Game
{
	public void run() {
		System.out.println("Running 1");
	}
	public void gr() {
		System.out.println("G1 Game Running!!!");
	}
}

class G2_Game extends Game
{
	public void run() {
		System.out.println("Running 2");
	}
	
	public void g2p() {
		System.out.println("G2 Game Running!!!");
	}
}

public class AbstractClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Game g; //Abstract class reference
		g= new G1_Game();
		g.start();
		g.run();
		g.stop();
		
		System.out.println("\n\n");
		g= new G2_Game();
		g.start();
		g.run();
		g.stop();

	}

}
