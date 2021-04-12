package com.inhouse.leetcode;

public class MaxSubArrSum {

	public static void main(String[] args) {
		int arr[] = {11,-4, 4, 5, -1 , -5,};
		
		int maxsum = maxSubArraySum(arr);
		System.out.println(maxsum);
	}

	private static int maxSubArraySum(int[] arr) {
		int maxSoFar = arr[0];
		int curMax = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			curMax = Math.max(arr[i], curMax + arr[i]);
			maxSoFar = Math.max(maxSoFar, curMax);
			System.out.println(curMax + " : " + maxSoFar);
		}
		return maxSoFar;
	}



}
