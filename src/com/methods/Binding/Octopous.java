package com.methods.Binding;

public class Octopous extends Animal {
	
	
	void run() {
		
		System.out.println("Octopous walks by 8 legs.......!");
	}
	
	public static void main(String[] args) {
		
		Animal a=new Animal();
		a.walk();
		Animal b=new Lion();
		b.walk();
		Lion l=new Lion();
		l.sleep();
		Animal c=new Octopous();
		c.walk();
		
		
	}
}
