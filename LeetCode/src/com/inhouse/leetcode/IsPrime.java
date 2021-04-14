package com.inhouse.leetcode;

public class IsPrime {

	public static void main(String[] args) {
		int num = 12;
		boolean isPrime = isPrimeNumber(num);
		System.out.println(num + " is PrimeNumber ? " + isPrime);
	}

	private static boolean isPrimeNumber(int num) {
		int remainder;
		boolean isPrime = true;
		
		for(int i = 2; i < num / 2 ; i++) {
			remainder = num % i;
			if(remainder == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

}
