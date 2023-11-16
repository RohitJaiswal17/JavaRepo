package com.ExceptionHandling;

public class ThrowExcep {
	
	static void fun() {
		
	try {
		throw new NullPointerException("demo");
	}
	catch (NullPointerException e) {
		System.out.println("caught inside fun method");
		throw e;  //rethrowing exception
	}
	}
	
	public static void main(String[] args) {
		
		try {
		fun();
		}
		catch (NullPointerException e) {
			System.out.println("caught in main method");
			
		}
	}

}
