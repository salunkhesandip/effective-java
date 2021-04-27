package com.inhouse.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphicString {

	public static void main(String[] args) {
		String s ="foo", t = "bar";
		boolean result = isIsomorphic(s, t);
		System.out.println(result);

	}

	private static boolean isIsomorphic(String s, String t) {
		int len1 = s.length();
		int len2 = t.length();
		if(len1 != len2)
			return false; // if 2 strings are of different length they won't be isomorphic.
		
		Map<Character, Character> map = new HashMap<>();
		Set<Character> set = new HashSet<>();
		
		for(int i = 0; i < len1; i++) {
			char c1 = s.charAt(i);
			char c2 = t.charAt(i);
			
			// if c1 is seen before
			if(map.containsKey(c1)) {
				if(map.get(c1) != c2) // c1 seen before but here c1 is not as same as c2
				return false;
			} else {
					if(set.contains(c2)) // c2 is mapped to some other char
						return false;
					
					map.put(c1, c2); // all checks passed
					set.add(c2);
				}
			}

		return true;
	}
}
