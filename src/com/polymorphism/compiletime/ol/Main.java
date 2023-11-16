package com.polymorphism.compiletime.ol;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println(Calculator.add(10,20));
		System.out.println(Calculator.add(10.40,20));   //Implicit Type casting 
		System.out.println(Calculator.add(10,40));
	}
}
