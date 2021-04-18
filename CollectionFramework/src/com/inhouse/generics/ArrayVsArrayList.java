package com.inhouse.generics;

import java.util.ArrayList;

public class ArrayVsArrayList {

	public static void main(String[] args) {
		Integer[] array = new Integer[20]; // array memory is allocated on creation
		
		System.out.println("Size of an array : " + array.length);
		/* 
		 * Arrays are fixed size. 
		 * Once we initialize the array with some int value as its size, it can't change. 
		 * The size and capacity are equal to each other too.
		 */
		
		// default capacity value is 10.
		ArrayList<Integer> numbers = new ArrayList<Integer>(20); // ArrayList changes memory allocation as it grows.
		numbers.add(1);
		System.out.println("Size of an ArrayList : " + numbers.size());	
		
		// use ensureCapacity() method to increase the size of an arraylist after it’s initialization
		numbers.ensureCapacity(30);
		
		/*
		 * When an element is added to an ArrayList it first checks whether the new element 
		 * has room to fill or it needs to grow the size of the internal array, 
		 * If capacity has to be increased then the new capacity is calculated which 
		 * is 50% more than the old capacity and the array is increased by that capacity.
		 */
		
		/*
		 * Array can contain both primitive data types as well as objects of a class depending on the definition of the array. 
		 * However, ArrayList only supports object entries, not the primitive data types
		 */
		// ArrayList<char> charArr = new ArrayList<char>();
		
	}
	

}
