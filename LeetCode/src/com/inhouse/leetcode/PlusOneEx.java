package com.inhouse.leetcode;

public class PlusOneEx {

	public static void main(String[] args) {
		int[] digits = {9,9,9};
		int[] sum = plusOne(digits);
		for(int i = 0; i < sum.length; i++)
			System.out.println(sum[i]);
	}

	private static int[] plusOne(int[] digits) {
		if(digits.length == 0)
			return null;
		int lastIndex = digits.length - 1;
		int[] sum = new int[digits.length+1];
		
		if(digits[lastIndex] != 9) { // there is no carry over
			digits[lastIndex] = digits[lastIndex] +1;
			return digits;
		}
		
		if(digits[lastIndex] == 9) { // there is 1 carry on
			sum[lastIndex+1] = 0;
			digits[lastIndex] = 0;
			sum[0] = 1;
			int carry = 1;

			for(int i = lastIndex - 1 ; i > -1; i--) {
				int total = digits[i] + carry;
				if(total == 10) {
					sum[i+1] = 0;
					digits[i] = 0;
				} else {
					sum[i+1] = total;
					digits[i] = total;
					carry = 0;
				}
			} 
			if(carry == 1)
				return sum;
			else
				return digits;
		}
		return digits;
	}

}
