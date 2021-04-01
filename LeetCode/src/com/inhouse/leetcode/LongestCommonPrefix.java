package com.inhouse.leetcode;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strs = {""};
		String result = longestCommonPrefix(strs);
		System.out.println(result);
	}

	/*
	 * Vertical scanning - 
	 * We compare characters from top to bottom on the same column (same character index of the strings) before moving on to the next column.
	 */

	private static String longestCommonPrefix(String[] strs) {		
		  if (strs == null || strs.length == 0) return "";
		    for (int i = 0; i < strs[0].length() ; i++){
		        char c = strs[0].charAt(i);
		        for (int j = 1; j < strs.length; j ++) {
		            if (i == strs[j].length() || strs[j].charAt(i) != c)
		                return strs[0].substring(0, i);             
		        }
		    }
		    return strs[0];
	}

}
