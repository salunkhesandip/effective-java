package com.inhouse.generics;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapEx {
/*
 * HashMap allows null values and one null key.
 * non-synchronized general purpose Map implementation, doesn't provide any ordering guarantee.
 * HashMap stores both key and value object as Map.Entry in a bucket.
 * hashcode for null key is always 0
 */
	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		map.put("Four", 4);
		map.put("One", 5); // over-write previous value
		map.put(null, null);
		map.put(null, 3);
		System.out.println(map);
		
		for(Entry<String, Integer> entry : map.entrySet())
			System.out.println(entry.getKey() + " : " + entry.getValue());

		System.out.println("hashCode : " + map.hashCode());
	}
}
