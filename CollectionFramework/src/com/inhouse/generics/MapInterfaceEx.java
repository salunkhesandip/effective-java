package com.inhouse.generics;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapInterfaceEx {

	public static void main(String[] args) {
		Map<Integer,String> hashMap = new HashMap<Integer,String>();
		Map<Integer,String> linkedHashMap = new LinkedHashMap<Integer,String>();
		Map<Integer,String> treeMap = new TreeMap<Integer,String>();
		printMap(hashMap); // HashMap doesn't provide any ordering guarantee.
		printMap(linkedHashMap); // LinkedHashMap preserves order of insertion
		printMap(treeMap); // TreeMap provides sorted key storing
	}

	private static void printMap(Map<Integer, String> map) {
		
		map.put(0, "Zero");
		map.put(3, "Three");
		map.put(1,"One");
		map.put(2, "Two");
		
		for(Integer key : map.keySet()) {
			System.out.println("Key : " + key + ", Value : " + map.get(key));
		}
		System.out.println("#############################################");
	}


}
