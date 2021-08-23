package com.inhouse.leetcodeeasy;
// ways[i] = ways[i-1] + ways[i-2]

public class ClimbingStairs70 {

	public static void main(String[] args) {
		int n = 1;
		int noOfStairs = climbStairs(n);
		System.out.println(noOfStairs);
	}

	private static int climbStairs(int n) {
		if(n == 1) return 1;
		int dp[] = new int[n+1];
		dp[1] = 1;
		dp[2] = 2;
		
		for(int i = 3; i <= n; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		return dp[n];
	}
}
