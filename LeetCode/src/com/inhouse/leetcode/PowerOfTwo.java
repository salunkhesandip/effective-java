package com.inhouse.leetcode;

public class PowerOfTwo {

	public static void main(String[] args) {
		int n  = 16;
		boolean result = isPowerOfTwo(n);
		System.out.println(result);
	}

	private static boolean isPowerOfTwo(int n) {
		if(n <= 0)
			return false;
		
		if(n == 1)
			return true;

		while(n >= 2) {
			if(n % 2 != 0)
				return false;	
			n /= 2;
		}
		return true;
	}
}
