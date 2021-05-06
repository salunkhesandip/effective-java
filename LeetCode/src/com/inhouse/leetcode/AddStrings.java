package com.inhouse.leetcode;

public class AddStrings {

	public static void main(String[] args) {
		String num1 = "999", num2 = "99";
		String sum = addStrings(num1, num2);		
		System.out.println(sum);
	}
/*
	private static String addStrings(String num1, String num2) {
		int len1 = num1.length();
		int len2 = num2.length();
		StringBuilder sb = new StringBuilder();
		
		int maxlen = Math.max(len1, len2);
		int digit1 = 0, digit2 = 0;
		int j = len1 - 1;
		int k = len2 - 1;
		int sum = 0;
		int carry = 0;
		for(int i = maxlen; i > 0 ; i--) {			
			if(j > -1) {
				digit1 = Character.getNumericValue(num1.charAt(j));
			} else
				digit1 = 0;
			
			if(k > -1) {
				digit2 = Character.getNumericValue(num2.charAt(k));
			} else
				digit2 = 0;
			j--;
			k--;
			
			if(digit1 + digit2 + carry  > 9){
				sum = (digit1 + digit2 + carry) % 10;
				carry = 1;
			}
			else {
				sum = digit1 + digit2 + carry;
				carry = 0;
			}
			sb.append(sum);
		}
		
		if(carry != 0)
			sb.append(carry);
		return sb.reverse().toString();
	}
*/
	private static String addStrings(String num1, String num2) {
		StringBuilder sb = new StringBuilder();
		int p1 = num1.length() - 1;
		int p2 = num2.length() - 1;
		int carry = 0;
		
		while(p1 >= 0 || p2 >= 0) {
			
			int d1 = p1 >= 0 ? num1.charAt(p1) - '0' : 0;
			int d2 = p2 >= 0 ? num2.charAt(p2) - '0' : 0;
			int tmp = d1 + d2 + carry;
			int sum = tmp % 10;
			if(tmp > 9)
				carry = 1;
			else 
				carry = 0;
			sb.append(sum);
			p1--;
			p2--;			
		}
		if(carry != 0)
			sb.append(carry);
		
		return sb.reverse().toString();
	}
}
