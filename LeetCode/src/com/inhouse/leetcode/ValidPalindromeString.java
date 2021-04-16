package com.inhouse.leetcode;

public class ValidPalindromeString {

	public static void main(String[] args) {
		String str = "";
		boolean result = isPalindrome(str);
		System.out.println(result);
	}

	private static boolean isPalindrome(String str) {
        char[] charArr = str.toLowerCase().toCharArray();
		StringBuilder sb = new StringBuilder("");
		
		for(int i = 0; i < charArr.length; i++) {
			int ch = charArr[i] ;
			if((ch >= 97 && ch <= 122) || ((ch >= 48 && ch <= 57))){
				sb.append(charArr[i]);
			}
		}
		
        int len = sb.length();
		for(int i = 0; i < len / 2; i++) {
			if(sb.charAt(i) != sb.charAt(len - 1 - i))
				return false;
		}
		return true;
		}
}
