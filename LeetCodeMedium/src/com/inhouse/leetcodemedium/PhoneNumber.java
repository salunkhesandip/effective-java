package com.inhouse.leetcodemedium;

import java.util.ArrayList;
import java.util.List;

/* 17. Letter Combinations of a Phone Number
 * 
 */
public class PhoneNumber {

	public static void main(String[] args) {
		String digits = "23";
		List<String> result = letterCombinations(digits);
		System.out.println(result);
	}

	private static List<String> letterCombinations(String digits) {
		List<String> result = new ArrayList<String>();
		if(digits.length() == 0) return result;
		
		String[] mapping = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		StringBuilder sb = new StringBuilder();
		letterCombinationsRecursive(result, digits, sb, 0, mapping);
		return result;
	}

	private static void letterCombinationsRecursive(List<String> result, String digits, StringBuilder prefix, int start, String[] mapping) {
		if(start == digits.length()) {
			result.add(prefix.toString());
			return;
		}
		
		String letters = mapping[digits.charAt(start) - '0'];
		for(int i = 0; i < letters.length(); i++) {
			StringBuilder sb = new StringBuilder().append(prefix).append(letters.charAt(i));
		 	letterCombinationsRecursive(result, digits,sb, start+1, mapping);
		}		
	}
}
