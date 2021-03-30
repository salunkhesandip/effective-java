package com.inhouse.leetcode;

public class PalindromeEx {

	public static void main(String[] args) {
		int x = 0110;
		boolean isPalindrome = isPalindrome(x);
		System.out.println(isPalindrome);
	}

	private static boolean isPalindrome(int x) {
		if(x < 0 ||(x%10==0 && x != 0))	// border cases negative number and ending with 0 is not palindrome
			return false;

		int rev = 0;
		while(x > rev) {
			rev = rev * 10 + x %10 ;
			x /= 10;
		}
		return (x == rev || x == rev/10);
		// middle digit doesn't matter for palindrome e.g. 12321 , after while loop x would be 12 and rev 123
		// hence divide rev by 10
	}
}
