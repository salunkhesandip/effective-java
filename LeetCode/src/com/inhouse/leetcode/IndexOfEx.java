package com.inhouse.leetcode;

public class IndexOfEx {

	public static void main(String[] args) {
		String haystack = "a";
		String needle = "a";
		int index = strStr(haystack, needle);
		System.out.println(index);
	}

	private static int strStr(String haystack, String needle) {
		int len1 = haystack.length();
		int len2 = needle.length();
		
		if(haystack == null || len2 > len1)
			return -1;
		if(needle == null || len2 == 0)
			return 0;

		for(int i = 0; i <= (len1 - len2); i++) {
			int j;
			for(j = 0; j < len2; j++) {
				if(haystack.charAt(i+j) != needle.charAt(j)) {
					break;
				}
			}
			if(j == len2)
				return i;
		}
		return -1;
	}
}
