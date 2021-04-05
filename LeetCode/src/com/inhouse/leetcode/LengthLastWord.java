package com.inhouse.leetcode;

import java.util.StringTokenizer;

public class LengthLastWord {

	public static void main(String[] args) {
		String s = "Hello World o ";
		int len = lengthOfLastWord(s);
		System.out.println(len);
	}

	private static int lengthOfLastWord(String s) {
	int len = 0;
	boolean char_flag = false;
	
	for(int i = s.length() - 1; i > -1; i--) {
		if(Character.isLetter(s.charAt(i))) {
			char_flag = true;
			len++;
		} else {
			if(char_flag == true)
				return len;
		}
	}
	return len;
	}

	
	/*
	private static int lengthOfLastWord(String s) {
		String result[] = s.split(" ");
		if(result.length == 0)
			return 0;
		
		int last = result.length - 1;		
		return result[last].length();
	}
*/
	
}
