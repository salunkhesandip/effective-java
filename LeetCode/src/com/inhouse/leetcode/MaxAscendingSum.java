package com.inhouse.leetcode;

public class MaxAscendingSum {

	public static void main(String[] args) {
		int[] nums = {100,10,1};		
		int max = maxAscendingSum(nums);
		System.out.println(max);
	}
	
	private static int maxAscendingSum(int[] nums) {
		if(nums.length == 1)
			return nums[0];
		
		int max = 0;
		int sum = nums[0];
		
		for(int i = 0 ; i < nums.length - 1; i++) {
			if(nums[i] < nums[i+1]) {
				sum += nums[i+1];				
			} else {
				max = Math.max(max, sum);
				sum = nums[i+1];
			}
		}
		max = Math.max(max, sum);
		return max;				
	}
}