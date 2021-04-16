package com.inhouse.leetcode;

public class Factorial {

	public static void main(String[] args) {
		int num = 15;
		int result = findTrailingZeros(num);
		System.out.println(result);
	}

	private static int findTrailingZeros(int num) {
		int count = 0 ;
		for(int i = 5; num/i >= 1; i*= 5) {
			count += num / i;
		}
		return count;
	}
}

/*
1! = 1
2! = 2
3! = 6
4! = 24
5! = 120
6! = 720
7! = 5040
8! = 40320
9! = 362880
10! = 3628800
11! = 39916800
12! = 479001600
13! = 6227020800
14! = 87178291200
15! = 1307674368000
*/