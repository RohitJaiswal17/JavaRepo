package com.Inheritance;

public class Son extends Parent {

	int earn= 10000;   //Instance Variable 
	
	public static void main(String[] args) {
		
		Son s=new Son();
		System.out.println("Earning of Son: " + s.earn);
		
	
		
		System.out.println("Treasure of Parent: " + s.treasure);
	
	}
	
}
