package com.Collection.HashMap;

import java.util.HashMap;

public class Demo {
	public static void main(String[] args) {
		
		HashMap<String, Integer> obj= new HashMap<>();
		//it is collection of key value pair
		
		obj.put("age", 29);
		obj.put("height", 172);
		obj.put("weight", 85);
		
		System.out.println(obj);
		
		System.out.println(obj.get("age"));
		
		
	}

}
