package com.inhouse.leetcode;

public class MaxProfit {

	public static void main(String[] args) {
		
		int[] prices = {7,6,8,3,1};
		int profit = maxProfit(prices);
		System.out.println(profit);
	}
/*
	private static int maxProfit(int[] prices) {
	       int maxprofit = 0;
	        for (int i = 0; i < prices.length - 1; i++) {
	            for (int j = i + 1; j < prices.length; j++) {
	                int profit = prices[j] - prices[i];
	                if (profit > maxprofit)
	                    maxprofit = profit;
	            }
	        }
	        return maxprofit;
	}
}
*/
	
	private static int maxProfit(int[] prices) {
		int minprice = Integer.MAX_VALUE;
		int maxprofit = 0;
		
		for (int i = 0; i < prices.length; i++) {
	    if (prices[i] < minprice)
	        minprice = prices[i];
	    else if (prices[i] - minprice > maxprofit)
	        maxprofit = prices[i] - minprice;
		}
		return maxprofit;
	}
}