package com.EH;

public class Demo1 {

	int a=20;  //instance variable-object variable
	static int c =79;  //static variable-class level variables
	final int e=55;
	
	public static void main(String[] args) {
		
		Demo1 obj=new Demo1();  //object create
		
		int b=45;   //local variable
		final int d=67;
		
		System.out.println(b);
		System.out.println(obj.a);
		System.out.println(c);
	}
}
