package com.inhouse.leetcode;

public class ReverseBits {

	public static void main(String[] args) { 
		String n = "11111111111111111111111111111101";
		int reverse =  reverseBits(n);

	}

	private static int reverseBits(String n) {
		int rev = 0;
		int power = 1;
		int j = 0;
		char[] arr = n.toCharArray();
		for(int i = 0 ; i < 32; i++) {
			power = (int) Math.pow(2,j);
			rev += Character.getNumericValue(arr[i])*power;
			j++;
		}
		System.out.println(rev);

		return rev;
		/*
		 *  int rev = 0;
        	for (int i = 0; i < 32; i++) {
            rev <<= 1;
            rev = rev | (n & 1);
            n >>= 1;
        }
        return rev;
		 */
	}

}
