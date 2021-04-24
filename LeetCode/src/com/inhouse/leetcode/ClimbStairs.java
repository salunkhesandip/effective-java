package com.inhouse.leetcode;

public class ClimbStairs {

	public static void main(String[] args) {
		int n = 6;
		int result = climbStairs(n);
		System.out.println(result);
	}

	private static int climbStairs(int n) {  // Dynamic Programming
	     if (n == 1) {
	            return 1;
	        }
	     /*
	        int[] dp = new int[n + 1];
	        dp[1] = 1;
	        dp[2] = 2;
	        for (int i = 3; i <= n; i++) {
	            dp[i] = dp[i - 1] + dp[i - 2];
	        }
	        return dp[n];
	      */ 
	     
	        int first = 1;
	        int second = 2;
	        for (int i = 3; i <= n; i++) {
	            int third = first + second;
	            first = second;
	            second = third;
	        }
	        return second;
	}

}
