package com.polymorphism.compiletime.ol;

public class Calculator {

	// Overloading methods

	static int add(int a, int b) {

		return a + b;
	}

	static int add (int a, int b, int c) {

		return a + b + c;
	}

	static double add(double a, double b) {

		return a + b;
	}

}
