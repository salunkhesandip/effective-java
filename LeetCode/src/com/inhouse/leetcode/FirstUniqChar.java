package com.inhouse.leetcode;

import java.util.HashMap;

/*
 * 387. First Unique Character in a String
 * Given a string s, return the first non-repeating character in it and return its index. 
 * If it does not exist, return -1.
 */
public class FirstUniqChar {

	public static void main(String[] args) {
		String s = "leetcode";
		int pos = firstUniqChar(s);
		System.out.println(pos);

	}

	private static int firstUniqChar(String s) {
		HashMap<Character,Integer> map = new HashMap();
		char[] chArr = s.toCharArray();
		for(char ch : chArr) {
			int val = map.getOrDefault(ch, 0);
			if(val <= 1)
				map.put(ch, val + 1);
		}
		
		for(int i = 0; i < chArr.length; i++) {
			if(map.get(chArr[i]) == 1)
				return i;
		}		
		return -1;
	}

}
