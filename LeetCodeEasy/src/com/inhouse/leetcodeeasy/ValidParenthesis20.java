package com.inhouse.leetcodeeasy;

import java.util.HashMap;
import java.util.Stack;

/*
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct orde
 */
public class ValidParenthesis20 {

	public static void main(String[] args) {
		String str = "({}[])";
		boolean result = isValid(str);
		System.out.println(result);
	}

	private static boolean isValid(String str) {
	     HashMap<Character,Character> map = new HashMap<Character,Character>();
	        map.put(')', '(');
			map.put('}', '{');
			map.put(']', '[');
	        
	        Stack<Character> stack = new Stack<Character>();
			
			for(int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				
				if(map.containsKey(c)) {
					char topElement = stack.empty() ? '#' : stack.pop();
					
					if(topElement != map.get(c)) {
						return false;
					}				
				} else {
					stack.push(c);
				}
			}
			return stack.isEmpty();
	}
}
