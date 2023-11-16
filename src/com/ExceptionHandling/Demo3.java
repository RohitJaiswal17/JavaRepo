package com.ExceptionHandling;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		try {		
			int a=300;
			System.out.println("Enter a number:  ");
			int b=sc.nextInt();
			System.out.println(a/b);
		} 
		catch(ArithmeticException e) {
			System.out.println("not divisible by zero");
		}
		catch(InputMismatchException e) {
			System.out.println("not divisible by string");
		}
		
	}
}
