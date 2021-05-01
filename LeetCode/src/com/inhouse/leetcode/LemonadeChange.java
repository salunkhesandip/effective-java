package com.inhouse.leetcode;

public class LemonadeChange {

	public static void main(String[] args) {
		int[] bills = {5,5,5,5,20,20,5,5,5,5};
		boolean result = lemonadeChange(bills);
		System.out.println(result);

	}

	private static boolean lemonadeChange(int[] bills) {
		int fives = 0;
		int tens = 0;
		
		for(int bill : bills) {
			if(bill == 5) {
				fives++;
			} else if(bill == 10) {
				if(fives == 0)
					return false;
				fives--;
				tens++;
			} else {
				if(fives > 0 && tens > 0) {
					fives--;
					tens--;
				} else if(fives >= 3) {
					fives -=3;
				} else {
					return false;
				}
			}
		}
		return true;
	}

}
