package com.inhouse.leetcodemedium;
/* 5. Longest Palindromic Substring
 * Given a string s, return the longest palindromic substring in s.
 */
public class LongestPalString {
	int resultStart, resultLen, strLen;
	
	public static void main(String[] args) {
		String s = "aaaa";
		LongestPalString obj = new LongestPalString();
		String palStr = obj.longestPalindrome(s);
		System.out.println(palStr);
	}

	public String longestPalindrome(String s) {
		strLen= s.length();
		if(strLen < 2) return s;
		
		for(int start = 0; start < strLen - 1; start++) {
			expandRange(s, start, start); // odd length
			expandRange(s, start, start + 1);// even length
	    }
		return s.substring(resultStart, resultStart + resultLen);
	}
	
	public void expandRange(String str, int begin, int end) {
		while(begin >= 0 && end < strLen && str.charAt(begin) == str.charAt(end)) {
			begin--;
			end++;
		}
		if(resultLen < end - begin - 1) {
			resultStart = begin + 1;
			resultLen = end - begin - 1;
		}
	}
}
