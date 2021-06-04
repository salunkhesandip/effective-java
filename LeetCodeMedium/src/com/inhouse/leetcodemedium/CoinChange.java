
package com.inhouse.leetcodemedium;

import java.util.Arrays;

/* 322. Coin Change
 * You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.
 * Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
 * You may assume that you have an infinite number of each kind of coin.
 */
public class CoinChange {

	public static void main(String[] args) {
		int[] coins = {5,11,20};
		int amount = 35;
	
		int numOfCoins = coinChange(coins, amount);
		System.out.println(numOfCoins);
	}

	private static int coinChange(int[] coins, int amount) {
		Arrays.sort(coins);
		int[] dp = new int[amount + 1];
		Arrays.fill(dp, amount + 1);
		dp[0] = 0;
		
		for(int i = 0; i <= amount; i++) {
			for(int j = 0; j < coins.length; j++) {
				if(coins[j] <= i) {	
					dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
				} else
					break;
			}
		}
		return dp[amount] > amount ? -1 : dp[amount];
	}
}
