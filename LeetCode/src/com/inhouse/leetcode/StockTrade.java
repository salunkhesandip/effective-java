package com.inhouse.leetcode;

public class StockTrade {

	public static void main(String[] args) {
		int[] prices = {1,2,3,4,5,1,10};
		int profit = maxProfit(prices);

	}

	private static int maxProfit(int[] prices) {
		int len = prices.length;
		int profit = 0;
		if(len == 1)
			return 0;
		
		for(int i = 0; i < len -1; i++) {
			
			if(prices[i] < prices[i+1]) {
				profit += prices[i+1] - prices[i];
			}				
		}
		return profit;
	}
}
