package com.inhouse.generics;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		/*
		 * The set interface present in the java.util package and extends the Collection interface 
		 * is an unordered collection of objects in which duplicate values cannot be stored.
		 */
		
		HashSet<Integer> set = new HashSet<Integer>(10,.5f); // (capcity,loadFactor)
		// default initial capacity 16 and default load factor 0.75
		// doesn't provide any ordering guarantee.
		for(int i=0; i<10; i++)
			set.add(i); // HashSet doesn't maintain insertion order.
		
		System.out.println("HashSet : " + set);
		
		set.add(null);
		
		for(int i=3; i<10; i++)
			set.add(i); // HashSet contains unique elements only.
		
		System.out.println("HashSet : " + set);
		
		/*
		 * Whenever we create HashSet it internally creates a HashMap and if we insert an
		 * element into HashSet using add() method, it actually call put() method internally
		 * created HashMap object with element as key and constant Object "PRESENT" as it's value.
		 * Set achieves uniqueness internally through HashMap. 
		 */
	}

}
