package com.Abstraction.Interface;

class Dog implements Animal {

	@Override
	public void sound() {
		System.out.println("Dog Barks....!");
	}

	public void eat() {
			System.out.println("Dog eats Pedigree....!");
	}
}
