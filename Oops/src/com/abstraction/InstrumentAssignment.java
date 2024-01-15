package com.abstraction;

abstract class Instrument{
	abstract void play();
}

class Piano extends Instrument{
	void play() {
		System.out.println("Piano is playing tan tan tan tan");
	}
}
class Flute extends Instrument{
	void play() {
		System.out.println("Flute is playing toot toot toot toot");
	}
}
class Guitar extends Instrument{
	void play() {
		System.out.println("Guitar is playing tin tin tin");
	}
}


public class InstrumentAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instrument ins;
		ins = new Piano();
		ins.play();
		
		System.out.println("\n");
		ins = new Flute();
		ins.play();
		
		
		System.out.println("\n");
		ins = new Guitar();
		ins.play();

	}

}
