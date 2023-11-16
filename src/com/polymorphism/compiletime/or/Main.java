package com.polymorphism.compiletime.or;

public class Main {

	public static void main(String[] args) {
		
		
		Animal obj1=new Animal();  //parent class object
		Animal obj2=new Dog();   // Child class object through parent class reference variable  
		Animal obj3=new Cat();  // Child class object through parent class reference variable
		
		Dog obj4=new Dog();
		
		obj1.sound();  //Dynamic Binding 
		obj2.sound();
		obj3.sound();
		
		obj4.sound();
		
	}
}
