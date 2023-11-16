package com.ExceptionHandling;

public class Demo2 {
	
	public static void main(String[] args) {
		
		try {
		int a=40;
		int b=0;
		System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("cannot divide by zero");
			e.printStackTrace();  //stream  method 
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
	}

}
