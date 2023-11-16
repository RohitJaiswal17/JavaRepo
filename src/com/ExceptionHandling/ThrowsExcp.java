package com.ExceptionHandling;

import java.io.IOException;

public class ThrowsExcp {

	 void readFile() throws IOException 
	{
		System.out.println("handled in readfile method");
		throw new IOException();
		//System.out.println("handled in readfile method");
	}
	
	public static void main(String[] args) throws IOException
	{	
		ThrowsExcp obj=new ThrowsExcp();
		obj.readFile();
	}
}
