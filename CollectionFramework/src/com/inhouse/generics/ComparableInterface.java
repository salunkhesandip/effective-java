package com.inhouse.generics;

import java.util.Arrays;
import java.util.Iterator;

/*
 * This class shows how to sort primitive arrays, Wrapper classes Object Arrays.
 * Comparable.compareTo(Object o) method implementation can provide default sorting and 
 * we can’t change it dynamically. 
 * Whereas with Comparator, we can define multiple methods with different ways of sorting and then 
 * chose the sorting method based on our requirements.
 */
public class ComparableInterface {

	public static void main(String[] args) {
		int[] numbers = {1,6,4,3};
		Arrays.sort(numbers);
		System.out.println("Sorted array : ");
		
		for(int digits : numbers) System.out.println(digits);
	
		String[] strArr = {"A","Z","C"};
		Arrays.sort(strArr);
		
		for(String str : strArr) System.out.println(str);
		
		Employee[] empArr = new Employee[3];
		empArr[0] = new Employee(1,"Sandip",1000);
		empArr[1] = new Employee(2,"Allie",2000);
		empArr[2] = new Employee(3,"Katie",4000);
		
		Arrays.sort(empArr); // java.lang.ClassCastException
		// implements Comparable<Employee>
		
		System.out.println("Default Sorting of Employees list:\n"+Arrays.toString(empArr));
	}
}
