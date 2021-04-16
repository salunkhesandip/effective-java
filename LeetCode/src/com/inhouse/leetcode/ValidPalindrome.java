package com.inhouse.leetcode;

public class ValidPalindrome {
	
	public static void main(String[] args) {
		String str = "abab";
		boolean result = validPalindrome(str);
		System.out.println(result);
	}
// Brute force	
/*
	private static boolean validPalindrome(String str) {
		StringBuilder sb = new  StringBuilder(str);
		for(int i = 0; i < str.length(); i++) {
}
		return isPalindrome(str);
	}	
*/	
	public static boolean isPalindrome(CharSequence s) {
		int len = s.length();
		for(int i = 0; i < len / 2; i++) {
			if(s.charAt(i) != s.charAt(len - 1 - i))
				return false;
		}
		return true;
	}

private static boolean validPalindrome(String str) {
	int low = 0;
	int high = str.length() - 1;
	
	while(low < high) {
		if(str.charAt(low) == str.charAt(high)) {
			low++;
			high--;
		} else {
			if(isPalindrome(str.subSequence(low + 1, high+1))) {
				return true;
			}
			
			if(isPalindrome(str.subSequence(low, high ))) {
				return true;
			}
				return false;
			}
		}
	return true;
	}
}