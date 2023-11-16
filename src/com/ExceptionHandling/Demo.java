package com.ExceptionHandling;


import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter an number:  ");
		
		try {
		byte a=sc.nextByte();
		byte num=127;      // -128 to 127
		byte result = (byte) (num/a);
		System.out.println(result);
		}
		catch(Exception e) {
			System.out.println("Invalid input");
		}
		
	}

}
