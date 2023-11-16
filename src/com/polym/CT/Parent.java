package com.polym.CT;

public class Parent {

	int add(int a, int b) {

		return a + b;
	}

	double add(double a, double b) {

		return  a + b;
	}
	
	public static void main(String[] args) {
		
		Parent obj=new Parent();
		
		System.out.println(obj.add(30,60));
		System.out.println(obj.add(45.324, 54.234235));
	}

}  
