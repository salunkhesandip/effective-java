package com.inhouse.leetcode;

public class MaxSubArrSum {

	public static void main(String[] args) {
		int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
		
		int maxsum = maxSubArraySum(arr);
		System.out.println(maxsum);
	}

	private static int maxSubArraySum(int[] arr) {
       	int maxSoFar = arr[0];
		int curMax =  (int) (-2 * Math.pow(10, 5));
		
		for(int i = 0; i < arr.length; i++) {
			curMax = Math.max(arr[i], curMax + arr[i]);
			maxSoFar = Math.max(maxSoFar, curMax);
		}
		return maxSoFar;
	}
}
