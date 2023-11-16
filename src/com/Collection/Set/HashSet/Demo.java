package com.Collection.Set.HashSet;

import java.util.HashSet;

public class Demo {

	public static void main(String[] args) {
		
		//ArrayList<Integer> arr=new ArrayList<>();
		
		HashSet<String>  obj=new HashSet<>();
		//Unordered collection of unique elemets
		obj.add("one");
		obj.add("two");
		obj.add("three");
		obj.add("four");
		obj.add("five");
		
		System.out.println(obj);
		System.out.println(obj.toString());
	}
}
