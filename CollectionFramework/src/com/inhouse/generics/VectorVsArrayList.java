package com.inhouse.generics;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Random;
import java.util.Vector;

public class VectorVsArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		Random rand = new Random();
		
		for(int i=0; i<5;i++) {
			arrList.add(rand.nextInt(100));
		}

		Iterator<Integer> it = arrList.iterator();
		System.out.print("ArrayList : ");
		while(it.hasNext())
			System.out.print(it.next()+",");
		
		/* Vector is synchronized,while arrayList is not synchronized.
		 * ArrayList increments 50% of the current array size if the number of elements exceeds its capacity, 
		 * while vector increments 100%.
		 * Vector can use both Enumeration and Iterator for traversing over elements of vector 
		 * while ArrayList can only use Iterator for traversing
		 * 
		 */
		Vector<Integer> vector = new Vector<Integer>();
		for(int i=0; i<5;i++) {
			vector.add(rand.nextInt(100));
		}
		System.out.print("\nVector elements :"); 
        Enumeration<Integer> e = vector.elements(); 
        while (e.hasMoreElements()) 
            System.out.print(e.nextElement()+","); 
        
        Iterator<Integer> itr = vector.iterator();
    	System.out.print("\nVector : ");
    	while(itr.hasNext())
    		System.out.print(itr.next()+",");

    	/*
    	 * Most of the time, programmers prefer ArrayList over Vector because ArrayList can
    	 * be synchronized explicitly using Collections.synchronizedList.
    	 */
	}
	
}
