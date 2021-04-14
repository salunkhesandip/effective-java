package com.inhouse.leetcode;

import java.util.HashSet;
import java.util.Set;

public class StringFindAllPermutations {

	public static void main(String[] args) {
		String str = "ABCD";
		System.out.println("\nPermutations for " + str + " are: \n" + permutationFinder(str));
	}

	private static Set<String> permutationFinder(String str) {
		Set <String> perm = new HashSet<String>();
		if(str == null) {
			return null;
		} else if(str.length() == 0) {
			perm.add("");
			return perm;
		}
		
		char initial = str.charAt(0); // First char
		String rem = str.substring(1); // remaining string
		
		Set<String> words = permutationFinder(rem);
		
		for(String strNew : words) {
			for(int i = 0; i < strNew.length(); i++) {
				perm.add(charInsert(strNew, initial, i));
			}
		}
		return perm;				
	}

	private static String charInsert(String strNew, char initial, int i) {
		String begin = strNew.substring(0,i);
		String end = strNew.substring(i);
		return begin + initial + end;
	}

}
