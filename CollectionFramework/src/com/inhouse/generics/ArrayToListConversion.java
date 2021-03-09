package com.inhouse.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListConversion {

	public static void main(String[] args) {
		String [] vowels = {"a","e","i","o","u"}; // String array
		List<String> vowelList = Arrays.asList(vowels);
		/*
		 * returns a List wrapper around an array. 
		 * This wrapper has a fixed size and is directly backed by the array, 
		 * and as such calls to set will modify the array, and 
		 * any other method that modifies the list will throw an UnsupportedOperationException
		 * To fix this create new ArrayList as below
		 */
		System.out.println(vowelList);
		vowelList = new ArrayList(Arrays.asList(vowels));
		vowelList.remove("a"); // will throw java.lang.UnsupportedOperationException
		System.out.println(vowelList);
		
		String [] vowelsArr = new String[vowelList.size()];
		vowelsArr = vowelList.toArray(vowelsArr);
		System.out.print("vowels array : ");
		for(String str : vowelsArr)
			System.out.print(str + ", ");

	}

}
