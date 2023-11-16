package com.ExceptionHandling;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");

		try {
			int b = sc.nextInt();
			int a = 200;
			int result = a / b;
			System.out.println(result);
		} catch (ArithmeticException e) {

			e.printStackTrace();// exception name with description and stack trace 
			System.out.println(e.toString());  //description and stack trace 
			System.out.println(e.getMessage());  // description

		}

	}
}
