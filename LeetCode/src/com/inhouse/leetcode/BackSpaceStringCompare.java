package com.inhouse.leetcode;

import java.util.Stack;

public class BackSpaceStringCompare {

	public static void main(String[] args) {
		String s = "abb#";
		String t = "ab";
		boolean result = backspaceCompare(s, t);	
		System.out.println(result);
	}

	private static boolean backspaceCompare(String s, String t) {
		int i = s.length() - 1;
		int j = t.length() - 1;
		int skipS = 0, skipT = 0;
		
		while(i >= 0 || j >= 0) {
			while(i >= 0) {
				if(s.charAt(i) == '#') {
					skipS++;
					i--;
				} else if(skipS > 0) {
					skipS--;
					i--;
				} else 
					break;
			}
			
			while(j >= 0) {
				if(t.charAt(j) == '#') {
					skipT++;
					j--;
				} else if(skipT > 0) {
					skipT--;
					j--;
				} else 
					break;
			}
			
			if(i >= 0 && j >= 0 && s.charAt(i) != t.charAt(j))
				return false;
			
			if((i >= 0) != (j >= 0))
				return false;
			i--;
			j--;
		}
		return true;
	}
/*
 * 
	private static boolean backspaceCompare(String s, String t) {
		//return build(s).equals(build(t));	
	}
	private static String build(String s) {
		Stack<Character> stack1 = new Stack<Character>();
		
		for(char ch: s.toCharArray()) {
			if(ch != '#')
				stack1.push(ch);
			else if(!stack1.empty())
					stack1.pop();			
		}
		return String.valueOf(stack1);
	} */
}
