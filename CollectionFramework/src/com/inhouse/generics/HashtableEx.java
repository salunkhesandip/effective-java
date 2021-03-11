package com.inhouse.generics;

import java.util.Hashtable;
import java.util.Map;

public class HashtableEx {

	public static void main(String[] args) {
		Hashtable <Integer,String> table = new Hashtable<Integer,String>();

		table.put(0, "Zero");
		table.put(1, "One");
		table.put(3, "Three");
		table.put(2, "Two");
		//table.put(null,null); // throws NPE
		//table.put(4, null);  // throws NPE
		
		// Hashtable doesn't maintain insertion order.
		//  Hashtable is synchronized.
		for(Map.Entry<Integer,String> entry : table.entrySet()) {
			System.out.println("Key : " + entry.getKey() +", Value: " + entry.getValue());
		}
	}
}
