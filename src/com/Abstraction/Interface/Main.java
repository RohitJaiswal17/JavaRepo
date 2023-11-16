package com.Abstraction.Interface;

public class Main {

	public static void main(String[] args) {

		Animal obj1=new Dog();
		obj1.sound();
		obj1.eat();
		
		Animal obj2=new Cat();
		obj2.sound();
		obj2.eat();
		Animal.fly();
	}
}
