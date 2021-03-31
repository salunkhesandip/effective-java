package com.inhouse.leetcode;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesisEx {
	static HashMap<Character,Character> map = new HashMap<Character,Character>();
	
	public static void main(String[] args) {
		map.put(')', '(');
		map.put('}', '{');
		map.put(']', '[');

		String str="{()}";
		System.out.println(isValid(str));		
	}

	private static boolean isValid(String str) {
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
