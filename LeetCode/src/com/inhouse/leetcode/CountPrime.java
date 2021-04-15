package com.inhouse.leetcode;

public class CountPrime {

	public static void main(String[] args) {
		int num = 10;
		int result = countPrimes(num);	
		System.out.println(result);
	}

	// Sieve of Eratosthenes approach
	private static int countPrimes(int num) {
		if(num < 2)
			return 0;
		
		boolean [] numbers = new boolean[num];
		
		for(int p = 2; p <= (int)Math.sqrt(num); ++p) {
			if(numbers[p] == false) {
				for(int j = p*p; j < num; j += p) {
					numbers[j] = true;
				}
			}
		}
		
		int numOfPrime = 0;
		for(int i = 2 ; i < num; i++) {
			if(numbers[i] == false) {
				++numOfPrime;
			}
		}
		return numOfPrime;
	}
	/*
	private static int countPrimes(int num) {
		int cnt = 0;
		if(num < 2)
			return 0;
		else if(num >= 2)
		{
			for(int i = 2; i < num ; i++) {
				boolean result = isPrime(i);
				if(result == true) {
					cnt++;
				}
			}
		
		}		
		return cnt;
	}

	private static boolean isPrime(int num) {
		boolean prime = true;
		int remainder;
		
		for(int i = 2 ; i <= num /2 ; i++) {
			remainder = num % i;
			if(remainder == 0) {
				prime = false;
				break;
			}
		}
		return prime;
	}
*/
}
