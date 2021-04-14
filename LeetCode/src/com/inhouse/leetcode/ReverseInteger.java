package com.inhouse.leetcode;

public class ReverseInteger {

	public static void main(String[] args) {
		int x = 214748364; // 5 54 543 5432 54321
		int rev = reverse(x);
		System.out.println(rev);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
	}

	private static int reverse(int x) {
		int rev = 0;
		while(x != 0) {
			int pop = x % 10;
			x /= 10;

			if(rev > Integer.MAX_VALUE /10 || ( rev == Integer.MAX_VALUE/10 && pop > 7 ))
				return 0;
			
			if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) 
				return 0;
			rev = rev * 10 + pop; 
		}
		return rev;
	}

}
