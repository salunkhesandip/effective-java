package com.inhouse.generics;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 *  Set is unordered collection of objects in which duplicate values cannot be stored.
 *  Set interface allows the users to perform the basic mathematical operation on the set.
 *  
 */
public class SetInterfaceEx {

	public static void main(String[] args) {
		
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		
		for(int i=4; i<8;i++)
			set1.add(i);
		
		for(int i=0; i<6;i++)
			set2.add(i);
		
		System.out.println("Set 1 : " + set1);
		System.out.println("Set 2 : " + set2);
		
		Set<Integer> union = new HashSet<Integer>(set1);
		union.addAll(set2);
		System.out.println("Union of set1, set2 : " + union);
		
		Set<Integer> intersection = new HashSet<Integer>(set1);
		intersection.retainAll(set2);
		System.out.println("Intersection : " + intersection);
		
		Set<Integer> diff = new HashSet<Integer>(set1);
		diff.removeAll(set2);
		System.out.println("Difference set1 -set2 " + diff);
		
		Set<Integer> hashSet= new HashSet<Integer>();
		Set<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		Set<Integer> treeSet = new TreeSet<Integer>();
		printSet(hashSet); // HashSet doesn't provide any ordering guarantee.
		printSet(linkedHashSet); // LinkedHashSet preserves order of insertion
		printSet(treeSet); // TreeSet provides sorted key storing
	}

	private static void printSet(Set<Integer> set) {

		for(int i=4; i<5;i++)
			set.add(i);
		
		for(int i=0; i<6;i++)
			set.add(i);
		
		// set.add(null); // TreeSet doesn't allow null
		
		for(Integer value : set) {
			System.out.println("Value : " + value);
		}
		System.out.println("#############################################");
	}

}
