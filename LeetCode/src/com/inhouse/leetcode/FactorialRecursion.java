package com.inhouse.leetcode;

public class FactorialRecursion {

	public static void main(String[] args) throws InterruptedException {
		int result = 0;
		int num = 3;
		result = fact(num);
		System.out.println(result);
	}

	private static int fact(int num) throws InterruptedException {
		if(num == 1) return 1; // base case
			else 
		return num * fact(num - 1); // recursive case
	}
}
