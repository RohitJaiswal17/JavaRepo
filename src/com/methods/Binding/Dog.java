package com.methods.Binding;

public class Dog {
	
	private void eat() {
		
		System.out.println("Dog is eating.......!");
	}
	
	final void sleep() {
		
		System.out.println("Dog is sleeping");
	}

	public static void main(String[] args) {
		
		Dog d=new Dog();
		d.eat();
		d.sleep();
	
		
		Dog d1=new Dog();
		d1.eat();
		d1.sleep();
		
		Cat.eat();

	}

}
