package com.Aggregation.Agg;

public class Address {
	
	 String street;
	 String city;
	 String state;
	 int zipCode;
	
	 Address(String street1, String city1, String state1, int zipCode1) {
		
		this.street = street1;
		this.city = city1;
		this.state = state1;
		this.zipCode = zipCode1;
	}
	
	public String getFullAddress()      //Getter Method for getting full address
	{
		return  street+" "+city+" "+state+" "+zipCode;
	}
	
}
