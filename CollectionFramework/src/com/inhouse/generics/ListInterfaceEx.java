package com.inhouse.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
 * List interface provides a way to store the ordered collection.
 * It is an ordered collection of objects in which duplicate values can be stored. 
 * Since List preserves the insertion order, it allows positional access and insertion of elements.
 */
public class ListInterfaceEx {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		List<Integer> myNumbers = new ArrayList<Integer>();
		Random rand = new Random();
		for(int i=0;i<5;i++) {
			numbers.add(rand.nextInt(100));
			myNumbers.add(rand.nextInt(100));
		}
		numbers.add(11);
		myNumbers.add(11);
		System.out.println("Number list : " + numbers);
		System.out.println("myNumbers list : " + myNumbers);
		numbers.remove(numbers.size()-2);
		System.out.println("Number list after removal : " + numbers);

		
		numbers.addAll(myNumbers);
		System.out.println("Added number list : " + numbers);
		
		Collections.sort(numbers); // before java8
		System.out.println("Sorted number list : " + numbers); // has duplicate element 11
		
		numbers.sort(null); // since java8
		System.out.println("Sorted number list : " + numbers); 
		
		Collections.reverse(numbers);
		System.out.println("Reverse number list : " + numbers); 
		
		System.out.println("contains 11 ? : " + numbers.contains(11));	
		
		int firstIndex = numbers.indexOf(11);
		System.out.println("firstIndex of 11 : " + firstIndex);	
		numbers.clear();
		System.out.println("Number list after clear: " + numbers);		

	}

}
