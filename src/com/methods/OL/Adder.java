package com.methods.OL;

 class Adder {

	// Methods with same name but different parameters

	// METHOD OVERLOADING

		static String car(String name, int model) {
			
			return (name + " " +model);
		}

		static double car(double name, double model, int average) {
			return (  name +  model + average);
		}

		static int car(int name, int model, int average) {
			return (name  + model +   average);
		}

	public static void main(String[] args) {
		
		System.out.println(Adder.car(12.44,23.44,42));
		//System.out.println(Adder.car();
		//System.out.println(Adder.car();

	}
}
