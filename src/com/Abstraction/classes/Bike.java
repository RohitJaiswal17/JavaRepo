package com.Abstraction.classes;

abstract class Bike {

	// constructor
	Bike() {
		System.out.println("Bike constructor is created.....!");
	}

	// Abstract method
	abstract void run();

	// Non-abstract/Normal method
	  void changeGear() {
		System.out.println("Non abstract method in abstract class....!");
	}

}
