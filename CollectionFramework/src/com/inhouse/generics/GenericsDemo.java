package com.inhouse.generics;

import java.util.ArrayList;
import java.util.List;

/*
 * Generics is introduced in java5 to deal with type-safe objects.
 * Before generics, we can store any type of objects in the collection, i.e. non-generic. 
 * Now generics force the java programmer to store a specific type of objects.
 * In a nutshell, generics enable types (classes and interfaces) to be parameters 
 * when defining classes, interfaces and methods. 
 * Enabling programmers to implement generic algorithms.
 * By using generics, programmers can implement generic algorithms that work on collections of different types, 
 * can be customized, and are type safe and easier to read.
 */
public class GenericsDemo {

	public static void main(String[] args) {
		List list = new ArrayList(); // before java5
		list.add(10);
		list.add("10");
		
		System.out.println("List before java5 without generics" + list);
		
		List <Integer> myList = new ArrayList<Integer>();
		myList.add(11);
		// myList.add("22");  compile time error 
		
		int num = (int) list.get(0); // type casting is needed before generics.
		num = myList.get(0);
		System.out.println("number : " + num);
		
	}

}
