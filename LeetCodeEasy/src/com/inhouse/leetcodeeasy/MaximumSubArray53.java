package com.inhouse.leetcodeeasy;
/*
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 * A subarray is a contiguous part of an array.
 */
public class MaximumSubArray53 {

	public static void main(String[] args) {
		
		int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
		int maxSoFar = nums[0];
		int curMax = -(int) Math.pow(10, 5);
		
		for(int i=0; i< nums.length; i++) {
			curMax = Math.max(nums[i], nums[i]+ curMax);
			maxSoFar = Math.max(maxSoFar, curMax);
		}
		
		System.out.println("Maximum Sum : " + maxSoFar);
	}
}
