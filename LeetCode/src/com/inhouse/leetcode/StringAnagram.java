package com.inhouse.leetcode;

public class StringAnagram {

	public static void main(String[] args) {
		String s = "car", t = "rac";
		boolean result = isAnagram(s, t);
		System.out.println(result);
	}

	private static boolean isAnagram(String s, String t) {
		int len1 = s.length();
		int len2 = t.length();
		int[] letters = new int[26];
		
		if(len1 != len2)
			return false;
		
		for(int i = 0; i < len1; i++) {
			letters[s.charAt(i) - 'a']++;
		}
		for(int i = 0; i < len1; i++) {
			letters[t.charAt(i) - 'a']--;
			if(letters[t.charAt(i) - 'a'] < 0)
				return false;
		}
		return true;
	}

}
