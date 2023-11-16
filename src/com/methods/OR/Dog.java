package com.methods.OR;

public class Dog extends Animal{
	
	@Override
	void sound(String name) //Arguments 
	{
		System.out.println("Dog Barks.");   //Parameters
		
		System.out.println(name);     //Arguments
	}
}
