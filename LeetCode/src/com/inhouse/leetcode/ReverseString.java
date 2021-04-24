package com.inhouse.leetcode;

public class ReverseString {

	public static void main(String[] args) {
		char[] s = {'h','e','l','l','o'};
		String rev = reverseString(s);
		int len = s.length;
		System.out.println(rev);
		for(int i = 0; i < len; i++) {
			System.out.print(s[i]);
		}
	}

	private static String reverseString(char[] s) {
		int len = s.length;		
		for(int i = 0; i < s.length/2; i++) {
			char tmp = s[i];
			s[i] = s[len -1];
			s[len -1] = tmp;
			len --;
		}		
		return new String(s);
	}

}
