package com.inhouse.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class HappyNumber {

	public static void main(String[] args) {
		int n = 2;
		boolean result = isHappy(n);
		System.out.println(result);
	}

	private static boolean isHappy(int n) {
		int sum = 0;
		while(true) {
			while(n > 0) {
				int digit = n % 10;
				sum += Math.pow(digit, 2);
				n /= 10;
			}
			if(sum <= 9 && sum !=1 && sum != 7)
				return false;
			
			if(sum == 1 || sum == 7)
				break;
			else {
				n = sum;
				sum = 0;
				continue;
			}
		}
		return (sum == 1 ||sum == 7)? true:false;
	}
}
