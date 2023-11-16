package com.Inheritance.MultipleInheritance;

public class Test {

	public static void main(String[] args) {

		Cat c=new Cat();
		
		c.meow();
		c.eat();
		
		Dog d=new Dog();
		d.barks();
		d.eat();
		
		Lion l=new Lion();
		l.roars();
		l.eat();
	}

}
