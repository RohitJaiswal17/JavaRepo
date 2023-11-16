package com.Aggregation.Agg;

public class Main {
	
	public static void main(String[] args) {
		
		Address studentAddress=new Address("MG Road", "Indore", "MP", 452001);
		
		
		// passing Address object in Student Object
		Student  studentDetails=new Student("Govind", 101, studentAddress);
		
		Student studentDetails1=new Student("Ayushi", 102);
		
		// Displaying information including address
		studentDetails.display();
		

		// Displaying information excluding address
		studentDetails1.show();
		
	}

}
