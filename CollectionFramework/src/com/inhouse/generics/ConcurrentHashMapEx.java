package com.inhouse.generics;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapEx {

	public static void main(String[] args) {
		ConcurrentHashMap<String,Integer> bookAndPrice = new ConcurrentHashMap<String,Integer>();
		// introduced in JDK 1.5
		// Creates a new, empty map with a default initial capacity (16), load factor (0.75) and 
		// concurrencyLevel (16).
		bookAndPrice.put("Effective AI/ML", 100);
		bookAndPrice.put("Effective Java", 30);
		bookAndPrice.put("Effective Python", 40);
		bookAndPrice.put("Effective Go", 50);
		bookAndPrice.put("Effective Java", 60); // update value of previous stored element.
		bookAndPrice.replace("Effective Java", 60, 28);
		// replace the price of Effective Java from 60 to 28 
		// only if no other thread has updated the value in the meantime.

		bookAndPrice.remove("Head First Java");
		bookAndPrice.remove("Effective Go", 50);
	
		bookAndPrice.putIfAbsent("Effective Python", 10); // fails as key is already present.
		
		// ConcurrentHashMap doesn't maintain insertion order.
		System.out.println(bookAndPrice);
		System.out.println("###############################");
		
		bookAndPrice.forEach((k, v) -> System.out.println("key: " + k + " value: " + v));
		System.out.println("###############################");
		
		Set<Map.Entry<String, Integer>> entries = bookAndPrice.entrySet();
		entries.forEach(System.out::println);
		System.out.println("###############################");
		ConcurrentHashMap<String, Integer> copy = new ConcurrentHashMap<>();

		if(copy.isEmpty()){
		System.out.println("size of new ConcurrentHashMap: " + copy.size());
		}
		System.out.println("###############################");
		copy.putAll(bookAndPrice);
		copy.forEach((k, v) -> System.out.println("key: " + k + " value: " + v));
		
	}

}
