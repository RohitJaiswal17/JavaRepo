package com.Inheritance.SingleInheritance;

public class Dog extends Animal {

	void barks() {
		System.out.println("Dog is Barking......!");
	}
	
	public static void main(String[] args) {
		
		Dog d=new Dog();
		
		d.eat();
		d.barks();
		
	}
}
