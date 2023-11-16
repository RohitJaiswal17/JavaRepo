package com.Aggregation.Agg;

public class Student {

	  String name;
	  int rollNumber;
	 Address address;       // Aggregation=Student class HAS-A Address Object

	// Method to display information including address
	Student(String name1, int rollNumber1, Address address1) 
	{
		this.name=name1;
		this.rollNumber=rollNumber1;
		this.address=address1;
	}
	
	// Method to display information excluding address
	Student(String name1, int rollNumber1) 
	{
		this.name=name1;
		this.rollNumber=rollNumber1;
	}
	
	public void display() 
	{
		System.out.println("Name: " + name);
		System.out.println("Roll Number: " + rollNumber);
		address.getFullAddress();
	}
	public void show() 
	{
		System.out.println("Name: " + name);
		System.out.println("Roll Number: " + rollNumber);
	}

}
