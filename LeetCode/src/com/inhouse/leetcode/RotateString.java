package com.inhouse.leetcode;

public class RotateString {

	public static void main(String[] args) {
		String str1 = "";
		String str2= "";
		
		boolean result = rotateString(str1, str2);
		System.out.println(result);
	}

	private static boolean rotateString(String str1, String str2) {
		int len1 = str1.length();
		int len2 = str2.length();
		
		if(len1 != len2)
			return false;
		
		if(len1 == 0)
			return true;
			
		StringBuilder sb = new StringBuilder(str1);			
		for(int i = 0; i < len1 - 1 ;i++) {
			sb.append(str1.charAt(i));
			sb.deleteCharAt(0);
			if(sb.toString().equals(str2))
				return true;
		}
		return false;
	}
}

// return str1.length() == str2.length() && (str1 + str2).contains(B);