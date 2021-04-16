package com.inhouse.leetcode;

public class SquareRoot {

	public static void main(String[] args) {
		int x = 2147395600;
		int sqrrt = mySqrt(x);
		System.out.println(sqrrt);
	}

	private static int mySqrt(int x) {
		if(x == 0)
			return 0;
		
		if(x == 1)
			return 1;
		
		int product = 1;
		int sqrrt = 1;
		
		while(product <= x) {
			sqrrt++;
			product = sqrrt*sqrrt;
			if(product < 0) {
				break;
			}
		}
		return sqrrt -1;
	}

}
