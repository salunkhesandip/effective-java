package com.inhouse.leetcodemedium;

import java.util.Stack;

/* 394. Decode String
 * The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. 
 * Note that k is guaranteed to be a positive integer.
 * You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.
 */
public class DecodeString {

	public static void main(String[] args) {
		String s = "3[a2[c]]";
		String result = decodeString(s);
		System.out.println(result);
	}

	private static String decodeString(String s) {
		StringBuilder result = new StringBuilder();
		Stack<Integer> nums = new Stack<Integer>();
		Stack<StringBuilder> strs = new Stack<StringBuilder>();
		int cnt = 0;
		
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(Character.isDigit(ch)) {
				cnt = cnt * 10 + ch - '0';
			} else if(ch == '[') {
				nums.push(cnt);
				strs.push(result);
				cnt = 0;
				result = new StringBuilder();
			} else if(s.charAt(i) == ']') {
				StringBuilder sb = new StringBuilder(strs.pop());
				int k = nums.pop();
				for(int j = 0; j < k; j++)
					sb.append(result);
				result = sb;
			} else {
				result.append(ch);
			}
		}
		return result.toString();
	}
}

/*
private static String decodeString(String s) {
	 	String result = "";
		Stack<Integer> nums = new Stack<Integer>();
		Stack<String> strs = new Stack<String>();
		int cnt = 0;
		
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(Character.isDigit(ch)) {
				cnt = cnt * 10 + ch - '0';
			} else if(ch == '[') {
				nums.push(cnt);
				strs.push(result);
				cnt = 0;
				result = "";
			} else if(s.charAt(i) == ']') {
				StringBuilder sb = new StringBuilder(strs.pop());
				int k = nums.pop();
				for(int j = 0; j < k; j++)
					sb.append(result);
				result = sb.toString();
			} else {
				result += ch;
			}
		}
		return result;
}
*/
