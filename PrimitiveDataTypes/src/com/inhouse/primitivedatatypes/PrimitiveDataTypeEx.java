package com.inhouse.primitivedatatypes;

import java.util.ArrayList;

public class PrimitiveDataTypeEx {

	public static void main(String[] args) {
	/*
		Primitive types are the most basic data types available within the Java language. There are 8: boolean, byte, char, short, int, long, float and double. 
		These types serve as the building blocks of data manipulation in Java.
	 */
	
		byte myByte = 127;
		System.out.println("myByte : " + myByte + ", Max : " + Byte.MAX_VALUE);
		
		short myShort = 12345;
		System.out.println("myShort : " + myShort + ", Max : " + Short.MAX_VALUE);
		
		int myInt = 54321;
		System.out.println("myInt : " + myInt + ", Max : " + Integer.MAX_VALUE);
		
		long myLong = 987654321;
		System.out.println("myLong : " + myLong + ", Max : " + Long.MAX_VALUE);
		
		float myFloat = 1.23f;
		System.out.println("myFloat : " + myFloat + ", Max : " + Float.MAX_VALUE);
		
		double myDouble = 3.1456;
		System.out.println("myDouble : " + myDouble + ", Max : " + Double.MAX_VALUE);
		
		boolean myBoolean = true;
		System.out.println("myBoolean : " + myBoolean);
		
		char myChar ='S';
		System.out.println("myChar : " + myChar);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(25);
		System.out.println("Auto-boxing of int to Integer " + list.get(0));
		// The automatic conversion of primitive data type into its corresponding wrapper class is known as autoboxing
		
		
	}

}
