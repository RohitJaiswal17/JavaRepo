package com.WrapperClass;

public class WrapperClassExample {

	public static void main(String[] args) {

		// Autoboxing
		// Primitive to Wrapper
		
		byte primitiveByte=30;
		Byte wrapperByte= Byte.valueOf(primitiveByte);
		System.out.println("Primitive to Byte Wrapper: " + wrapperByte);
		
		short primitiveShort=50;
		Short wrapperShort= Short.valueOf(primitiveShort);
		System.out.println("Primitive to Short Wrapper: " + wrapperShort);
		
		int primitiveInt=10;
		Integer wrapperInt= Integer.valueOf(primitiveInt);
		System.out.println("Primitive to Integer Wrapper: " + wrapperInt);
		
		long primitiveLong=2456784;
		Long wrapperLong= Long.valueOf(primitiveLong);
		System.out.println("Primitive to Long Wrapper: " + wrapperLong);
		
		
		// Unboxing
		// Wrapper to Primitive
		Byte wrapperByte2=Byte.valueOf((byte) 70); //int to byte(Narowing/explicit Type casting)
		byte primitiveByte2=wrapperByte2.byteValue();
		System.out.println("Byte Wrapper to Primitive : " + primitiveByte2);
		
		Short wrapperShort2 = Short.valueOf((short) 60);
		short primitiveShort2=wrapperShort2.shortValue();
		System.out.println("Short Wrapper to Primitive : " + primitiveShort2);
		
		Integer wrapperInt2=Integer.valueOf(20);
		int primitiveInt2=wrapperInt2.intValue();
		System.out.println("Integer Wrapper to primitive:  "+ primitiveInt2);
		
		Long wrapperLong2=Long.valueOf(345786435);
		long primitiveLong2=wrapperLong2.longValue();
		System.out.println("Long Wrapper to primitive:  "+ primitiveLong2);
	}

}
