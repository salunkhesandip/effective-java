package com.inhouse.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ConcurrentModException {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		for(int i=0; i<5; i++)
			numbers.add(i);

		System.out.println("Numbers list : " +  numbers);
		
		numbers.removeIf(i -> i == 2); // java8
		
		System.out.println("Numbers list : " +  numbers);
		
		Iterator<Integer> it = numbers.iterator();

		while(it.hasNext()) {
			Integer i = it.next();

			if(i == 3) {
				//numbers.remove(i); // java.util.ConcurrentModificationException
				it.remove();
			}
		}
		
		/*
		 * The real cause of ConcurrentModfiicationException is inconsistent modCount. 
		 * When you are iterating over ArrayList then Iterator's next() method keep track of modCount. 
		 * If you modify the collection by adding or removing element then modCount will change and 
		 * it will not match with the expected modCount, hence Iterator will throw ConcurrentModificationException.
		 */
		System.out.print("Numbers list - removal: " + numbers);
		
		
	}

}
