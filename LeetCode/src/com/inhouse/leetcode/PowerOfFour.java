package com.inhouse.leetcode;

public class PowerOfFour {

	public static void main(String[] args) {
		int n  = 4;
		boolean result = isPowerOfFour(n);
		System.out.println(result);
	}

	private static boolean isPowerOfFour(int n) {
		if(n == 1 || n == 4)
			return true;
		
		if(n <= 3)
			return false;		

		while(n >= 4) {
			if(n % 4 != 0)
				return false;	
			n /= 4;
		}
		return (n == 1) ? true : false;
	}

}
